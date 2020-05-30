package com.sapient.questions;

class ResourceLock{
    public int flag = 1;
}

class Thread1 extends Thread {
	ResourceLock lock;
	 
    Thread1 (ResourceLock lock){
        this.lock = lock;
    }
 
    @Override
    public void run() {
 
        try{
            synchronized (lock) {
            	// this thread1 will play 10 times 
                for (int i = 0; i < 10; i++) {
 
                    while(lock.flag!=1){
                        lock.wait();
                    }
 
                    System.out.println("Tic");
                    Thread.sleep(100);
                    lock.flag = 2;
                    lock.notifyAll();
                }
            }
        }catch (Exception e) {
            System.out.println("Exception Thread1");
        }
 
    }
}
class Thread2 extends Thread {
	ResourceLock lock;
	 
    Thread2 (ResourceLock lock){
        this.lock = lock;
    }
 
    @Override
    public void run() {
 
        try{
            synchronized (lock) {
            	// this thread2 will play 10 times 
                for (int i = 0; i < 10; i++) {
 
                    while(lock.flag!=2){
                        lock.wait();
                    }
 
                    System.out.println("Toc");
                    Thread.sleep(100);
                    lock.flag = 1;
                    lock.notifyAll();
                }
            }
        }catch (Exception e) {
            System.out.println("Exception Thread2");
        }
 
    }
}

public class TicToc {

	public static void main(String[] args) {
		
		ResourceLock lock = new ResourceLock();
		 
        Thread1 thread1 = new Thread1(lock);
        Thread2 thread2 = new Thread2(lock);
 
        thread1.start();
        thread2.start();
		
	}

}
