public class reversText {
    public class Main2 {
    /*
    Записать слова предложение задом на перед.
     */
    public static void main(String[] args) {
        String line = "Р”РѕР±СЂРѕ РїРѕР¶Р°Р»РѕРІР°С‚СЊ РЅР° РєСѓСЂСЃ РїРѕ Java";
        System.out.println(reverse(line));
    }

    static String reverse(String line) {
        String[] temp = line.split(" ");
        String res = "";
        for (int i = temp.length - 1; i >= 0; i--) {
            res += temp[i] + " ";
        }
        return res;
    }
}
    
}
