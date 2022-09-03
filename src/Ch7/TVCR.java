package Ch7;

class TV {
    boolean power;
    int channel;

    void power(){
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}

class VCR {
    boolean power;
    int counter = 0;
    void power() { power = !power;}
    void play() {
        System.out.println("play");
    };
    void stop() {
        System.out.println("stop");
    };
    void rew() {
        System.out.println("rewind");
    };
    void ff() {
        System.out.println("ff");
    };
}

public class TVCR extends TV{
    VCR vcr = new VCR();

    void play() {
        vcr.play();
    }

    void stop() {
        vcr.stop();
    }

    void rew() {
        vcr.rew();
    }

    void ff() {
        vcr.ff();
    }

    public static void main(String[] args) {
        TVCR tvcr = new TVCR();

        tvcr.play();
        System.out.println(tvcr.power);
        tvcr.power();
        System.out.println(tvcr.power);
        System.out.println(tvcr.vcr.counter);

    }
}
