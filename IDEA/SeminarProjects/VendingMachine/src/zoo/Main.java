package zoo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Speakable> speakables = new ArrayList<>();
        speakables.add(new Cat("Kompot"));
        speakables.add(new Dog("Baigle"));
        speakables.add(new Radio());

        NoiseZoo noiseZoo = new NoiseZoo(speakables);
        noiseZoo.speakAll();
    }
}
