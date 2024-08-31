import java.io.*;
class file1
{
public static void main(String args[])
{
try
{
FileOutputStream Fout=new FileOutputStream("smruti.txt");
String s="hiii smruti this is my first file program";
byte b[]=s.getBytes();
Fout.write(b);
Fout.close();
System.out.println("Successfully write....");
}
catch(Exception e)
{
System.out.println(e);
}
}
}
