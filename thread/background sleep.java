
    class NThread extends Thread {
        int p = 2000;

        public NThread() {

        }

        @Override
        public void run() {
            super.run();
            while (p > 0) {
              
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Hello World :" + p);
                p--;

            }
            //run
        }
        // class
    }



Then call as 
NThread th = new NThread();
th.start();
