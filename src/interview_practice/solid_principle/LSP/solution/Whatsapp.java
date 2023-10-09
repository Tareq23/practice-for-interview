package interview_practice.solid_principle.LSP.solution;

public class Whatsapp implements SocialMediaManager, SocialVideoCallManager{

	@Override
	public void groupVideoCall(String... users) {
		for(String user : users) {
			System.out.print(user+", ");
		}
	}

	
	@Override
	public void chatWithFriend() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendPhotoAndVideos() {
		// TODO Auto-generated method stub
		
	}

}
