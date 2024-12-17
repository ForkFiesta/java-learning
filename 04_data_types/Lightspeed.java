class Lightspeed {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        //approximate spped of light in miles / second
        lightspeed = 186000;

        days = 1000; // number of days

        seconds = days * 24 * 60 * 60; // convert to seconds

        distance = lightspeed * seconds;

        System.out.print("In " + days);
        System.out.println(" days light will travel about ");
        System.out.println(distance + " miles");
    }
}