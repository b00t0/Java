/*
Задание No2.1
📌 Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
📌 Вывести название каждой планеты и количество его повторений в списке.
Задание No2.2 (если выполнено первое задание)
📌 Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptun"
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task02 {
    public static void main(String[] args) {
        List<String> planets = getPlanetsList();
        planetsFreq(planets);
        deleteRepeatPlanet(planets);
        System.out.println(planets);
    }

    private static List<String> getPlanetsList() {
        List<String> planets = new ArrayList<>();
        planets.add("Earth");
        planets.add("Mercury");
        planets.add("Earth");
        planets.add("Earth");
        planets.add("Mercury");
        planets.add("Jupiter");
        planets.add("Mercury");
        planets.add("Mars");
        planets.add("Mars");
        planets.add("Uranus");
        return planets;
    }

    private static void planetsFreq(List<String> planets) {
        List<String> sortedPlanets = new ArrayList<>(planets);
        Collections.sort(sortedPlanets);
        int count = 1;
        String currentPlanet = sortedPlanets.get(0);

        for (int i = 1; i < sortedPlanets.size(); i++) {
            if (sortedPlanets.get(i).equals(currentPlanet)) {
                count ++;
            } else {
                System.out.println(currentPlanet + ":" + count);
                count = 1;
                currentPlanet = sortedPlanets.get(i);
            }
        }
        System.out.println(currentPlanet + ":" + count);
    }

    private static void deleteRepeatPlanet(List<String> planets) {
        for (int i = 0; i < planets.size(); i++) {
            String currentPlanet = planets.get(i);
            for (int j = planets.size() - 1; j > i; j--) {
                if (planets.get(j).equals(currentPlanet)) {
                    planets.remove(j);
                }
            }
        }
    }
}
