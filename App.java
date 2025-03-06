import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Masukkan nama Anda: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Masukkan NIM Anda: ");
        int nim = input.nextInt();
        System.out.println("Masukkan usia Anda: ");
        int age = input.nextInt();
        System.out.println("Masukkan tinggi badan: ");
        double height = input.nextDouble();

        System.out.println("\nData yang Anda masukkan: ");
        System.out.println("Nama Anda: " + name);
        System.out.println("NIM Anda: " + nim);
        System.out.println("Usia Anda: " + age);
        System.out.println("Tinggi badan Anda: " + height);

        double hasil1 = (age * 2) + 10 / 5 - 3;
        System.out.println("Hasil: " + hasil1);

        boolean umur =  age > 18;
        System.out.println("Usia lebih dari 18: " + umur);

        boolean tinggi = height > 160;
        System.out.println("Tinggi badan lebih dari 160: " + tinggi);

        double usia = (double) + age;
        int tinggiBadan = (int) + height;

        System.out.println("Usia dalam double: " + usia);
        System.out.println("Tinggi badan dalam int: " + tinggiBadan);


        input.close();

    }
}