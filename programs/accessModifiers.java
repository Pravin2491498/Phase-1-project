package programs;

public class accessModifiers 
{
	  void display() 
	     { 
	         System.out.println("You are using defalut access specifier"); 
	     } 
         public static void main(String[] args) 
         {
			//default
			System.out.println("Dafault Access Specifier");
			accessModifiers obj = new accessModifiers(); 		  
	        obj.display(); 

		}
	}



