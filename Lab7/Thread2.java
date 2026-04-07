class MyThread extends Thread {
	public static void main(String[] args){
		MyThread t1 = new MyThread();
		t1.start();
	}
	@Override
	public void run(){
			System.out.println("Hello World");
	}
}
