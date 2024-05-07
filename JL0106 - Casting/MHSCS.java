public class MHSCS 
{
  // METHOD FOR CLEARING THE TERMINAL
  // CALL WITH  " MHSCS.clearScreen(); "
  // IT ALSO ADDS A "BANNER"
  // AND SKIPS A LINE
  public static void clearScreen()
  {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();
    System.out.println("====================\n");  
  }
  
  // METHOD FOR LINE SPACING AT END OF PROGRAM
  // CALL WITH  " MHSCS.endProgram(); "
  // IT ALSO ADDS A "BANNER"
  // AND SKIPS A LINE
  public static void endProgram()
  {  
    System.out.println("\n====================\n");  
  }    
}
