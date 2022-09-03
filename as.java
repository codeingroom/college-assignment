import java.util.Scanner;
import java.io.*;
class as{
	static final double pai=Math.PI;
	static Scanner inp=new Scanner(System.in);
	static void mainp(){
		Scanner inp=new Scanner(System.in);
		System.out.println("\n[1] Find Area Of Circle  [2] Find Perimeter Of Rectangle  [3] Find Area of Cone");
		System.out.print("Choose Options : ");
		int value=inp.nextInt();
		if(value==1){
				  aoc();
		}else if(value==2){
			por();
		}else if(value==3){
			  cone();
		}
	}
	static void aoc(){
		System.out.println("\n==============================");
		System.out.print("Enter Radius Value : ");
		double value=inp.nextDouble();
		
		double ans=pai*(value*value);
		System.out.println("Your Area Of Circle is : "+ans);
		System.out.println("\n====================================");
		System.out.print("If You Want To Find again Area of Circle So\nPress 1 and If You Want to go back to the\nProgram So Press 2 and If You Want to Exit this Program So Press 3 : ");		
		int vl=inp.nextInt();
		if(vl==1){
			   aoc();
		}else if(vl==2){
			System.out.println("======================================");
					  mainp();
		}else if(vl==3){
			System.out.println("======================================");
			System.out.println("Thank You For Using This Program");
			System.out.println("======================================");
		}else{
			System.out.print("Some thing is Wrong");
		}
	}
	static void por(){
		   System.out.println("\n==============================");
		   System.out.print("Enter Length Value : ");
		   double ln=inp.nextDouble();
		   System.out.print("Enter Width Value : ");
		   double wt=inp.nextDouble();
		   double ans=2*(ln+wt);
		   System.out.println("Your Perimeter of Rectangle is : "+ans);
		   System.out.println("\n====================================");
		System.out.print("If You Want To Find again Perimeter of Rectangle So\nPress 1 and If You Want to go back to the\nProgram So Press 2 and If You Want to Exit this Program So Press 3 : ");		
		int vl=inp.nextInt();
		if(vl==1){
			   por();
		}else if(vl==2){
			System.out.println("======================================");
					  mainp();
		}else if(vl==3){
			System.out.println("======================================");
			System.out.println("Thank You For Using This Program");
			System.out.println("======================================");
		}else{
			System.out.print("Some thing is Wrong");
		}
		   
	}
	static void cone(){
		 System.out.println("\n==============================");
		   System.out.print("Enter Radius Value : ");
		   double rd=inp.nextDouble();
		   System.out.print("Enter Height Value : ");
		   double ht=inp.nextDouble();
		   double hts = Math.sqrt(rd * rd + ht * ht);
		   double ans1=(pai*rd*rd)+(pai*rd*hts); //this is a Formula of Area of cone
		   System.out.println("Your Area of Cone is : "+ans1);
		   System.out.println("\n====================================");
		      System.out.println("\n====================================");
		System.out.print("If You Want To Find again Area of Cone So\nPress 1 and If You Want to go back to the\nProgram So Press 2 and If You Want to Exit this Program So Press 3 : ");		
		int vl=inp.nextInt();
		if(vl==1){
			   cone();
		}else if(vl==2){
			System.out.println("======================================");
					  mainp();
		}else if(vl==3){
			System.out.println("======================================");
			System.out.println("Thank You For Using This Program");
			System.out.println("======================================");
		}else{
			System.out.print("Some thing is Wrong");
		}
	}
	
	public static void main(String arg[]){
			mainp();
			//System.out.print(pai);
			
	}
}