package interview_practice.design_pattern.servicelocator.manager;

public interface ResourceManager<T> {
	
	T load(String path);
	T get(String key);
	void unload(String key);
}
