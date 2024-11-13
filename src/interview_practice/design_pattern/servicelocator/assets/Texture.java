package interview_practice.design_pattern.servicelocator.assets;

public class Texture {
	
	private String path;
	
	public Texture(String path) {
		this.path = path;
		System.out.println("Loading Texture from: "+path);
	}

}
