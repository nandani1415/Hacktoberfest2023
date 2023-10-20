//Example to Handle Exceptions Using Try Catch
//Example Multiple Catch Block
import java.io.*;
class example2
{  public static void main(String args[])
   {   boolean error;
	   do{
	   try{
	   DataInputStream KB=new DataInputStream(System.in);
       System.out.print("Enter First No:");
       int x=Integer.parseInt(KB.readLine());
       System.out.print("Enter Second No:");
       int y=Integer.parseInt(KB.readLine());
       int z=x/y;
       System.out.println("Result is:"+z);
       error=false;
  }catch(IOException e)
  { System.out.println("Error:"+e.getMessage());
    error=true;
	  }
catch(ArithmeticException e)
{System.out.println("Error:"+e.getMessage());
	error=true;
	}
catch(NumberFormatException e)
{System.out.println("Error:"+e.getMessage());
	error=true;
	}
}while(error);
	   }
 }
