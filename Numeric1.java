# Numeric
public class Numeric1{
public staic void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.nextInt();
Char c=s.charAt(0);
char c1=s.charAt(1);
if(Character.isletter(c)&&Character.isletter(c1)){
System.out.println("false");
}
else{
System.out.println("true");
}
}
}
