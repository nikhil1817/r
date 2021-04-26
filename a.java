import java.io.*;
import java.util.Scanner;
class a{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=1111,ans=0;
    int temp=n;
    while(n!=0){
        int p=n%10;
        ans=ans*10+p;
        n=n/10;
    }
    if(temp==ans)
    System.out.println("palindrome");
    else
    System.out.println("not palindrome");

}
}
      