import java.io.*;
import java.util.*;


// Vegades subcadena:

/* Donades dues cadenes, determina quantes vegades apareix la segona dins la primera. No distingim majúscules de minúscules.

Input Format

Introduïm dues cadenes de text.

Constraints

No n'hi ha.

Output Format

Nombre de vegades que la 2na cadena apareix en la 1a.

Sample Input 0

Poblenou poblEnOu poBlenouPoblenou
poblenou
Sample Output 0

4

 */

public class Solution
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine().toUpperCase();
        String palabraContar = sc.nextLine().toUpperCase();
        int count  = 0;
        int contadorPosicion =0;

        while ((contadorPosicion = palabra.indexOf(palabraContar, contadorPosicion)) != -1)
        {
            count++;
            contadorPosicion += palabraContar.length();
        }

        System.out.println(count);



    }
}
