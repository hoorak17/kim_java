package Static2;

import static Static2.DecoData.staticCall;
import static Static2.DecoData.*;



public class DecoDataMain {

    static void main() {
        System.out.println("1. static call");
        staticCall();

        System.out.println("2. instance call");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("2. instance call");
        DecoData data2 = new DecoData();

        data2.instanceCall();

        //add

        DecoData data3 = new DecoData();
        data3.staticCall();

        DecoData.staticCall();
    }
}
