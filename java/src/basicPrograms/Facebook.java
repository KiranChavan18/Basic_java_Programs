package basicPrograms;

public class Facebook {
	String ID;
	int PWD;
	
	public Facebook(String ID,int PWD) {
		this.ID=ID;
		this.PWD=PWD;
	}
	
	public void details() {
		System.out.println("Facebook ID is "+ID);
		System.out.println("Password is "+PWD);
	}
	
	public static void main(String[] args) {
		Facebook f1=new Facebook("Kiran@123",123456789);
		f1.details();
		
		System.out.println("---------------------------");
		
		Facebook f2=new Facebook("frds_cl_me_kd18",1988774453);
		f2.details();
		
	}
	
	
	

}
