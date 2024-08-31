import java.io.*;
class readlinexd{
public static void main(String[] args) throws IOException
{
InputStreamReader xd=new InputStreamReader(System.in);
BufferedReader ob=new BufferedReader(xd);
System.out.println("Enter the side length of square");
int r=Integer.parseInt(ob.readLine());
double peri=4*r;
System.out.println("Perimeter of a given radius is "+peri);

}
}