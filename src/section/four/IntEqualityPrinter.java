package section.four;
public class IntEqualityPrinter {
    public static void main(String[] args) {
        printEqual(1,1,1);
        printEqual(1,1,2);
        printEqual(-1,-1,-1);
        printEqual(1,2,3);

    }
    private static void printEqual(int x, int y, int z) {
        if (x < 0 || y < 0 || z < 0) {
            System.out.println("Invalid Value");
            return;
        }
        if (x == y && x == z) {
            System.out.println("All numbers are equal");
            return;

        }
        if (x != y && x != z && y != z) {
            System.out.println("All numbers are different");
            return;
        }
        System.out.println("Neither all are equal or different");


    }
}
