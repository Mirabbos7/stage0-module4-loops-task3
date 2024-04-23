package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int a = t;
        int res = 0;
        for (int i = 0; i < Integer.toString(a).length(); i++) {
            res += t % 10;
            t = t / 10;
        }
        System.out.println(Math.abs(res));
    }
}
