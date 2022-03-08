package program.jav.lambda;

public class InstanceMethodReference {
    final private int num;

    public InstanceMethodReference(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    // check if num is bigger than the input value n
    boolean isBigger(int n) {
        return num > n;
    }

    public static void main(String[] args) {
        InstanceMethodReference checker = new InstanceMethodReference(10);
        int numToCompare = 9;
        IntPredicate p = checker::isBigger;
        boolean result = p.check(numToCompare);
        if (result) {
            System.out.println(checker.num + " is bigger than " + numToCompare);
        }else {
            System.out.println(checker.num + " is smaller or equal than " + numToCompare);
        }
    }
}