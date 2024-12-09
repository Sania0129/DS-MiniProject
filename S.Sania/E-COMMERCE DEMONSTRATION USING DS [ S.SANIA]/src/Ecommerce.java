import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
public class Ecommerce
{
	public static void main(String[] args) 
	{
		String[] men=new String[5];
		ArrayList<String> stringList = new ArrayList<>();  
		Stack<String> kidsStack = new Stack<String>();		
		Boolean ch=true;
		boolean out=true;
		int point = 0;
		String[] cart=new String[15];
		Scanner sc=new Scanner(System.in);
		while(ch)		
			{
				System.out.println("---------------------------------------------- ");
				System.out.println("         ******************                 ");
				System.out.println("E-Commerce Demonstration using DataStructures");
				System.out.println("         ******************                 ");
				System.out.println("---------------------------------------------- ");
				System.out.println("Welcome to E-Commerce Kart");
				System.out.println("                                 ");
				System.out.println("1. Login as Administrator to add Products to inventory");
				System.out.println("2. Login as User to purchase Products from inventory");
				System.out.println("3. Exit");
				System.out.println("Enter Your Choice");
				int choice=sc.nextInt();
				switch(choice)
	{
		case 1: System.out.println("Enter Admin Username and Password to login");
				String username1=sc.next();
				String password1=sc.next();				
				if(username1.equals("admin") && password1.equals("admin"))
				{
					System.out.println("--------Welcome Admin---------");					
					System.out.println("Enter 5 Products for Men");
					for(int i=0;i<5;i++){
						 men[i]=sc.next(); 
						 while(i==4)
						 {
							System.out.println("You have successfully added Products for Men...!!!");
							i=i+1;
						 }
					}	
					System.out.println("");				
						System.out.println("Now Enter 5 Products for Women");
                           for(int i=0;i<5;i++){
                            String wom = sc.next();  
                            stringList.add(wom);
							while(i==4)
						 {
							System.out.println("You have successfully added Products for Women...!!!");
							i=i+1;
						 }
					}
					System.out.println("");					
					System.out.println("Now Enter 5 Products for Kids");
					for(int i=0;i<5;i++){
						String kid = sc.next();
						kidsStack.push(kid);
						while(i==4)
						 {
							System.out.println("You have successfully added Products for KIds...!!!");
							i=i+1;
						 }						
					}
						
				}
				else
				{
					System.out.println("Invalid Login Credentials. Please try again.");
				}
				break;
		case 2:
			System.out.println("Enter customer Username and Password to login");
			String user=sc.next();
			String pass=sc.next();
			if(user.equals("user1") && pass.equals("pass1"))
			
				{
				while(out==true)
					{
						System.out.println("Select the category you want to purchase for:");
						System.out.println("1. Men");
						System.out.println("2. Women");
						System.out.println("3. Kids");
						System.out.println("4. View remaining Products");						
						System.out.println("5. Exit");
						System.out.println("Enter your Choice");
						int ch1=sc.nextInt();
						if(ch1==1)
							{
				 			System.out.println("Select Men product by number to purchase..");
							int ch2=sc.nextInt();							
				 if(men[ch2]==null)
				 {
					 System.out.println("This product already purchased. Please select another product.");					 
				 }
				 else
				 {
					 System.out.println("Successfully Purchased..!!"); 
				 }
				 
				 men[ch2]=null;
				
				 
				}
				else if(ch1==2)
				{
				 System.out.println("Select Women product by number to purchase..");
				 int ch2=sc.nextInt();
                 System.out.println("Successfully Purchased..!!"); 			 
				 if(stringList.isEmpty())
				 {
					 System.out.println("There are no more Products for women to purchase");					 
				 }
				 else 
                  {
                    stringList.remove(ch2);
                 }                              							 			 
				 
				}
				else if(ch1==3)
				{
				 System.out.println("Select kids product to purchase..");
				 int ch2=sc.nextInt();
				 System.out.println("Successfully Purchased..!!"); 			 
				 if(kidsStack.isEmpty())
				 {
					 System.out.println("There are no more Products for Kids to purchase");					 
				 }
				 else 
                  {
                    kidsStack.pop();
                 }
						
				}
				else if(ch1==4)
				{
					System.out.println("Products remaining for Men Are:");
					for(int i=0;i<5;i++)
					{
						 System.out.println(i+"."+men[i]); 
					}
					System.out.println("Products remaining for WoMen Are:");
					for(int i=0;i<1;i++)
					{
						 System.out.println(stringList);
					}
					System.out.println("Products remaining for kids Are:");
					for(int i=0;i<1;i++)
					{
						System.out.println(kidsStack);
					}
				
				}
				
				else if(ch1==5)
					{
						out=false;
						break;
					}
				
				else
				{
					System.out.println("Wrong Choice. Please try again.");
				}
				}
			}
			else
			{
				System.out.println("Invalid username or password. Please try again");
				break;
			}
		case 3:  ch=false;
				  break;
		default: System.out.println("Invalid option. Please try again."); 
		}
	     }
		 
	}
	
}
