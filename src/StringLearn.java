import java.util.Scanner;

public class StringLearn {

    public static void main(String[] args) {
        String s1 = "Welcome to JP";
        String s2 = "Hello world";
        String s3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi: ");
        s3 = sc.nextLine();

        System.out.println("Kiet qua" + (s1 == s3));
        System.out.println("Ket qua 2"+ s3.equals(s2));
        System.out.println("Kiem tra s3 " +  s3);

    }
}
