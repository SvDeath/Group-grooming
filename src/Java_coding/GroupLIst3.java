package Java_coding;

import java.util.ArrayList;
import java.util.Arrays;

public class GroupLIst3 {

    public static String[] fizzArray3(int n){
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = String.valueOf(i);

        }
        return arr;
    }

    public static void main(String[] args) {

        // check new info from Daadman


        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Rooman Auliiev", "Aida Stenkova", "Mykyta Gannota", "Kamal Khan Daodmun", "Oyuchimeg Burentogtohk", "Maria Gabriela Rosa Ledesma", "Deonis Chiperi", "Taha Ali", "Ganchimeg", " Tiq"));

        char ok = 9989;
        char fail = 9899;

        for (String each : names) {
            if (each.equalsIgnoreCase("Rooman Auliiev") || each.equalsIgnoreCase("Ganchimeg Sosorbaram") || each.endsWith("Daodmun") || each.endsWith("Tiq")) {
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

        System.out.println("A bonus of Array with a traditional for loop");

        System.out.println(Arrays.toString(fizzArray3(10)));



    }



}






