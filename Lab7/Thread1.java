class MyThread extends Thread {
	public static void main(String[] args){
		MyThread t1 = new MyThread();
		t1.setName("Hello World");
		System.out.println(t1.getName());
	}
}
