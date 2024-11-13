public class Race {
    String leader = "";
    int dist = 0;

    void whoIsLeader(String name, int speed) {
        int newDist = 24 * speed;
        if (dist < newDist) {
            dist = newDist;
            leader = name;
        }
        System.out.println("Лидирует автомобиль: " + leader + " проехавший " + dist + " км");
    }

    void whoIsChampion() {
        System.out.println("Победитель сегодняшней гонки: " + leader + "!!!");
    }
}