package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int first = 0;
        int second = 1;
        System.out.println(0);
        for (int i = 0; i < lastFibonacci-1; i++) {
            int next = first + second;
            first = second;
            second = next;
            System.out.println(first);
        }

    }
}
