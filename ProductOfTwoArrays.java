package javacore;

public class ProductOfTwoArrays {

	public static void main(StringEx[] args) {
		int x[][]= {{1,1,1},{2,2,2},{3,3,3}};
		int y[][]= {{1,1,1},{2,2,2},{3,3,3}};  
		int c[][]= new int[3][3];
		for(int i=0;i<3;i++)
        for(int j=0;j<3;j++)
		for(int k=0;k<3;k++)
		
			c[i][j] +=x[i][k] * y[j][k];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++)
        	System.out.print(c[i][j]+ " ");
        
        	System.out.println();
		
		}

	}

}
	
