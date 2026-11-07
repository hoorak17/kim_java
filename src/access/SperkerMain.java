package access;

public class SperkerMain {
    static void main() {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeup();
        speaker.showVolume();

        speaker.volumeup();
        speaker.showVolume();

    }

}
