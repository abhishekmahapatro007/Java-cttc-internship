import java.io.*;
class fileex1
{
public static void main(String args[])
{
try
{
FileOutputStream fout=new FileOutputStream("kite.txt");
FileInputStream fin=new FileInputStream("kite.txt");
String s="hello kite u want to fly...??????????????";
byte b[]=s.getBytes();
fout.write(b);
System.out.println("Successfully write into kite....");
int i=0;
while((i=fin.read())!=-1)
{
System.out.print((char)i);
}

fout.close();
fin.close();-
}
catch(Exception e)
{
System.out.println(e);
}
}
}
