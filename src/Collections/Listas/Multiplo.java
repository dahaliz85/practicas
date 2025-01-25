package Collections.Listas;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Multiplo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero inicial: ");
        int numeroInicial = sc.nextInt();
        System.out.println("Introduzca el numero final:");
        int numeroFinal = sc.nextInt();
        System.out.println("Introduzca el multiplo: ");
        int multiplo = sc.nextInt();

        List<Integer> listaNumeros = getListaNumeros(numeroInicial, numeroFinal);
        findMultiplos(listaNumeros, multiplo);
        System.out.println(listaNumeros);


    }

    public static void findMultiplos(List<Integer> listaNumeros, int multiplo){

        for(int x=0; x<listaNumeros.size(); x++){
            if(listaNumeros.get(x) % multiplo != 0){
                listaNumeros.set(x, 0);
            }


        }


    }

    public static List<Integer> getListaNumeros(int numeroInicial, int numeroFinal){
        List<Integer> listaNumeros = new ArrayList<>();
        for(int x = numeroInicial; x <= numeroFinal ; x++) {
            listaNumeros.add(x);

        }
        return listaNumeros;
    }




}
