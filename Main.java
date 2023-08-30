package uz.pdp.two;

import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
//        1.	Nomi “A” harfi bilan boshlanuvchi mevalarni narxlari bilan ekranga chiqazing
//        2.	Narxi 5000 so’mdan qimmat bo’lgan mevalarni narxlari bilan ekranga chiqazing
//        3.	Barcha mevalarning narxini 10% arzonlashtiring
//        4.	Narxi 10000 so’mdan qimmat mevalarning narxini 20% ga arzonlashtiring
//        5.	Narxi 20000 so’mdan qimmat mevalarning narxini 30% ga arzonlashtiring  va 10% chegirma bering
        Fruit2 fruit1 = new Fruit2("Anor", "quva", 15000);
        Fruit2 fruit2 = new Fruit2("Anor", "Tuya tish", 16000);
        Fruit2 fruit3 = new Fruit2("Anor", "Surxon", 14000);
        Fruit2 fruit4 = new Fruit2("Olma", "Besh yuldiz", 9000);
        Fruit2 fruit5 = new Fruit2("Olma", "Golden", 8000);
        Fruit2 fruit6 = new Fruit2("Olma", "Qirmizi", 15000);
        Fruit2 fruit7 = new Fruit2("Olma", "Semerenka", 6000);
        Fruit2 fruit8 = new Fruit2("Banan 5% chegirma", "Bananza", 28500);
        Fruit2 fruit9 = new Fruit2("Banan  5% chegirma", "Boshqa", 19000);
        Fruit2 fruit10 = new Fruit2("Shaftoli", "Tukli", 6000);
        Fruit2 fruit11 = new Fruit2("Shaftoli", "Tuksiz", 8000);
        Fruit2 fruit12 = new Fruit2("Kivi", "Import", 21000);
        Fruit2 fruit13 = new Fruit2("Kivi", "Mahalliy", 20000);
        Fruit2 fruit14 = new Fruit2("Qulupnay", "Yirik", 18000);
        Fruit2 fruit15 = new Fruit2("Qulupnay", "Mayda", 9000);
        Fruit2 fruit16 = new Fruit2("Uzum", "Qora", 10000);
        Fruit2 fruit17 = new Fruit2("Uzum", "Husayni", 15000);
        Fruit2 fruit18 = new Fruit2("O’rik", "Surxon", 3000);
        Fruit2 fruit19 = new Fruit2("O’rik", "Oq", 2000);
        Fruit2 fruit20 = new Fruit2("O’rik", "Yirik", 12000);

        HashMap<String, Double> fruitHashMap = new HashMap<>();
        fruitHashMap.put(fruit1.getName()+"->"+fruit1.getType(), fruit1.getSale());
        fruitHashMap.put(fruit2.getName()+"->"+fruit2.getType(), fruit2.getSale());
        fruitHashMap.put(fruit3.getName()+"->"+fruit3.getType(), fruit3.getSale());
        fruitHashMap.put(fruit4.getName()+"->"+fruit4.getType(), fruit4.getSale());
        fruitHashMap.put(fruit5.getName()+"->"+fruit5.getType(), fruit5.getSale());
        fruitHashMap.put(fruit6.getName()+"->"+fruit6.getType(), fruit6.getSale());
        fruitHashMap.put(fruit7.getName()+"->"+fruit7.getType(), fruit7.getSale());
        fruitHashMap.put(fruit8.getName()+"->"+fruit8.getType(), fruit8.getSale());
        fruitHashMap.put(fruit9.getName()+"->"+fruit9.getType(), fruit9.getSale());
        fruitHashMap.put(fruit10.getName()+"->"+fruit10.getType(), fruit10.getSale());
        fruitHashMap.put(fruit11.getName()+"->"+fruit11.getType(), fruit11.getSale());
        fruitHashMap.put(fruit12.getName()+"->"+fruit12.getType(), fruit12.getSale());
        fruitHashMap.put(fruit13.getName()+"->"+fruit13.getType(), fruit13.getSale());
        fruitHashMap.put(fruit14.getName()+"->"+fruit14.getType(), fruit14.getSale());
        fruitHashMap.put(fruit15.getName()+"->"+fruit15.getType(), fruit15.getSale());
        fruitHashMap.put(fruit16.getName()+"->"+fruit16.getType(), fruit16.getSale());
        fruitHashMap.put(fruit17.getName()+"->"+fruit17.getType(), fruit17.getSale());
        fruitHashMap.put(fruit18.getName()+"->"+fruit18.getType(), fruit18.getSale());
        fruitHashMap.put(fruit19.getName()+"->"+fruit19.getType(), fruit19.getSale());
        fruitHashMap.put(fruit20.getName()+"->"+fruit20.getType(), fruit20.getSale());

        System.out.println("MEVALAR SONI: "+fruitHashMap.size());
        Iterator<String> iterator=fruitHashMap.keySet().iterator();
        System.out.println("===Nomi “A” harfi bilan boshlanuvchi mevalarni narxlari bilan ekranga chiqazing===");
        while (iterator.hasNext())
        {
            String s= iterator.next();
            if (s.contains("A")) {
                System.out.println(s + ":" + fruitHashMap.get(s));
            }
        }
        iterator=fruitHashMap.keySet().iterator();
        System.out.println("===Narxi 5000 so’mdan qimmat bo’lgan mevalarni narxlari bilan ekranga chiqazing===");
        while (iterator.hasNext())
        {
            String s= iterator.next();
           if (fruitHashMap.get(s) > 5000)
           {
               System.out.println(s + ":" + fruitHashMap.get(s));
           }
        }
        iterator=fruitHashMap.keySet().iterator();
        System.out.println("===Barcha mevalarning narxini 10% arzonlashtiring===");
        while (iterator.hasNext())
        {
            String s= iterator.next();
            System.out.println(s+"->:"+fruitHashMap.replace(s, (fruitHashMap.get(s) - fruitHashMap.get(s) / 10)));
        }
   iterator=fruitHashMap.keySet().iterator();
        System.out.println("===Narxi 10000 so’mdan qimmat mevalarning narxini 20% ga arzonlashtiring===");
        while (iterator.hasNext())
        {
            String s= iterator.next();
            if (fruitHashMap.get(s) > 10000)
                System.out.println(s+"->:"+fruitHashMap.replace(s, (fruitHashMap.get(s) - fruitHashMap.get(s) / 5)));

        }
        iterator=fruitHashMap.keySet().iterator();
        System.out.println("===Narxi 20000 so’mdan qimmat mevalarning narxini 30% ga arzonlashtiring  va 10% chegirma bering===");
        while (iterator.hasNext())
        {
            String s= iterator.next();
            if (fruitHashMap.get(s) > 20000)
                System.out.println(s+"->:"+fruitHashMap.replace(s, (fruitHashMap.get(s) - fruitHashMap.get(s) *3/ 10)-(fruitHashMap.get(s) - fruitHashMap.get(s)/ 10)));

        }

    }
}

