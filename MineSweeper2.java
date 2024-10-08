public class MineSweeper2{
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        double p = Double.parseDouble(args[2]);
        
        boolean [][] board = new boolean [m+2][n+2];

        for (int r = 1; r <= m ; r++){
            for (int c = 1; c <= n; c++){
                board[r][c] = p > Math.random();
            }
        }

        for (int r = 1; r <= m ; r++){
            for (int c = 1; c <= n; c++){
                // System.out.print(board[r][c] ? "*" : ".");

                if (board[r][c]){
                    System.out.print("* ");
                }
                else{
                    System.out.print(". ");
                }
       
            }
            System.out.println();
        }
        System.out.print("\n");

        for (int r = 1; r <= m ; r++){
            for (int c = 1; c <= n; c++){
                if (board[r][c]){
                    System.out.print("* ");
                } else {
                    int count = 0;
                    if (board[r-1][c-1]){
                        count++;
                    }

                    if (board[r-1][c]){
                        count++;
                    }

                    if (board[r-1][c+1]){
                        count++;
                    }

                    if (board[r][c-1]){
                        count++;
                    }

                    if (board[r][c+1]){
                        count++;
                    }

                    if (board[r+1][c-1]){
                        count++;
                    }

                    if (board[r+1][c]){
                        count++;
                    }

                    if (board[r+1][c+1]){
                        count++;
                    }
                    System.out.print(count + " ");
                }
            }
            System.out.println();
        }
    }
}