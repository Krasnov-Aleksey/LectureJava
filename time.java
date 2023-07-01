import java.time.LocalTime;
import java.util.Scanner;

public class time {
    public class Main {
    /*
    Р’ РєРѕРЅСЃРѕР»Рё Р·Р°РїСЂРѕСЃРёС‚СЊ РёРјСЏ РїРѕР»СЊР·РѕРІР°С‚РµР»СЏ. Р’ Р·Р°РІРёСЃРёРјРѕСЃС‚Рё РѕС‚ С‚РµРєСѓС‰РµРіРѕ РІСЂРµРјРµРЅРё,
    РІС‹РІРµСЃС‚Рё РїСЂРёРІРµС‚СЃС‚РІРёРµ РІРёРґР°
    Доброе утро если времф с 05:00 до 11:59
    "Р”РѕР±СЂС‹Р№ РґРµРЅСЊ, <РРјСЏ>!", РµСЃР»Рё РІСЂРµРјСЏ РѕС‚ 12:00 РґРѕ 17:59;
    "Р”РѕР±СЂС‹Р№ РІРµС‡РµСЂ, <РРјСЏ>!", РµСЃР»Рё РІСЂРµРјСЏ РѕС‚ 18:00 РґРѕ 22:59;
    "Р”РѕР±СЂРѕР№ РЅРѕС‡Рё, <РРјСЏ>!", РµСЃР»Рё РІСЂРµРјСЏ РѕС‚ 23:00 РґРѕ 4:59
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalTime time = LocalTime.now();
        System.out.println("РљР°Рє РІР°СЃ Р·РѕРІСѓС‚?");
        String name = scanner.nextLine();
        scanner.close();

//        if (time.isAfter(LocalTime.of(11, 55))){
//            System.out.println("РћРїРµСЂР°С‚РѕСЂ РІРµСЂРЅСѓР» true");
//        }

        int hour = time.getHour();
        if (hour >= 5 && hour < 12){
            System.out.println("Р”РѕР±СЂРѕРµ СѓС‚СЂРѕ, " + name + "!");
        } else if (hour >= 12 && hour < 18){
            System.out.println("Р”РѕР±СЂС‹Р№ РґРµРЅСЊ, " + name + "!");
        } else if (hour >= 18 && hour < 23){
            System.out.println("Р”РѕР±СЂС‹Р№ РІРµС‡РµСЂ, " + name + "!");
        } else {
            System.out.println("Р”РѕР±СЂРѕР№ РЅРѕС‡Рё, " + name + "!");
        }

    }
}
}
