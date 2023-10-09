package interview_practice.solid_principle.LSP.solution;

public class Facebook implements SocialMediaManager, SocialPostManager, SocialVideoCallManager{

	@Override
	public void groupVideoCall(String... users) {
		System.out.print("facebook group call: "+users.length);
	}

	@Override
	public void publishPost(Object object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void chatWithFriend() {
		System.out.println("Facebook chat");
	}

	@Override
	public void sendPhotoAndVideos() {
		// TODO Auto-generated method stub
		
	}

}
