
class MyThread1 extends Thread
{
    public void run(){

        for(int i=0; i<5; i++)
        {
            System.out.println("one " + i);
            
        }
    }
}

class MyThread2 extends Thread
{
    @Override
    public void run(){
      
        for(int i=0; i<5; i++)
        {
            System.out.println("two " + i);
            
        }
    }
}

public class ThreadingWithThreadClass{
    public static void main(String args[]) {

        MyThread1 s1 = new MyThread1();
        MyThread2 s2 = new MyThread2();

        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);

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