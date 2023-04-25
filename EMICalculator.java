import java.util.*;
class EMICaluclator {
    public static void main(String[] args) {
	//create Scanner class instance
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please enter loan amount");
	int p = Integer.parseInt(scan.nextLine());
	
	System.out.println("Please enter rate of interest per annum");
	double pa = Double.parseDouble (scan.nextLine());
	
	System.out.println("Please enter tenure in months");
	int n= Integer.parseInt(scan.nextLine());
	
	//convert rate of Interest from per annum to per months
	double r = pa / 12 / 100;
	
	//caluclate emi
	double emi = p * r * Math.pow((1+r), n) / (Math.pow((1+r), n) -1);
	System.out.println("EMI is :" +emi);
	
	}
}