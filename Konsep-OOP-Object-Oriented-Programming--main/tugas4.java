import java.util.Scanner;

public class tugas4 {
    private String username;
    private String password;

    public tugas4(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean isValidPassword() {
        String[] validPasswords = {"kopijava"}; // Array of valid passwords
        for (String validPassword : validPasswords) {
            if (validPassword.equals(password)) {
                return true; // Password matches one in the array
            }
        }
        return false; // Password not found in the array
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();

        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        tugas4 user = new tugas4(username, password);

        System.out.println("Username: " + user.getUsername());
        System.out.println("Password: " + user.getPassword());

        if (user.isValidPassword()) {
            System.out.println("Username & Password Sesuai");
        } else {
            System.out.println("Username & Password Tidak Sesuai");
        }
    }
}