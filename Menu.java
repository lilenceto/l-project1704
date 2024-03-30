import java.util.HashMap;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        HashMap<Integer,String> menu = new HashMap<>();

        menu.put(1,"list");
        menu.put(2,"print");
        menu.put(3,"save <id> <filename>");
        menu.put(4,"addRule <id> <rule>");
        menu.put(5,"removeRule <id> <n>");
        menu.put(6,"union <id1> <id2>");
        menu.put(7,"concat <id1> <id2>");
        menu.put(8,"chomsky <id>");
        menu.put(9,"cyk <id>");
        menu.put(10,"iter <id>");
        menu.put(11,"empty <id>");
        menu.put(12,"chomskify <id>");
        menu.put(13,"Exit"+"\n");

        Scanner scanner = new Scanner(System.in);
        int choice;


        do{
            for(Integer key : menu.keySet()){
                System.out.println(key+". "+menu.get(key));
            }

            System.out.println("Enter your choice (1-13): ");
            choice =scanner.nextInt();

            switch (choice){
                case 1:
                    //spisuk v vsichki procheteni gramatiki
                    //tehni idta


                    break;
                case 2:
                    //printira gramatikata v format

                    break;
                case 3:
                    //saving v fail

                    break;
                case 4:
                    //adva pravila


                    break;
                case 5:
                   //maha pravilo na poreden nomer

                    break;
                case 6:
                    //namira obedinenieto na 2 gramatiki i pravi nova s id


                    break;
                case 7:
                    //namira konkatenaciq na 2 gram i pravi nova

                    break;
                case 8:
                    //proverqva dali gram e normalna forma na Chomski

                    break;
                case 9:
                    //proverqva dali duma e v ezika na gramatika
                case 10:
                    //
                case 11:
                    //proverqva dali ezika na gramatika e prazen
                case 12:
                    //pravi gramatika v normalna forma nan Chomski
                case 13:
                    System.out.println("Exiting and ending the program");
                    break;
                default:
                    System.out.println("Unavailable option! Please choice an existing one! :) "+ "\n");
                    break;

            }
        }while (choice!=13);

        scanner.close();
    }

    }

