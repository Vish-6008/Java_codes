/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Creates the Thread and takes delay to prints.
 *   Project:  THREADS example
 *   Platform: JavaSE-22.0.1
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	 Version: 2024-03 (4.31.0)
 *   Build id: 20240307-1437
 ********************************************************************************************/



package Threads_with_Mutli_Threading;						//Multi-Threading one-more example


class U1Thread extends Thread {
    @Override
    public void run() {
        int i = 0;
        try {
            while (i < 10) { // Corrected loop condition
                Thread.sleep(3000);
                System.out.println("having a coffee");
                System.out.println("Get full Energyyyy");
                i++;
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}

class U2Thread extends Thread {
    @Override
    public void run() {
        int i = 0;
        try {
            while (i < 10) { // Corrected loop condition
                Thread.sleep(3000);

                System.out.println("having a buttermilk");
                System.out.println("full sleepyyyyyyyss");
                i++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class Example{
	public static void main(String[] args) {
		U1Thread u1=new U1Thread();
		U2Thread u2=new U2Thread();
		
		u1.start();
		u1.start();
		//u2.start();
	}
}
