import java.util.Scanner;
import java.io.LineNumberReader;
import java.io.FileReader;
import java.io.IOException;


public class Project
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        char selection = 'a';
      
        Team theTeam = new Team();
      
     while (selection != 'Q')
        {
            System.out.println();
            System.out.println("  Welcome to Split-it ");
            System.out.println("\n\n\t About (A)");
            System.out.println("\t Create Project (C)");
            System.out.println("\t Enter Votes (V)");
            System.out.println("\t Show Project (S)");
            System.out.println("\t Quit (Q)");
            System.out.print("\n\n\t Please choose an option: ");
            selection = scan.next().charAt(0);
      
         
            switch (selection)
            {
                case 'A':
                    System.out.println("\n\t Split-it is a unique project allowing its users to allocate credit evenly.");
                    break;
                
                case 'C':
                     theTeam.addnew(scan);
                    continue;
              
                case 'V':
                     continue;
                
                case 'S':
                     continue;
                
                default:
                    System.out.println("Wrong input, please try again."); 
                continue;
            }
       break;
        }
        System.out.println("\n\tPROGRAM ENDED\n");
        
    }
}
