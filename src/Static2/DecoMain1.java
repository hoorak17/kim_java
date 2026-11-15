package Static2;

import jdk.swing.interop.SwingInterOpUtils;

public class DecoMain1 {

    static void main() {
        String s = "hello Java";
        DecoUtil1 utils  = new DecoUtil1();
        String deco = utils.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + deco);


    }
}
