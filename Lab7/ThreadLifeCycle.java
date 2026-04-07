import java.lang.InterruptedException;
class  MyThread extends Thread{
	MyThread(String message){
		super(message);
	}
	public static void main(String[] args) throws InterruptedException{
		MyThread t1 = new MyThread("Thread-A");
		System.out.println(t1.getState());
		t1.start();
		t1.sleep(500);
		System.out.println(t1.getState());
		t1.join();
		System.out.println(t1.getState());
	}
	@Override
	public void run(){
		System.out.println("At present the thread is running");
		try{
		for(int i=0;i<3;i++){
			System.out.println("Thread-A is sleeping" + i+" " );
			System.out.println(this.getState());
			this.sleep(500);
		}
		}catch(Exception e){}
	}


}
