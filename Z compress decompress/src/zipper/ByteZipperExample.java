package zipper;

import java.util.Random;

import com.github.luben.zstd.Zstd;

public class ByteZipperExample {

	public static void main(String[] args) {
		Random random = new Random();
		int TOTAL = 999000;

		// Preparing input
		byte[] inputByteArray = new byte[TOTAL];
		for (int i = 0; i < TOTAL; i++) {
			inputByteArray[i] = (byte) random.nextInt(127);
		}
		System.out.println("i : " + inputByteArray.length);

		// compression
		byte[] compressedByteArray = Zstd.compress(inputByteArray);
		System.out.println("c : " + compressedByteArray.length);

		// decompression
		byte[] decompressedByteArray = Zstd.decompress(compressedByteArray, 1000000);
		System.out.println("d : " + decompressedByteArray.length);

	}

}
