public class Main {
    public static void main(String[] args) {

        Generic<Boolean> boolGeneric = new Generic<>();
        boolGeneric.setContent(false);
        boolGeneric.yazGeneric();

        Generic<Integer> intGeneric = new Generic<>();
        intGeneric.setContent(42);
        intGeneric.yazGeneric();

        Generic<String> strGeneric = new Generic<>();
        strGeneric.setContent("Meliha İpek");
        strGeneric.yazGeneric();

        Generic<Double> doubGeneric = new Generic<>();
        doubGeneric.setContent(3.14);
        doubGeneric.yazGeneric();

        Generic<String> strGeneric1 = new Generic<>();
        strGeneric1.setContent("Hello World!");
        strGeneric1.yazGeneric();

        strGeneric1.ayrac();

        Koleksiyon koleksiyon = new Koleksiyon();

        List<String> stringList = List.of("Java", "Python", "C++", "JavaScript","HTML","PHP","ASP");

        String bulunan = "Meliha";
        String result = koleksiyon.koleksiyonOge(stringList, bulunan);

        if (result != null) {
            System.out.println("Öğe bulundu: " + result);
        } else {
            System.out.println("Öğe bulunamadı: -1");
        }

    }
}
