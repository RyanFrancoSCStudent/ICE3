package midtermgitcode2.ice3;

import java.util.Random;

class Bakery extends Thread {
    public LittleGirl littleGirl;

    public Bakery(LittleGirl littleGirl) {
        this.littleGirl = littleGirl;
    }

    @Override
    public void run() {
        Random rand = new Random();
        while (true) {
            try {
                Thread.sleep(5000 + rand.nextInt(5) * 1000);
            } catch (Exception exception) {
                System.out.println("there is an exception " + exception.getMessage());
            }
            littleGirl.breadReady();
        }
    }
}
