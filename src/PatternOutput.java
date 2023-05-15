public class PatternOutput {
    public static void main(String[] args) {

        System.out.println("Pattern B");
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Pattern С");
        for (int i = 1; i <= 6; i++) {
            int num = i;
            for (int k = 6 - i; k >= 1; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num--;
            }
            System.out.println();
        }
    }
}
