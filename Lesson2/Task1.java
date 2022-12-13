package Lesson2;
/**
Написать программу, показывающую последовательность действий для игры
“Ханойская башня”
 */
public class Task1 {
    public static void main(String args[]) {
        int n = 4; // Колличество дисков
        Hanoi(n, 'A', 'C', 'B'); // название стержней
    }

    static void Hanoi(int n, char from_rod, char to_rod, char aux_rod) {
        if (n == 1) {
            System.out.println("Переместить диск 1 со стержня  " + from_rod + " на стержень " + to_rod);
            return;
        }
        Hanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.println("Переместить диск " + n + " со стержня " + from_rod + " на стержень " + to_rod);
        Hanoi(n - 1, aux_rod, to_rod, from_rod);
    }  

}