public class NameOfDay{
    public static void main(String[] args) {
        int day = Integer.parseInt(args[0]);
        switch (day) {
            case 6: System.out.println("Saturday");
            case 0:{
                System.out.println("Sunday");
                System.out.println("(Weekend)");
                break;
            }
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wedsday");
            break;
            case 4: System.out.println("Thursday");
            break;
            case 5: System.out.println("Friday");
            break;
        }   
    }
}