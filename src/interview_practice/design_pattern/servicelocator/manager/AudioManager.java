package interview_practice.design_pattern.servicelocator.manager;

import java.util.HashMap;
import java.util.Map;

import interview_practice.design_pattern.servicelocator.assets.Audio;
import interview_practice.design_pattern.servicelocator.assets.Model;
import interview_practice.design_pattern.servicelocator.assets.Texture;

public class AudioManager implements ResourceManager<Audio>{

	private Map<String, Audio> audios = new HashMap<>();
	
	@Override
	public Audio load(String path) {
		Audio audio = new Audio(path);
		audios.put(path, audio);
		return audio;
	}

	@Override
	public Audio get(String key) {
		// TODO Auto-generated method stub
		return audios.get(key);
	}

	@Override
	public void unload(String key) {
		audios.remove(key);
	}

}
