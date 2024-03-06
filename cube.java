import java.io.*;
class Cube{

	public static void main(String[] args)throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size of your cube(recommended size 7-20): "); //No. of rows
		int row = Integer.parseInt(input.readLine());
		int row_mid = (row+1)/2;
		int row_total = row+(row_mid-1);
		int column = row;
		int column_mid = (column+1)/2;
		int column_total = row_total;
		char ch = 'x';
		int arm1 = 2;
		int arm2 = column+1;
		int arm3 = row+1;
		int arm4 = column+1;	
		int up_right_counter = 2;
		int bottom_left_counter = 2;
		int bottom_right_counter = row+1;
		
		for(int i = 1; i<=row_total; i++){
			if(i==1){
				System.out.println();
			}
			System.out.print("    ");
			for(int j = 1; j<=column_total; j++){
				if((i==1 || j==1 || i==row || j==column)&&(i<=row && j<=column)){
					System.out.print(ch+" ");
				}
				else if(i<=row_mid && i==arm1 && j==arm1){
					
					System.out.print(ch+" ");
					arm1++;
				}	
				else if(i<=row_mid && i==up_right_counter && j==arm2){
					System.out.print(ch+" ");
					arm2++;
					up_right_counter++;
				}
				else if((i==row_mid || j==column_mid || i==row_total || j==column_total ) && (i>=row_mid && j>=column_mid)){
					System.out.print(ch+" ");
				}
				else if(i>row && i==arm3 && j==bottom_left_counter){
					System.out.print(ch+" ");
					arm3++;
					bottom_left_counter++;
				}
				else if(i>row && i==bottom_right_counter && j==arm4){
					System.out.print(ch+" ");
					arm4++;
					bottom_right_counter++;
					
				}
				else{
					System.out.print("  ");
				}
				
			}
			if(i==row_total){System.out.println();}
			System.out.println();
		}
	}
}
