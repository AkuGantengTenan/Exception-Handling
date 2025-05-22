package Tugas7;
import java.util.Scanner;
public class KalkulatorSimple { 

    
    public static boolean AngkaValid(String s) {
        return s.matches("-?\\d+(\\.\\d+)?");
    }

    public static double bagi(double a, double b) throws ArithmeticException {
        if (b == 0) throw new ArithmeticException("Pembagian dengan nol tidak terhingga");
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in1, in2;

        do {
            System.out.print("Masukkan angka: ");
            in1 = sc.nextLine();
        } while (!AngkaValid(in1));

        do {
            System.out.print("Masukkan angka: ");
            in2 = sc.nextLine();
        } while (!AngkaValid(in2));

        System.out.print("Pilih operasi (+, -, *, /) : ");
        char op = sc.nextLine().charAt(0);

        double a = Double.parseDouble(in1);
        double b = Double.parseDouble(in2);

        try {
            double hasil;
            switch (op) {
                case '+': hasil = a + b; break;
                case '-': hasil = a - b; break;
                case '*': hasil = a * b; break;
                case '/': hasil = bagi(a, b); break;
                default: 

                    return;
            }
            System.out.println("Hasil: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program selesai.");
            sc.close();
        }
    }
}

