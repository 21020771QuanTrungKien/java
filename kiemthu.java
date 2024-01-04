import java.util.Scanner;

public class kiemthu {
    public static double tienTroCap(double base, int dependents, char ageGroup) {
        double trocap = 0.0;
        if (ageGroup == 't') {
            if (dependents < 0) {
                return -1;  // Trả về -1 nếu dependents là số âm
            }
            if (dependents == 0) {
                return 0;
            } else if (dependents == 1) {
                trocap = base + 0.3 * base;
            } else {
                trocap = base + 0.5 * base;
                if (dependents >= 3) {
                    trocap += 0.3 * base;
                }
            }
        } else if (ageGroup == 'g') {
            if (dependents < 0) {
                return -1;  // Trả về -1 nếu dependents là số âm
            } else if (dependents == 0) {
                trocap = base * 0.3;
            } else if (dependents == 1) {
                trocap = base + 0.5 * base;
            } else {
                trocap = base + 0.8 * base;
                if (dependents >= 3) {
                    trocap += 0.2 * base;
                }
            }
        }
        return trocap;
    }

    public static void main(String[] args) {
        double base;
        int dependents;
        char ageGroup;
        double trocap;

        Scanner scanner = new Scanner(System.in);

        while (true) {  // Lặp lại việc nhập thông tin nếu trocap = -1
            System.out.print("Nhap muc tien tro cap co so (dolar): ");
            base = scanner.nextDouble();
            System.out.print("Nhap so nguoi phu thuoc: ");
            dependents = scanner.nextInt();
            System.out.print("Nhap nhom tuoi (t/g): ");
            ageGroup = scanner.next().charAt(0);

            trocap = tienTroCap(base, dependents, ageGroup);

            if (trocap == -1) {
                System.out.println("Nhap lai thong tin. So nguoi phu thuoc khong the la so am.");
            } else {
                break;  // Thoát khỏi vòng lặp nếu trocap không bằng -1
            }
        }

        if (trocap == 0) {
            System.out.println("Khong duoc tro cap (co lam thi moi co an)");
        } else {
            System.out.println("Tien tro cap duoc tinh la: " + trocap + " dolar");
        }
    }
}