public class Weather{
    public static void main(String[]args){
        double temp = Double.parseDouble(args[0]);
        double vel = Double.parseDouble(args[1]);
        double wind_chill = 35.74 + 0.6215 * (temp) + (0.4275*(temp) - 35.75) * Math.pow(vel, 0.16);
        System.out.println("windchill:  " + wind_chill);
    }
}