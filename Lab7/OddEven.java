class MyThread extends Thread{
	public static void main(String[] args)throws Exception{
		MyThread et1 = new MyThread();
		et1.setName("Even Thread");
		et1.start();
		et1.join();
		MyThread et2 = new MyThread();
		et2.setName("Odd Thread");
		et2.start();
	}
	@Override
	public void run(){
		for(int i=0;i<=20;i++){
		try{
			if (this.getName().equals("Even Thread")&&i%2==0){
				System.out.println("Even Thread "+i+" ");
				this.sleep(500);
			}else if (this.getName().equals("Odd Thread")&&i%2!=0){
				System.out.println("Odd Thread " +i+" ");
				this.sleep(500);
			
			}
			}catch(Exception e){}
		
		
		}
	
	}

}

