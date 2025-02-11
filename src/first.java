//Write the following a functional interface and implement it using lambda:
// -> First number is greater than second number or not Parameter (int ,int ) Return boolean
// -> Increment the number by 1 and return incremented value Parameter (int) Return int
// -> Concatination of 2 string Parameter (String , String ) Return (String)
// -> Convert a string to uppercase and return . Parameter (String) Return (String)

@FunctionalInterface
interface compareNumbers{
    boolean isGreater(int a,int b);
}

@FunctionalInterface
interface incrementingValue{
    int numberIncrement(int a);
}

@FunctionalInterface
interface concatenation{
    String concatenationstring(String a,String b);
}

@FunctionalInterface
interface UpperCaseConversion{
    String UpperCase(String a);
}

public class first{
    public static void main(String[] args) {
        compareNumbers compare = (a,b) -> a > b;
        System.out.println(compare.isGreater(2,3));

        incrementingValue iv = (a) -> a + 1;
        System.out.println(iv.numberIncrement(3));

        concatenation concat = (a,b) -> a + b;
        System.out.println(concat.concatenationstring("hello","world"));

        UpperCaseConversion uc = (a) -> a.toUpperCase();
        System.out.println(uc.UpperCase("hello"));
    }
}

