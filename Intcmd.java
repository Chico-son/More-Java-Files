public class Intcmd{
    public static void main(String[]args){
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);
        if(x == y && y == z && x == z){
            System.out.println("same");
        }
        else{
            System.out.println("not same");
    }
        }
}