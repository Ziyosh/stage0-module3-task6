package lang.print.gaps.task6;

public class FloatTypeCasting {
    public static void roundNumber(float numberToBeRounded) {
        numberToBeRounded = (float) 13.8;
        int myInt = (int)numberToBeRounded;
        System.out.println(myInt);
    }
    public static void main(String[] args){
        roundNumber((int)13);
    }

}
