import com.sun.source.tree.WhileLoopTree;

import java.io.*; //для работы с файлами
//считываем строки файла
public class lib {
    public static String[] ReadLineFromFile(String pathway) throws Exception { //генерация исключений
        BufferedReader br = new BufferedReader(new FileReader(pathway)); //метод для считывания
        String str;
        int size = 0;
        while ((str = br.readLine()) != null) {
            size +=1;
        }
        br.close();
        String [] listData = new String [size];

        int i = 0;
        BufferedReader br1 = new BufferedReader(new FileReader(pathway));
        while ((str = br1.readLine()) != null) {
            listData[i] = str;
            i += 1;
        }
        br1.close();
        return listData;

    }
    // методы печати массива чисел
    public static void printArrayInt(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            System.out.printf("%d, ", arr[i]);
        }
        System.out.print(arr[arr.length-1]);
    }

    public static void printArrayString(String [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}


