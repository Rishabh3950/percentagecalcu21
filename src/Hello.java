import java.util.Scanner;

public class Hello {
    public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter number ");
            int physics=sc.nextInt();
            System.out.println("enter number ");
            int chemistry =sc.nextInt();
            System.out.println("enter number ");
            int english=sc.nextInt();
            System.out.println("enter number");
            int math=sc.nextInt();
            System.out.println("enter number");
            int hindi=sc.nextInt();
            int result=(physics+chemistry+english+math+hindi)*100/500;
            System.out.println(result);




        }



}
