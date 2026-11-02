package OOP;

public class MusicPlayerMain2 {

    static void main() {
        MusicPlayerData data = new MusicPlayerData();

        //플레이어 켜기
        on(data);

        //볼륨 증가
        volumeup(data);

        //볼륨 증가
        volumeup(data);

        //볼륨 감소
        volumedown(data);

        //플레이어 상태
        showStatus(data);

        //플레이어 끄기
        off(data);

    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static  void volumeup(MusicPlayerData data) {
        data.vol++;
        System.out.println("음악 플레이어 볼륨 : " + data.vol);
    }

    static  void volumedown(MusicPlayerData data) {
        data.vol--;
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인 : ");
        if(data.isOn){
            System.out.println("음악 플레이어 ON, 볼륨 : " + data.vol);
        }else {
            System.out.println("음악 플레이어 OFF");
        }


    }

}
