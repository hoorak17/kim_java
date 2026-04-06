package variable;

public class Var8 {

    static void main() {

        //정수
        byte b = 127; // -128 ~127
        short s = 32767; // -32768 ~ 32767
        int i = 2147483647; // 약 20억까지

        long l = 9223372036854775807L;

        //실수
        float f = 10.0f;//f를 붙여야 float
        double d = 10.0;//기본이 더블이다.
/*아래는 실무에서 거의 사용안한다.
    byte 너무 작다. int를 차라리 사용하낟.
    short 너무 작다. int를 사용한다.
    float 정밀도가 낮다. double를 사용하자.
    char 문자 하나를 표현하는 일은 거의 없다. 문자 하나를 표현할 때도 문자열을 써버린다.

자주 쓰는 것들.
int, long 20억이 넘을것 같으면 long
double 실수는 고민하지 말고 double
boolean 조건문에서 사용.
string 문자 하나를 다루더라도 string사용.


 */


    }
}
