package interview_practice.solid_principle.LSP.solution;

import interview_practice.solid_principle.LSP.SocialMedia;

public class Client {
	
	
	private static SocialMediaManager socialMediaManager;
	private static SocialVideoCallManager callManager;
	
	
	public static void main(String[] args)
	{
//		SocialMediaManager socialMedia;
		
		socialMediaManager = new Facebook();
		
		
		callManager = new Facebook();
		callManager.groupVideoCall("user1","user2", "user3");
		
		callManager = new Whatsapp();
		callManager.groupVideoCall("check1", "check2", "check3");
		

	}
}
