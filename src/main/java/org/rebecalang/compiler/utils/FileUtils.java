package org.rebecalang.compiler.utils;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileUtils {
	public static File createTempFile(String test) throws IOException {
		File model = File.createTempFile("AfraTest", ".tmp");
		RandomAccessFile raf = new RandomAccessFile(model, "rw");
		raf.writeBytes(test);
		raf.close();
		return model;
	}
	
}