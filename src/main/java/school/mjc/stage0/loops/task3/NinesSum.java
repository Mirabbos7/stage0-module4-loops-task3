package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        long sum = 0;
        long term = 0;
        long multiplier = 1;

        for (int i = 1; i <= lengthOfLastNumber; i++) {
            term = term * 10 + 9;
            sum += term;
        }

        System.out.println(sum);
    }
}
