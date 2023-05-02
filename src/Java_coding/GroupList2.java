package Java_coding;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class GroupList2 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Roman Aliiev", "Aida Stenkova", "Mykita Gannota", "Kamal Khan Daadman", "Oyuchimeg Burentogtohk", "Maria Gabriela Rosa ledesma", "Deonis Chiperi", "Taha Ali", "Ganchimeg Sosorbaram"));

        char ok = 9989;
        char fail = 9899;
        for (String each : names) {
            if (each.equalsIgnoreCase("Maria GabRiela") || each.equalsIgnoreCase("Ganchimeg") || each.startsWith("Mikita") || each.startsWith("Aiidaa")) {
                System.out.println("Editional Info needed  \"" + each + "\"" + fail);
            } else {
                System.out.println(each + ok);
            }

        }

        int i = 0;

        while (i < 2) {
            System.out.println("\t\tGreat Job!");
            i++;

        }

        int a = 0;
        while(a<1){
            System.out.println("Lets be the best team in Cydeo B29!");
a++;
        }
    }
}

