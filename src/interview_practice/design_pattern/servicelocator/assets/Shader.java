package interview_practice.design_pattern.servicelocator.assets;

public class Shader {
	
	private String path;
	
	public Shader(String path) {
		this.path = path;
		System.out.println("Loading Shader from: "+path);
	}

}
