class Pot{

	public static void main(String[] args){
		String pot[][] = new String[21][3];
		int starCount[] = {2,1,1,0,0,0,1,2,3,5,7,8,9,9,9,9,8,7,5,3,1};
		String mid = "**********";
		String star = "*";
		String space = " ";
		int spaceCount[] = new int[21];
		for(int i = 0; i<pot.length; i++){
			for(int j = 0; j<pot[i].length; j++){	
				if(j==0){
					pot[i][j] = star.repeat(starCount[i]);
				}
				else if(j==1){
					pot[i][j] = mid; 
				}
				else if(j==2){
					pot[i][j] = star.repeat(starCount[i]);
				}
			}
			spaceCount[i] = 9 - starCount[i]; 
		}
		System.out.println();
		for(int i = 0; i<pot.length; i++){
			
			System.out.print("	");
			System.out.print(space.repeat(spaceCount[i]));
			for(int j = 0; j<pot[i].length; j++){
				System.out.print(pot[i][j]);
			}
			System.out.println();
			
		}
		System.out.println();
		/*for(int i = 0; i<spaceCount.length; i++){
			System.out.print(spaceCount[i]+",");
		}*/
	
	}
}
