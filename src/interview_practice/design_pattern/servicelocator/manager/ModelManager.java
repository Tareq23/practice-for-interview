package interview_practice.design_pattern.servicelocator.manager;

import java.util.HashMap;
import java.util.Map;

import interview_practice.design_pattern.servicelocator.assets.Model;
import interview_practice.design_pattern.servicelocator.assets.Texture;

public class ModelManager implements ResourceManager<Model>{

	private Map<String, Model> models = new HashMap<>();
	
	@Override
	public Model load(String path) {
		Model model = new Model(path);
		models.put(path, model);
		return model;
	}

	@Override
	public Model get(String key) {
		// TODO Auto-generated method stub
		return models.get(key);
	}

	@Override
	public void unload(String key) {
		models.remove(key);
	}

}
