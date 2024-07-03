package org.lessons;
//when a thread is dependent on a variable, it is a good idea to make that variable volatile, this is a rare occurance
public class App {
//	this variable will not be cached by java. 
//	valatile can only be used on a variable
//	cache issues are rare
	volatile public static int flag = 0;

	public static void main(String[] args) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					if (flag == 0) {
						System.out.println("running");
					} else {
						break;
					}
				}
			}
		}).start();

		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				App.flag = 1;
				System.out.println("Flag value updated");
			}
		}).start();
	}

}
