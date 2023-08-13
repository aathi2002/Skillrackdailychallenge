// Print the pattern
// input:
// f
// output:
// A
// B B
// C C C
// D D D D
// E E E E E
// F F F F F F




import java.util.*;
public class MyClass {
    public static void main(String args[]) {
     
		//Your Code Here
		Scanner in=new Scanner(System.in);
		char ch=in.next().charAt(0);
		char rm=Character.toLowerCase(ch);
		int r=Math.abs('a'-rm);
		char cm='A';
		for(int i=0;i<=r;i++){
		    for(int j=0;j<=i;j++){
		        System.out.print(cm+" ");
		    }
		    cm++;
		    System.out.println();

}
    }
}
