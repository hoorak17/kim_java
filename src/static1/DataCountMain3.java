package static1;

public class DataCountMain3 {

    static void main() {
        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count);
        Data3 data2 = new Data3("B");
        System.out.println("B count = " + Data3.count);
        Data3 data3 = new Data3("C");
        System.out.println("C count = " + Data3.count);//정적변수는 클래스. 으로 접근한다 인스턴스. 이 아니고
    }
}
