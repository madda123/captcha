import java.util.Scanner;

public class Captcha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ulang = 0;

        do {
            int captcha = (int) (Math.random() * 1000);

            System.out.print("Masukan Username: ");
            String user = input.nextLine();
            System.out.print("Masukan Password: ");
            String pw = input.nextLine();
            System.out.print("Masukan Captcha " + captcha + ": ");
            int Captcha = input.nextInt();
            input.nextLine();

            if (user.equals("Madda") && pw.equals("123") && Captcha == captcha) {
                System.out.println("Selamat datang " + user + " Anda Telah Login!");
                break;
            } else if (!user.equals("Farhan")) {
                System.out.println("Username Tidak Terdaftar. Silakan coba lagi.");
            } else if (!pw.equals("123")) {
                System.out.println("Password Salah. Silakan coba lagi.");
            } else {
                System.out.println("Captcha Salah. Silakan Coba Lagi.");
                ulang++;
            }
            System.out.println("=====================================");

        } while (ulang < 3);

        if (ulang == 3) {
            System.out.println("Anda telah mencoba login sebanyak 3 kali. Aplikasi akan keluar.");
        }
    }
}