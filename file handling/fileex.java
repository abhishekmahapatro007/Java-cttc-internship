import java.io.*;
class fileex
{
public static void main(String args[])
{
try
{
FileOutputStream fout=new FileOutputStream("satya.txt");
FileInputStream fin=new FileInputStream("satya.txt");
FileOutputStream fout1=new FileOutputStream("rajesh.txt");
FileInputStream fin1=new FileInputStream("rajesh.txt");
String s="hello satya....";
byte b[]=s.getBytes();
fout.write(b);
System.out.println("Successfully write into file1 satya....");
int i=0;
while((i=fin.read())!=-1)
{
fout1.write((byte)i);
}
System.out.println("Successfully write into file2 rajesh....");
while((i=fin1.read())!=-1)
{
System.out.print((char)i);
}
fout.close();
fin.close();
fout1.close();
fin1.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}
