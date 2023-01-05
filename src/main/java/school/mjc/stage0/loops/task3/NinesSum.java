package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int total=0,temp=0;
        for (int i = 1; i < lengthOfLastNumber; i++) {
            temp=temp+9;
            total+=temp;
           temp=temp*10;

        }
        System.out.println(temp);
    }
}
