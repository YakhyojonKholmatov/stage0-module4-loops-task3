package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
       String strT=t+"";
       int total=0,temp;
        for (int i = 0; i < strT.length(); i++) {
            temp = t%10;
            t = (t-temp)/10;
            total+=temp;
        }
        System.out.println(total);
    }
}

