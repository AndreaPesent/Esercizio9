/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		int[][]matrice={
		    {1,2,3},
            {4,5,6},	
		    {7,8,9},
		};
		boolean IsUguale;
		IsUguale=Uguali(matrice);
		if (IsUguale)
		System.out.println("true");
		else
		System.out.println("false");
	}
	public static boolean Uguali (int[][]matrice)
	{
	    boolean IsUguale=true;
	    for (int i=0;i<matrice.length;i++)
	    {
	        for (int j=0;j<matrice[0].length;j++)
	        {
	            if (matrice[i][j+1]!=matrice[i][j+1])
	            {
	                IsUguale=false;
	            }
	        }
	    }
	    return IsUguale; 
	}
}
