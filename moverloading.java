class Calculator
{
    public int add(int n1,int n2,int n3)
    {
        return n1+n2+n3;
    }
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
}

public class moverloading
{
    public static void main(String[] args) 
    {
       Calculator obj =new Calculator();
       int r=obj.add(2, 4, 8);
       System.out.println(r); 
    }
}
