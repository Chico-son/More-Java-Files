import java.util.Scanner;

public class Domain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a website name: ");
        String domain = sc.nextLine();

        System.out.println("The Domain is: " + topLevelString(domain));
        System.out.println("The Reverse Domain is: " + reverseDomain(domain));
        sc.close();
    }

    public static String topLevelString(String domain) {
        if (!hasDomain(domain)) {
            return "Error, Does not have a domain, please define a domain";
        } else {
            
        
        for (int i = 0; i < domain.length(); i++) {
            int startingPoint = domain.indexOf('.', domain.length() - i - 1);
            if (startingPoint != -1) {
                return domain.substring(startingPoint);
            }
        }
        return domain;
        }
    }

    public static String reverseDomain(String domain) {
        if (!hasDomain(domain)) {
            return "Error, Does no have a domain, please define a domain";
        }
        else {
        String[] parts = domain.split("\\.");
        StringBuilder reversed = new StringBuilder();
        for (int i = parts.length - 1; i >= 0; i--) {
            reversed.append(parts[i]);
            if (i > 0) {
                reversed.append(".");
            }
        }
        return reversed.toString();
        }
    
    }

    public static boolean hasDomain (String domain) {
        return domain.contains(".");
    }
}