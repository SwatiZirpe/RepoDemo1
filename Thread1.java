public class Demo7 implements Runnable
{
    public void run()
	{
		System.out.print("running........");
	}
}
 public class Thread1
 {
	 	public static void main(String[] args)
		{
			Demo7 d1=new Demo7();
			Thread t=new Thread(d1);
			t.start();
			t.start();
		}
 }
 