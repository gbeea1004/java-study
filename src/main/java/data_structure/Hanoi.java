package data_structure;

public class Hanoi {

    public static void HanoiTowerMove(int num, char from, char by, char to) {
        if (num == 1) {
            System.out.println("원반1을 " + from + "에서 " + to + "로 이동");
            return;
        }

        HanoiTowerMove(num - 1, from, to, by);
        System.out.println("원반" + num + "을 " + from + "에서 " + to + "로 이동");
        HanoiTowerMove(num - 1, by, from, to);
    }
}
