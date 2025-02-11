
//Create a thread using lambda function


public class third {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
           for(int i=1;i<=5;i++){
               System.out.println("Thread is Running" + i);
           }

        });
    }
}
