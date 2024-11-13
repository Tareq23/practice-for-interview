package interview_practice.design_pattern.servicelocator.assets;

public class Model {
	
	private String path;
	
	public Model(String path) {
		this.path = path;
		System.out.println("Loading Model from: "+path);
	}

}
