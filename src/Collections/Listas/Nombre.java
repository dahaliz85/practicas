package Collections.Listas;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Nombre {

    public static void main(String[] args) {

        System.out.println("Introduzca nombres separados por espacios");
        Scanner sc = new Scanner(System.in);
        String inputValues = sc.nextLine();

        sc = new Scanner(System.in);
        System.out.println("Introduzca nombres a buscar");
        String nameToSearch = sc.nextLine();

        List<String> namesList = fillList(inputValues);
        searchName(namesList, nameToSearch);

    }

    public static List<String> fillList(String names){
        String[] namesArray = names.split(" ");
        List<String> namesList = Arrays.asList(namesArray);
        return namesList;
    }

    public static void searchName (List<String> namesList, String name){

        int nameIndex = namesList.indexOf(name);
        if(nameIndex >= 0){
            System.out.println("El nombre esta en la posicion: "+nameIndex);
        }else{
            System.out.println("El nombre no esta en la lista");
        }



    }




}
