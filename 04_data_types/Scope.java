class Scope {
    public static void main(String[] args) {
        int x;

        x = 10;
        if (x == 10) {
            int y = 20;

            // x and y are both known here.
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100; // Error! y not known here

        // x is still known here

        System.out.println("X is " + x);

    }
}