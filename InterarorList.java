import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class InterarorList {
    /*
    Принимает от пользователя и “запоминает” строки.
    Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
    Если введено revert, удаляет предыдущую введенную строку из памяти.
     */
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        boolean work = true;
        while (work) {
            String line = sc.nextLine();
            if (line.equalsIgnoreCase("print")) {
                ListIterator<String> listIterator = list.listIterator(list.size());
                while (listIterator.hasPrevious()){
                    System.out.println(listIterator.previous());
                }
                System.out.println();
            } else if (line.equalsIgnoreCase("revert") && list.size() > 0) {
                list.removeLast();
                System.out.println(list);
            } else {
                list.add(line);
                System.out.println(list);
            }
        }
    }
}
