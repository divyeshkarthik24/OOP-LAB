public class FindAvg
{
public int findAvg(int numA, int numb ,int numC)
{
return (numA + numb + numC)/3;
}
public static void main(String args[])
{
FindAvg obj = new FindAvg();
int avg = obj.findAvg(10, 20, 30);
System.out.println("avg:" + avg);
}
}