public class Main {
    public static void main(String[] args) {
        boolean hasTeen = TeenNumberChecker.hasTeen(24, 24, 13);
        System.out.println("Has a teen: " + hasTeen);

        boolean isTeen = TeenNumberChecker.isTeen(13);
            System.out.println("Is a teen: " + isTeen);
    }
}
