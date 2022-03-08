package program.jav.lambda;

@FunctionalInterface
interface IntNumPredicate {
    boolean check(ParameterMethodReference m, int n);
}

public class ParameterMethodReference {
    final private int num;

    public ParameterMethodReference(int num) {
        this.num = num;
    }

    // check if num is bigger than the input value n
    boolean isBigger(int n) {
        return num > n;
    }

    public static void main(String[] args) {
        ParameterMethodReference checker1 = new ParameterMethodReference(10);
        int numToCompare = 9;
        IntNumPredicate p = ParameterMethodReference::isBigger;
        boolean result = p.check(checker1,9);
        if (result) {
            System.out.println(checker1.num + " is bigger than " + numToCompare);
        }else {
            System.out.println(checker1.num + " is smaller  " + numToCompare);
        }

        // second object of IntNumChecker
        ParameterMethodReference checker2 = new ParameterMethodReference(8);
        result = p.check(checker2,9);

        if (result) {
            System.out.println(checker2.num + " is bigger than " + numToCompare);
        }else {
            System.out.println(checker2.num + " is smaller " + numToCompare);
        }
    }
}
