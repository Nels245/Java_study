package DZ_02;

// Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму. 

// Пример 1: а = 3, b = 2, ответ: 9 
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1
// Пример 4: а = 0, b = 0, ответ: не определено
// Пример 5
// входные данные находятся в файле input.txt в виде
// b 3
// a 10
// Результат нужно сохранить в файле output.txt
// 1000

import java.io.*;

//Декомпозиция
// 1. Чтение данных из файла (найти функцию)
// 2. Расшифровка - текст в инт
// 3. Функция возведения числа a в степень b (доплнить, учесть 0 степень)
// 4. Запись числа в файл

public class DZ_02 {

    public static void main(String[] args) throws Exception {

        // Чтение данных
        BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\Nels\\Desktop\\Gekk\\Java\\Homework\\DZ_02\\input.txt"));
        String str;
        // StringBuilder myNumbers = new StringBuilder();
        while ((str = br.readLine()) != null) {
            // Так и не смог понять как мне достать число из строки, и прочесть и
            // использовать
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i)) && (str.contains("a"))) {
                    int a = str.charAt(i);
                    System.out.println(a);
                }
                if (Character.isDigit(str.charAt(i)) && (str.contains("b"))) {
                    int b = str.charAt(i);
                    System.out.println(b);
                }
            }
        }

        br.close();
        System.out.println();

        // Возведение в степень

        // pow(a, b);

        // Вывод в файл
        // File output = new
        // File("C:\\Users\\Nels\\Desktop\\Gekk\\Java\\Homework\\DZ_02\\output.txt");
        // FileOutputStream fileOutputStream = new FileOutputStream(output);
        // String out = pow(a, b);
        // fileOutputStream.write(out.getBytes());
        // fileOutputStream.close();

    }

    // Возводим a в степень b
    public static String pow(int a, int b) {
        int aStart = a;
        for (int i = 1; i < b; i++) {
            a = a * aStart;
        }
        String res = aStart + " в степени " + b + " = " + a;
        return res;
    }

}