import java.io.*;
class A1
{
 
 public int display() throws IOException
 
 {
  System.out.println("Enter your age");
  Scanner t=new Scanner(System.in);
  int a=t.nextInt();
  if(a>=18)
 {
   System.out.println("You are elgible for vote");
}
else
{
System.out.println("You are not elgible for vote");
}
}
}
class Ifdemo1
{
public static void main(String[] args) throws IOException
{
A1 v=new A1();
v.display();
}
} 