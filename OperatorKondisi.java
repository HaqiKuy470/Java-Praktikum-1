public class OperatorKondisi {
    public static void main (String []args) {
        int score=0;
        char answer='a';
        score=(answer=='a')?10:0;
        System.out.println("score ="+score);
  
        if (answer=='a')
            score=10;
        else
            score=0;
    }
}
