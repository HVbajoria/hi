import java.util.*;
class Main {
  static int v=1;static int m=65;
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    ArrayList<String> a=new ArrayList<String>(); // The grammar
    ArrayList<String> b=new ArrayList<String>(); //Non-terminals
    for(int i=0;i<s.length();i++)
      {
        char c=s.charAt(i);
        if((i+1)<s.length() && s.charAt(i+1)=='*')
        {
          asterix(c,a,b);
          i++;
        }
        else if((i+1)<s.length() && s.charAt(i+1)=='+')
        {
          plus(c,a,b);
          i++;
        }
        else if(c=='|'){
          concx(a,b);
          b.clear();
        }
        else 
          normal(c,a,b);
      }
    if(!b.isEmpty())
      concx(a,b);
    System.out.println("\nRegular Grammar: ");
    for(String ans:a)
      System.out.println(ans);
  }
  public static void asterix (char c, ArrayList<String> a,ArrayList<String> b){
    char u=(char)m;
    String s=u+Integer.toString(v);
    b.add(s);
    String x=s+" --> "+c+s+" | epsiliion";
    a.add(x);
    v++;
  }
  public static void plus (char c, ArrayList<String> a,ArrayList<String> b){
    char u=(char)m;
    String s=u+Integer.toString(v);
    b.add(s);
    String x=s+" --> "+c+s+" | "+c;
    a.add(x);
    v++;
  }
  public static void normal (char c, ArrayList<String> a,ArrayList<String> b)  {
    char u=(char)m;
    String s=u+Integer.toString(v);
    b.add(s);
    String x=s+" --> "+c;
    a.add(x);
    v++;
  }
  public static void concx(ArrayList<String> a,ArrayList<String> b){
    char u=(char)m;
    String q=u+" --> ";
    for(String z: b)
      q+=z;
    a.add(q);
    m++;
    v=1;
  }
}