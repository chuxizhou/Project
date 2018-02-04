import java.util.Scanner;

public class Team
{
  Scanner scan = new Scanner(System.in);
  String name;
  //-----------------------------------------------------------------
  // Constructor - assigns the argument as the name of the project
  //-----------------------------------------------------------------
  public void addnew(Scanner scan)
  {
                    System.out.print("\nEnter the project name: ");
                    String name = scan.next();
                                     
                    System.out.print("\nEnter the number of team members: ");
                    int num = scan.nextInt();
                   
                
                    for (int i = 1; i <= num; i++)
                    {System.out.print("\n\tEnter the name of team member " + i + ": ");
                      String tm = scan.next();}
                    
                    System.out.print("\n\nPress any key to return to the main menu:");
                    String anykey = scan.next();
    

                //               
                //    try 
                //    {
                //    int read = System.in.read(new byte[2]);
                //   } 
                //
                //    catch (IOException e)                     
                //    {
                //    e.printStackTrace();
                //   } 
  } 
  
 
}  
   

    
