import java.util.Scanner;

public class Reverse
{
    public static int[] Reverse(int[] Array)
    {
        int i=0;
        int j=Array.length-1;
        while(i<j)
        {
            int temp=Array[i];
            Array[i]=Array[j];
            Array[j]=temp;
            i++;
            j--;
        }
        return Array;
    }
    public static void main(String[] args) {
        System.out.println("Enter the size : ");
        Scanner scan = new Scanner(System.in);
        int size=scan.nextInt();
        int[] Array=new int[size];
        System.out.println("Enter the Elements : ");
        for(int i=0;i<size;i++)
        {
            Array[i]=scan.nextInt();
        }
        int[] Output = Reverse(Array);
        for(int i=0;i<Output.length;i++)
        {
            System.out.println(Output[i]+" ");
        }

    }
}
