import java.util.Scanner;

class program{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int count=0;
        for(int n=2; n<a;n++){
            if (a%n==0) {
                count=count+1;
            }
        }
        if (count==0) {
            System.out.println("Number is prime number ");
        }
        else{
            System.out.println("Number is not a prime number ");
        }
    }
}