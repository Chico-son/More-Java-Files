public class Checkerboard{
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for(int i = 0; i < n; i++){
           for(int x = 0; x < n; x++){
            if((i + x) % 2 == 0){
                System.out.print("*");
            
            } else {
                System.out.print("o");
            }
        }
        System.out.println();   
        }
    }
}