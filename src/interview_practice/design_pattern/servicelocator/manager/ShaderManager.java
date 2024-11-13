package interview_practice.design_pattern.servicelocator.manager;

import java.util.HashMap;
import java.util.Map;

import interview_practice.design_pattern.servicelocator.assets.Model;
import interview_practice.design_pattern.servicelocator.assets.Shader;
import interview_practice.design_pattern.servicelocator.assets.Texture;

public class ShaderManager implements ResourceManager<Shader>{

	private Map<String, Shader> shaders = new HashMap<>();
	
	@Override
	public Shader load(String path) {
		Shader shader = new Shader(path);
		shaders.put(path, shader);
		return shader;
	}

	@Override
	public Shader get(String key) {
		// TODO Auto-generated method stub
		return shaders.get(key);
	}

	@Override
	public void unload(String key) {
		shaders.remove(key);
	}

}
