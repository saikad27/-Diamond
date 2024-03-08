import java.util.Scanner;	//for Scanner input
import java.io.*;		//for BufferedReader input
class diamond{

	public static void main(String[] args)throws IOException{
		Scanner scanin = new Scanner(System.in);
		BufferedReader buffin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter size of the diamond(size must be odd integer) : ");
		int row = scanin.nextInt();
		if(row%2==0){
			System.out.println("Invalid size");
			System.exit(0);
		}
		int spaces = 2;
		System.out.print("Enter your preferred character for the diamond or press 'd' to go with the default character: ");
		char ch1 = (char)buffin.read();
		if(ch1=='d' ||ch1=='D'){ch1 = '*';}		
		buffin.skip(1);		//to skip the \n stuck in the buffer
		System.out.print("Press any number to proceed: ");
		int sample = buffin.read();	//this input has nothing to do with our diamond
		char ch2 = ' ';
		int subfactor = spaces+1;
		int column = (row-1)*spaces+row;
		int row_mid = (row+1)/2;
		int column_mid = (column-1)/2;
		int left = column_mid;
		int right = column_mid;
		for(int i = 1;i <= row;i++){
				
			if(i==1){System.out.println();}
			System.out.print("    ");
			for(int j = 0; j<= column; j++){
				
				if((i==0 || i==row)&&(left==column_mid && right==column_mid)){
					
					if(j==column_mid) System.out.print(ch1);
					else System.out.print(ch2);
				}
				else if(j%3==0 && j>=left && j<=right){
					System.out.print(ch1);
				}
				else System.out.print(ch2);
			}
			System.out.println(); 
			if(i<row_mid){

                        	left = left-subfactor;
                        	right = right+subfactor;
                        }
                        else if(i>=row_mid){

                                left = left+subfactor;
                                right = right-subfactor;
                        }
			if(i==row){System.out.println();}
		}
		
	}
}
