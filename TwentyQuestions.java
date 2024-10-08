public class TwentyQuestions{
    public static void main(String[] args) {
        int secret = 1 + (int) (Math.random() * 100);
        StdOut.print("I'm thinking of a number between 1 and 100 ");
        int guess = 0;
        while (guess != secret){
            StdOut.print("What is your guess?:  ");
            guess = StdIn.readInt();
            if (guess == secret){
                StdOut.println("Correct!");

            }
            if (guess < secret){
                StdOut.print("Too low!\n ");

            }
            if (guess > secret){
                StdOut.print("too high!\n ");
            }
        }
    }
}