package repositories;

import java.util.*;
import java.util.Map.Entry;

import model.Poem;

public class PoemRepository {
	private Map<String, Poem> poems = new HashMap<>();

	public PoemRepository() {
	}

	public PoemRepository(List<String> files) {
		this.addFiles(files);
	}

	public void addPoem(Poem poem) {
		poems.put(poem.getFilePath(),poem);
	}

	public void addPoems(List<Poem> poems) {
		for (Poem poem: poems) {
			this.poems.put(poem.getFilePath(), poem);
		}
	}

	public void addFiles(List<String> files) {
		for (String file: files) {
			poems.put(file,new Poem(file));
		}
	}

	public Map<String, Poem> getPoems() {
		Map<String,Poem> getPoemsMap = new HashMap();
		getPoemsMap.putAll(poems);
		return getPoemsMap;
	}

	public Map<String, Poem> search(String keyword) {
		Map<String, Poem> searchedPoems = new HashMap<>();
		for (String key : poems.keySet()) {
			if (poems.get(key).contains(keyword)){
				searchedPoems.put(key, poems.get(key));
			}
		}
		return searchedPoems;
	}
}
