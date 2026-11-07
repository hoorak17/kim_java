package access.b;

import access.a.AccessData;

public class AccessOuterMain {

    static void main() {
        AccessData data = new AccessData();

        data.publicField = 1;
        data.publicMethod();

        //data.defaultField = 2;
        //data.defaultMethod();외부에서 호출 불가.

        //private immpossible

        data.innerAccess();

    }
}
