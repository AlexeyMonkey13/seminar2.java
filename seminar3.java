import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//Задание
//
//        Пусть дан произвольный список целых чисел.
//
//        1) Нужно удалить из него чётные числа
//        2) Найти минимальное значение
//        3) Найти максимальное значение
//        4) Найти среднее значение
public class seminar3 {
    public static void main(String[] args) {
//        List <Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 7, 7, 7);
//        System.out.println("список четных чисел");
//        for (int i = 0; i < list.size(); i++){
//            if (list.get(i) % 2 == 0)
//            System.out.println(i);
//            }

        Scanner menu = new Scanner(System.in);
        ArrayList<Integer> numb = new ArrayList<>();
        System.out.println("какой длины хотите список? : ");
        int n = menu.nextInt();
        System.out.println("______");
        for (int i = 0; i < n; i++) {
            int y = menu.nextInt();
            numb.add(y);

        }
        System.out.println(numb);
        System.out.println("список нечетных чисел");
        for (Integer number: numb){
            if (number % 2 == 0){
                numb.remove(number);

            }
//               for (Iterator<Integer> iterator = numb.iterator(); iterator.hasNext();){
//            Integer numb = iterator.next();
//            if  (numb % 2 == 0){
//                System.out.println(numb);
//                iterator.remove();
//            }
        }System.out.println(numb);
    }
}


