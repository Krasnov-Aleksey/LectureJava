import java.util.ArrayList;
import java.util.List;

public class ShBook {
    /*
    Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
    что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг.
    Напишите метод для заполнения данной структуры.

    [
    [сказки, колобок, курочка ряба, золотой петушок],
    [фантастика, гарри поттер, ночной дозор],
    [роман, война и мир, ромео и джульетта]
    ]
     */
    static List<List<String>> shopBook = new ArrayList<>();

    public static void main(String[] args) {
        addBook("сказки", "колобок");
        addBook("фантастика", "гарри поттер");
        addBook("фантастика", "гарри поттер");
        addBook("сказки", "курочка ряба");
        addBook("роман", "ромео и джульетта");
        addBook("Роман", "война и мир");
        addBook("фантастика", "ночной дозор");
        addBook("сказки", "золотой петушок");

        System.out.println(shopBook);
    }

    static void addBook(String genreBook, String nameBook){
        for (int i = 0; i < shopBook.size(); i++) {
            //книжная полка
            List<String> genreList = shopBook.get(i);
            String genre = genreList.get(0);
            if (genreBook.equalsIgnoreCase(genre)){
                if (!genreList.contains(nameBook)) {
                    genreList.add(nameBook);
                }
                return;
            }
        }

        List<String> list = new ArrayList<>();
        list.add(genreBook);
        list.add(nameBook);
        shopBook.add(list);
    }
}
