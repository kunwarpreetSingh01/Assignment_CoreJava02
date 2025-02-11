//Using (instance) Method reference create and apply add and subtract method and using
// (Static) Method reference create and apply multiplication method for the functional interface created.

@FunctionalInterface
interface add{
    int addition(int a,int b);
}

@FunctionalInterface
interface subtract{
    int subtraction(int a,int b);
}

@FunctionalInterface
interface multiply{
    int multiplication(int a,int b);
}

class methodFunctionalities{
    //instance methods.
    public int add(int a,int b){
        return a + b;
    }
    public int subtract(int a,int b){
        return a - b;
    }

    //static method
    static int multiply(int a,int b){
        return a * b;
    }
}

public class second {
    public static void main(String[] args) {
        add obj1 = new methodFunctionalities()::add;
        subtract obj2 = new methodFunctionalities()::subtract;
        multiply obj3 = methodFunctionalities::multiply;

        System.out.println(obj1.addition(2,3));
        System.out.println(obj2.subtraction(9,6));
        System.out.println(obj3.multiplication(3,4));
    }
}
