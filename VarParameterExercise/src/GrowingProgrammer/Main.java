package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	    HspMethod scoreSum = new HspMethod();
        String res = scoreSum.showScore("Jack", 15.1, 20, 33.2);
        System.out.println(res);
    }
}
class HspMethod {
    public String showScore(String name, double... score) {
        double totalScore = 0;
        for(int i = 0; i < score.length; i++) {
            totalScore += score[i];
        }
        return ("The total score of " + name + "'s " + score.length + " courses is " + totalScore);
    }
}