class diamond{

	public static void main(String[] args){

		int row = 19;
		int spaces = 2;
		char ch1 = '$';
		char ch2 = ' ';
		int subfactor = spaces+1;
		int column = (row-1)*spaces+row;
		int row_mid = (row-1)/2;
		int column_mid = (column-1)/2;
		int left = column_mid;
		int right = column_mid;
		for(int i = 0;i <= row;i++){
				
			
			 
			System.out.println();
			for(int j = 0; j<= column; j++){
				
				if((i==0 || i==row)&&(left==column_mid && right==column_mid)){
					
					if(j==column_mid) System.out.print(ch1);
					else System.out.print(ch2);
				}
				else if(j%3 == 0 && j>=left &&j<=right){
					System.out.print(ch1);
				}
				else System.out.print(ch2);
			} 
			if(i<row_mid){

                        	left = left-subfactor;
                        	right = right+subfactor;
                        }
                        else if(i>=row_mid){

                                left = left+subfactor;
                                right = right-subfactor;
                        }
		}
		
	}
}
