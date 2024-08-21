package Thread;

public class ThreadDemo2 {

	public static void main(String[] args) {
		Runnable r=new Runnable() {

			@Override
			public void run() {
				for (int i=1;i<=5;i++) {
					System.out.println(i);
				}
				
			}
			
		
		};
		Thread t=new Thread(r);
		t.start();
		}
}
