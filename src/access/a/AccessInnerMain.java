package access.a;

public class AccessInnerMain {

    static void main() {
        AccessData data = new AccessData();

        data.publicField = 1;
        data.publicMethod();

        data.defaultField = 2;
        data.defaultMethod();

        //private immpossible

        data.innerAccess();

    }
}
