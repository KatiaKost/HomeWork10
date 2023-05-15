public class PasswordChecker {
    public static void main(String[] args) {

        String pw1 = "ab34*9";
        String pw2 = "vbN34kli";
        String pw3 = "gh3fg";

        System.out.println(pw1 + " = " + isValidPassword(pw1));
        System.out.println(pw2 + " = " + isValidPassword(pw2));
        System.out.println(pw3 + " = " + isValidPassword(pw3));

    }
    private static boolean isValidPassword(String password) {
        if (password.length() <= 6) {
            return false;
        }
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
