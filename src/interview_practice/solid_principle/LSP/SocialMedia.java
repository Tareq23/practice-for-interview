package interview_practice.solid_principle.LSP;

public abstract class SocialMedia {
	
	// @support whatsapp, facebook, instagram
	public abstract void chatWithFriend();
	
	
	// @support facebook, instagram
	public abstract void publishPost(Object object);
	
	
	// @support facebook, instagram, whatsapp
	public abstract void sendPhotoAndVideos();
	
	// @support facebook, whatsapp
	public abstract void groupVideoCall(String... users);
	

}
