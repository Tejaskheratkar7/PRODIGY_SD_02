import java.util.Scanner;
import java.lang.Math;

public class Gamer {

	public static void main(String[] args) {
		
		int num=(int) (Math.random()*100);
		int chances=7;
		for(int i=chances;i<chances+1;i--) {
			if(i>0) {
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter a number(0 to 100):");
			int input=obj.nextInt();
			
				if(input > num && chances>0) {
					System.out.println("Your Choice Is Too High !!!");
					chances=chances-1;
					System.out.println("\nChances Left:"+chances);
				}
				else if(input == num && chances>0){
					System.out.println("\nWONDERFUL YOU JUST WON THE GAME!!!");
					
				}
				else{
					System.out.println("Your Choice Is Too Low !!!");
					chances=chances-1;
					System.out.println("\nChances Left:"+chances);
				}
			}
			else {
				System.out.println("GAME OVER,BETTER LUCK NEXT TIME !!!");
				System.out.println("\nYOU HAVE EXHAUSTED WITH YOUR ATTEMPS "+chances);
				
				
				break;
				
			}
		}

	}

}
