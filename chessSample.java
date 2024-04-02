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
	public static void main(String[] args){
		Boolean userChoice = true;
		
		String pawn = "P";
		Scanner sc = new Scanner(System.in);
		String chessPieces[][] = new String[8][8];  
		chessPieces[0] = new String[]{"[ Rook ]","[Knight]","[Bishop]","[Queen ]","[ King ]","[Bishop]","[Knight]","[ Rook ]"};
		chessPieces[7] = new String[]{"[ Rook ]","[Knight]","[Bishop]","[ King ]","[Queen ]","[Bishop]","[Knight]","[ Rook ]"};
		
		for(int i = 0; i<chessPieces.length; i++){
			for(int j = 0; j<chessPieces[i].length; j++){
				
				if(i==1 || i==6){
					chessPieces[i][j] = "[  "+pawn+(j+1)+"  ]";
				}
			}

		}
	/*	temp = chessPieces[4][3];
		chessPieces[4][3] = chessPieces[6][3];
		chessPieces[6][3] = temp;
	*/
		
		System.out.println();		
		for(String[]row : chessPieces){
			for(String element : row){
				
				if(element==null){
					System.out.print("[  --  ]  ");
				}
				else{
					System.out.print(element+"  ");
				}
			}
			System.out.println();
			System.out.println();
		}
	/*	//Fetching the Pieces
		System.out.println("Enter a pawn to move : ");
		String name = sc.nextLine();
			
		int unit;
		int i1 = 1;
		int i2 = 2;
		Boolean equality = false;
		for(int i = 0; i<chessPieces.length; i++){
			for(int j = 0; j<chessPieces[i].length; j++){
				StringTokenizer obj = new StringTokenizer(chessPieces[i][j]," []");
				String str = obj.nextToken(); 	
				System.out.println(str);
				if(str.equals(name)){
					i1 = i;
					i2 = j;	
					
					System.out.println("Success!");
					equality = true;
					break;
				}
			
			}
			if(equality){
				break;
			}
				
		}
	*/
		
		//Moving the Pieces
		for(int i = 0; userChoice == true; i++){	
			Fetching(chessPieces);	
			System.out.print("Enter number of units to move : ");
			int unit = sc.nextInt();
			if(chessPieces[i1+unit][i2]==null){
				
				chessPieces[i1+unit][i2] = chessPieces[i1][i2];
				chessPieces[i1][i2] = null;
				System.out.println(chessPieces[i1+unit][i2]);
			}
			else{
				System.out.println("Invalid move");
			}
			
			System.out.println();
                	for(String[]row : chessPieces){
                        	for(String element : row){

                                	if(element==null){
                                        	System.out.print("[  --  ]  ");
                                	}
                                	else{
                                        	System.out.print(element+"  ");
                                	}
                        	}
                        	System.out.println();
                        	System.out.println();
                	}
			
			System.out.println("Enter true to continue or false to stop : ");
			userChoice = sc.nextBoolean();
			if(userChoice == false){
				System.out.println("Well played!");
			}
			
			
		}
   	}
	static void Fetching(String[][]chessPieces){
		//Fetching the Pieces
		Scanner input = new Scanner(System.in);
                System.out.print("Enter a pawn to move : ");
                String name = input.nextLine();

                
                Boolean equality = false;
	/*	if(count%2==0){
			int i = chessPieces.lenght-1;
		}	*/
                for(int i = 0; i<chessPieces.length; i++){
                        for(int j = 0; j<chessPieces[i].length; j++){
                                StringTokenizer obj = new StringTokenizer(chessPieces[i][j]," []");
                                String str = obj.nextToken();
                             // System.out.println(str);
                                if(str.equals(name)){
                                        i1 = i;
                                        i2 = j;
					
                            //          System.out.println("Success!");
                                        equality = true;
                                        break;
                                }

                        }
                        if(equality){
                                break;
                        }

                }
	}
}

