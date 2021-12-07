package model;

import util.FileUtils;

public class Poem {
	private String filePath;
	private String text;

	public Poem(String filePath) {
		this.filePath = filePath;
		this.text = FileUtils.getFileContents(filePath);
	}

	public Poem(String filePath, String text) {
		this.filePath = filePath;
		this.text = text;
	}

	public String getFilePath() {
		return filePath;
	}

	public String getText() {
		return text;
	}

	public boolean contains(String keyword) {
		return getText().contains(keyword);
	}
}
