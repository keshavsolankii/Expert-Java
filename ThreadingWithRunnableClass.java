
class MyRunnable1 implements Runnable
{
    public void run(){

        for(int i=0; i<5; i++)
        {
            System.out.println("one " + i);
            
        }
    }
}

class MyRunnable2 implements Runnable
{
    public void run(){
      
        for(int i=0; i<5; i++)
        {
            System.out.println("two " + i);
            
        }
    }
}

public class ThreadingWithRunnableClass{
    public static void main(String args[]) {

        MyRunnable1 w1 = new MyRunnable1();
        MyRunnable2 w2 = new MyRunnable2();

        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w2);

        t1.start();
        t2.start();
        
        int n=0;
        while(n<5)
        {   
            System.out.println("Main");
            n++;
        }
    }
}