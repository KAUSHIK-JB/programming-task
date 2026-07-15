import java.util.*;
public class Targettable{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        System.out.print("enter array size: ");
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = (r.nextInt(8) + 1) * 2;
            }
        }
        System.out.println("generated Array:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.print("enter a number to highlight (even number 2-16): ");
        int target=sc.nextInt();
        int count=0;
        System.out.println(" ");
        System.out.println("array with "+target+" highlighted: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]==target)
                {
                    System.out.printf("%-6s", "[" + arr[i][j] + "]");
                    count++;
                }
                else
                {
                    System.out.printf("%-6d", arr[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println("number "+target+" appears "+count+" times");
    }
}
