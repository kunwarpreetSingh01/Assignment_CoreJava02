
//Implement multiple inheritance with default method inside interface.


interface Parent1 {
    default void properties() {
        System.out.println("black here");
    }
}

interface Parent2 {
    default void properties() {
        System.out.println("brown here");
    }
}

class child implements Parent1, Parent2 {
    @Override
    public void properties() {
        System.out.println("child Properties");
        Parent1.super.properties();
        Parent2.super.properties();
    }
}

public class fifth {
    public static void main(String[] args) {
        child obj = new child();
        obj.properties();
    }
}
