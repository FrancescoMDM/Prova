import java.util.HashMap;
import java.util.Scanner;
import beans.*;
public class MainPersona {

    public static void main(String argv[]) {

        HashMap<Integer,Persona> people = new HashMap<Integer, Persona>();
        int scelta, i = 0;
        Scanner Tastiera = new Scanner(System.in);
        do {
            System.out.println("***********");
            System.out.println("1)Vuoi inserire una persona?");
            System.out.println("2)Vuoi stampare l'hashMap?");
            System.out.println("3)Vuoi cercare una persona?");
            System.out.println("4)Esc");
            System.out.println("***********");

            scelta = Tastiera.nextInt();
            switch (scelta) {

                case 1:
                    System.out.println("Inserisci il nome dellla persona:");
                    String n= Tastiera.next();
                    System.out.println("Inserisci il cognome della persona: ");
                    String c= Tastiera.next();
                    System.out.println("Inserisci l'eta della persona: ");
                    int e= Tastiera.nextInt();
                    Persona p=new Persona(n,c,e);
                        people.put(i,p);
                    i++;

                    break;
                case 2:
                    for (Integer a : people.keySet()){
                        System.out.println("key: " + a + " value: " + people.get(a).toString());
                    }
                break;
                case 3:
                    System.out.println("Quale persona vuoi cercare?");
                    int s= Tastiera.nextInt();
                    for (Integer a  : people.keySet()) {
                        if (a==s){
                        System.out.println("Persona trovata:"+people.get(a).toString());
                        break;
                        }
                    }
                    break;

            }
            }
            while (scelta != 4) ;
        }
    }
