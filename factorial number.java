# factorial-number
import java.io.*
import java.util.*
public class factorial number
{
public static void main(String args[])throws IOException
{
int i,fact=1,n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number:");
n=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println("Factorial of "+n+"is: "+fact);
}
}
