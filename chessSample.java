import java.util.*;
/*
class Super{
	void mov(int num);
}
class King extends Super{
	
}
class Queen extends Super{
	
}
class Rook extends Super{

}
class Bishop extends Super{

}
class Knight extends Super{

}
class Pawn extends Super{
	void currentPos(int arr){
		for(int)
	}
	void mov(int current){
		
	}
}
*/

class chessSample{
	static int i1 = 0;
	static int i2 = 1;
	static int count = 1;
	static boolean whiteTurn = true;
	static String blank = "[  ---  ]";
	public static void main(String[] args){
		Boolean noWin = true;
	//	String blank = "[  ---  ]";
		String pawn = "P";
		String white = "1";
		String black = "0";
		Scanner sc = new Scanner(System.in);
		String chessPieces[][] = new String[8][8];  
		chessPieces[0] = new String[]{"[  0R1  ]","[  0K1  ]","[  0B1  ]","[  0Q   ]","[  0K   ]","[  0B2  ]","[  0K2  ]","[  0R2  ]"};
		chessPieces[7] = new String[]{"[  1R1  ]","[  1K1  ]","[  1B1  ]","[  1K   ]","[  1Q   ]","[  1B2  ]","[  1K2  ]","[  1R2  ]"};
		
		for(int i = 0; i<chessPieces.length; i++){
			for(int j = 0; j<chessPieces[i].length; j++){
				
				if(i==6){
					chessPieces[i][j] = "[  "+white+pawn+(j+1)+"  ]";
				}
				else if(i==1){
					chessPieces[i][j] = "[  "+black+pawn+(j+1)+"  ]";
				}
				if(chessPieces[i][j]==null){
					chessPieces[i][j] = blank;
				}
			}

		}
		System.out.println();
                for(String[]row : chessPieces){
                	for(String element : row){

                                System.out.print(element+"  ");
                        }
                        System.out.println();
                        System.out.println();
                        }
		System.out.println();		
		
		//Moving the Pieces
		while(noWin){	
			Fetching(chessPieces);
			possibleMove(chessPieces);
			System.out.println();
               		for(String[]row : chessPieces){
                        	for(String element : row){

                                	System.out.print(element+"  ");
                        	}
                        	System.out.println();
                        	System.out.println();
                        }
                System.out.println();	
			System.out.print("Enter number of units to move : ");
			int unit = sc.nextInt();
			if(whiteTurn){
				unit = -unit;
				whiteTurn = false;
			}
			else{
				whiteTurn = true;
			}
	
	//*** Next Operation make separate functions for pawn,rook,knight,etc and set black turn white turn. ***

			if(chessPieces[i1+unit][i2]=="[   *   ]"){
				
				chessPieces[i1+unit][i2] = chessPieces[i1][i2];
				chessPieces[i1][i2] = blank;
				System.out.println(chessPieces[i1+unit][i2]);
			}
			else{
				System.out.println("Invalid move");
			}
			
			System.out.println();
                	for(int i=0; i<chessPieces.length; i++){
                        	for(int j=0; j<chessPieces[i].length; j++){
					if(chessPieces[i][j]=="[   *   ]"){
						chessPieces[i][j] = blank;
					}
                                        System.out.print(chessPieces[i][j]+"  ");
                        	}
                        	System.out.println();
                        	System.out.println();
                	}
			
			if(noWin == false){
				System.out.println("Well played!");
			}
			
			
		}
   	}
	static void Fetching(String[][]chessPieces){
		//Fetching the Pieces
		Scanner input = new Scanner(System.in);
		if(whiteTurn){
			System.out.println("White's turn");
		}
		else{
			System.out.println("Black's turn");
		}
                System.out.print("Enter a piece to move : ");
                String name = input.nextLine();

                Boolean equality = false;
                for(int i = 0; i<chessPieces.length; i++){
                        for(int j = 0; j<chessPieces[i].length; j++){
                                StringTokenizer obj = new StringTokenizer(chessPieces[i][j]," []");
                                String str = obj.nextToken();
                                if(str.equals(name)){
                                        i1 = i;
                                        i2 = j;
                                        equality = true;
                                        break;
                                }

                        }
                        if(equality){
                                break;
                        }

                }
	}
	static void possibleMove(String[][] chessPieces){
		int[][] arr = {};
		String currPiece = chessPieces[i1][i2];
		String piece = "X";
		System.out.println("Inside possibleMove");
		if(currPiece.contains("P")){
			piece = "P";
		}
		switch(piece){
			case "P":
						System.out.println("Inside case (P)");
						if(i1==6 ){
							System.out.println("Inside if");
							if(chessPieces[i1-1][i2]==blank && chessPieces[i1-2][i2]==blank){
								 arr = new int[][] {{i1-1,i2},{i1-2,i2}};	
							}
						}
						else if(i1==1){
							System.out.println("Inside else if");
							if(chessPieces[i1+1][i2]==blank && chessPieces[i1+2][i2]==blank){
								arr = new int[][] {{i1+1,i2},{i1+2,i2}};
							}
						}
				
						else{
							if(whiteTurn){
								arr = new int[][] {{i1-1,i2}};
							}
							else{
								arr = new int[][] {{i1+1,i2}};
							}
						}
			default : 
						System.out.println("Inside Switch");	
		}
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; ){
				String str = chessPieces[arr[i][j++]][arr[i][j++]];
				if(str==blank){
					j=0;
					chessPieces[arr[i][j++]][arr[i][j++]] = "[   *   ]";
					
				}
			}
		}
	}
}

