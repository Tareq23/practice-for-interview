package interview_practice.design_pattern.servicelocator.assets;

public class Audio {
	
	private String path;
	
	public Audio(String path) {
		this.path = path;
		System.out.println("Loading audio clip from: "+path);
	}

}
