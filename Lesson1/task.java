package Lesson1;

public class task {
    public static void main(String[] args) {
        int[] arr = { 1, 9, 9, 0, 2, 8, 0, 9 };
        int[] result = new int[8]; // создаем дополнительный массив в который будет записываться результат
        int counter = 0, count = 0; // добавляем два счетчика
        for (int i = 0; i < arr.length; i++) { // берем элемент для проверки
            boolean flag = false;               //изначально устанавливаем значение false
            for (int j = 0; j < i; j++) { //берем элемент который уже проверяли 
                if (arr[i] == arr[j]) {      //сравниваем элементы элементы между собой   
                    flag = true; 
                    break; //если элементы совпадают то праверка прирывается и переходим к след элементу
            
                }
            }
            if (!flag) {
                result[counter++] = arr[i];
            }
        }
        for (int i = 0; i < counter; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (result[i] == arr[j]) {
                    count++;
                }
            }
            System.out.println(result[i] + " встречается " + count + " раз");
        }
    }

}