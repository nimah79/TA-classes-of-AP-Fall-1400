package util;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class FileUtils {
	private static List<String> absolutePath = new ArrayList<>();

	public static String getFileContents(String filePath) {
		StringBuilder content = new StringBuilder();
		try {
			FileReader fr = new FileReader(filePath);
			int data;
			while ((data = fr.read()) != -1)
				content.append((char) data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return content.toString();
	}

	public static List<String> getDirectoryFilesList(String dir) {
		File[] directoryFiles = new File(dir).listFiles();
		if (directoryFiles != null) {
			for(File file : directoryFiles){
				if (file.isFile()) {
					absolutePath.add(file.getAbsolutePath());
				}
				else {
					getDirectoryFilesList(file.getAbsolutePath());
				}
			}
		}
		return absolutePath;
	}

}
