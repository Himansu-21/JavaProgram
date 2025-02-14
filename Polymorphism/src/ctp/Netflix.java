package ctp;

class Netflix {

	static void login(String email,int password) {
		System.out.println("Logged in using email and password");
	}

	static void login(int contactNo,int otp) {
		System.out.println("Logged in using contact and otp");
	}

	public static void main(String[] args) {

		login("Will@gmail.com", 29381);
		System.out.println("------------");
		Netflix.login(9882930, 4473);
	}
}
