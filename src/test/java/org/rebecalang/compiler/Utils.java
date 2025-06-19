package org.rebecalang.compiler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Utils {
	public static File createTempFile(String test) throws IOException, FileNotFoundException {
		File model = File.createTempFile("AfraTest", ".tmp");
		RandomAccessFile raf = new RandomAccessFile(model, "rw");
		raf.writeBytes(test);
		raf.close();
		return model;
	}
}