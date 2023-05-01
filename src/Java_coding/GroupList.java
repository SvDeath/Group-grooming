package Java_coding;

import java.util.ArrayList;
import java.util.Arrays;

public class GroupList {
    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Roman Aliiev", "Aiidaa Stenkova", "Mikita Gannota", "Kamal Khan Daadman", "Oyuchimeg Burentogtohk", "Maria Gabriela", "Deonis Chiperi", "Taha Ali", "Ganchimeg"));

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

        while (i < 5) {
            System.out.println("\t\t\t\t\t\tMake your changes in main code");
            i++;
        }
    }

}
