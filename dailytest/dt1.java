





The program must accept a string S and an integer N as the input. The program must print the characters occurring at least N times in the string S (in the order of their occurrence) as the output. If there is no such character in S then the program must print -1 as the output.

Boundary Condition(s):

1 <= Length of S <= 1000

2 <= N <= 100

Input Format:

The first line contains S. The second line contains N.

Output Format:

The first line contains the characters occurring at least N times in the string S or -1.

Example Input/Output 1: Input: waterbottle

2

Output:

te

Explanation: In the string "waterbottle", the character 't' occurs three times and 'e' occurs two times.

Hence the output is te

Example Input/Output 2: Input: celebration

3

Output:

-1

import java.util.*;
public class Hello {

    public static void main(String[] args) {
	//Your Code Here
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int n=in.nextInt();
        HashMap<Character,Integer>aathi=new HashMap<>();
        for(int i=0;i<s.length();i++){
            aathi.put(s.charAt(i),aathi.getOrDefault(s.charAt(i),0)+1);
        }
        int count=0;
        for(Map.Entry<Character,Integer>entry:aathi.entrySet()){
            if(entry.getValue()>=n){
                Character r=entry.getKey();
                count++;
                System.out.print(r);
            }
        }
        if(count==0){
            System.out.println(-1);
        }
	}
	
}