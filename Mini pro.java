import java.util.Scanner;
class signin
{
	private String username;
	private String password;
	private long mobilenumber;
 signin(String username, String password,long mobilenumber)
	{
		this.username=username;
		this.password=password;
		this.mobilenumber=mobilenumber;
	}
	String getusername()
	{
	return username;
	}
	String getpassword()
	{
	return password;
	}
	long getmobilenumber()
	{
	return mobilenumber;
	}
}
class signup
{

	private String username;
	private String password;
	private long mobilenumber;
	
	signup(String username, String password,long mobilenumber)
	{
		this.username=username;
		this.password=password;
		this.mobilenumber=mobilenumber;
	}
	String getusername()
	{
	return username;
	}
	String getpassword()
	{
	return password;
	}
	long getmobilenumber()
	{
	return mobilenumber;
	}
}
class test
{
public static void main (String[]args)
{
Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1 for signin ");
	System.out.println("Enter 2 for signup");
int n=sc.nextInt();
	switch(n)	
	{
	case 1:
	System.out.println("Enter valid information");
	signin s=new signin(sc.next(),sc.next(),sc.nextLong());
	System.out.println(s.getusername+" "+s.password+" "+s.mobilenumber);
	System.out.println("your sigin Successfully");
	break;

	case 2:
	System.out.println("Enter valid information");
	signup s1=new signup(sc.next(),sc.next(),sc.nextLong());
	System.out.println(s1.username+" "+s1.password+" "+s1.mobilenumber);
	System.out.println("your signup Successfully");
	break;
	default:
		System.out.println("Invalid Input");
	}
}
}


	
