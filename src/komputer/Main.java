package komputer;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String d1 = "1900-10-21";
        String d2 = "1900-09-21";
        String d3 = "1900-10-21";


        LocalDate date1 = LocalDate.parse(d1, formatter);
        LocalDate date2 = LocalDate.parse(d2, formatter);
        LocalDate date3 = LocalDate.parse(d3, formatter);


        LocalDate[] arr1 = {date1, date2, date3};
        LocalDate[] arr2 = {date2, date1, date3};


        System.out.println(jestPalindromem(arr1));
        System.out.println(jestPalindromem(arr2));


        BigInteger bigInteger1 = new BigInteger("22");
        BigInteger bigInteger2 = new BigInteger("33");
        BigInteger bigInteger3 = new BigInteger("33");
        BigInteger bigInteger4 = new BigInteger("22");

        BigInteger[] intArr1 = {bigInteger1, bigInteger2, bigInteger3, bigInteger4};

        BigInteger[] intArr2 = {bigInteger2, bigInteger1, bigInteger3, bigInteger4};

//        System.out.println(wypis(intArr1);
        System.out.println(jestPalindromem(intArr2));


        String s1 = "kajak";
        String s2 = "kk";
        String s3 = "kajak";

        String[] sArr1 = {s1, s2, s3};
        String[] sArr2 = {s2, s1, s3};

//        System.out.println(Main.isSorted(sArr1)
//        );
//        System.out.println(isSorted(sArr2));
        ArrayList<Object> objects = new ArrayList<>();

        objects.add(12);
        objects.add(13);
        objects.add(12);
        objects.add(1);
        printMarginal(objects);
    }


    public static <T extends Comparable<T>> boolean jestPalindromem(T[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j >= 0; j--)
                if (arr[j].compareTo(arr[i]) == 0) {
                    return true;
                } else return false;
        }
        return false;
    }

    public static <E extends Iterable<?>> void wypiszCoDrugi(E element) {
        Iterator<?> iterator = element.iterator();
        System.out.print(iterator.next() + ", ");
        while (iterator.hasNext()) {
            iterator.next();
            if (iterator.hasNext()) {
                System.out.print(iterator.next() + ", ");
            }
        }
    }

    public static <T extends Iterable<T>> void printWithSemicolon(T t) {
        ArrayList<Integer> i = new ArrayList<>();
        t.forEach(x -> {
            if (i.size() % 2 == 0) {
                System.out.print(x + ";");
            }
            i.add(0);
        });

    }

    public static<E extends Iterable<?>> void printMarginal(E obiekt)
    {
        Iterator<?> iterator = obiekt.iterator();
        System.out.print(iterator.next() + " ");
        int x = 0;
        while(iterator.hasNext())
        {
            x += 1;
            iterator.next();
        }
        Iterator<?> iterator1 = obiekt.iterator();
        while(x != 0)
        {
            iterator1.next();
            x -= 1;
        }
        System.out.print(iterator1.next() + " ");
    }
}