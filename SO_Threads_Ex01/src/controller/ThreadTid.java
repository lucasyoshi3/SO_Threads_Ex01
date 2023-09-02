package controller;

public class ThreadTid extends Thread {
	
	private int id;
	
	public ThreadTid(){
	}
	
	public void run() {
		Tid();
	}

	private void Tid() {
		id=(int) getId();
		System.out.println("#Tid "+id);
	}
}
