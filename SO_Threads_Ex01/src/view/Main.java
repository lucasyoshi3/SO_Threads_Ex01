package view;

import controller.ThreadTid;

public class Main {
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			Thread threadTid=new ThreadTid();
			threadTid.start();
		}
	}
}
