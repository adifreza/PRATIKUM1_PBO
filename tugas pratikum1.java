import java.util.Scanner;

class LibrarySystem {
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin123";
    private static final int NIM_LENGTH = 15;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---Library System---");
        System.out.println("Pilih salah satu (1-2):");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");

        int userType = scanner.nextInt();
        scanner.nextLine();

        if (userType == 1) {
            adminLogin(scanner);
        } else if (userType == 2) {
            mahasiswaLogin(scanner);
        } else {
            System.out.println("Invalid user type.");
        }

        scanner.close();
    }

    private static void adminLogin(Scanner scanner) {
        System.out.println("Admin Login");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
            System.out.println("Admin login successful.");

        } else {
            System.out.println("Invalid username or password.");
        }
    }

    private static void mahasiswaLogin(Scanner scanner) {
        System.out.println("Mahasiswa Login");
        System.out.print("NIM: ");
        String nim = scanner.nextLine();

        if (nim.length() == NIM_LENGTH) {
            System.out.println("Mahasiswa login successful.");

        } else {
            System.out.println("NIM  yang anda masukan tidak benar.");
        }
    }
}
