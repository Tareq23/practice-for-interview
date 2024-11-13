package interview_practice.design_pattern.servicelocator.manager;

import java.util.HashMap;
import java.util.Map;

import interview_practice.design_pattern.servicelocator.assets.Texture;

public class TextureManager implements ResourceManager<Texture>{

	private Map<String, Texture> textures = new HashMap<>();
	
	@Override
	public Texture load(String path) {
		Texture texture = new Texture(path);
		textures.put(path, texture);
		return texture;
	}

	@Override
	public Texture get(String key) {
		// TODO Auto-generated method stub
		return textures.get(key);
	}

	@Override
	public void unload(String key) {
		textures.remove(key);
	}

}
