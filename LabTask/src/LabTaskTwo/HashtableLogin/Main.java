package LabTaskTwo.HashtableLogin;

import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Hashtable<Integer,String>[] hash = new Hashtable[]{new Hashtable<String,String>(),
                new Hashtable<String,String>(),
                new Hashtable<String,String>(),
                new Hashtable<String,String>()};
        hash[0].put(1,"Ali");
        hash[0].put(2,"ali@gamil.com");
        hash[0].put(3,"ali123");

        hash[1].put(1,"Muhammad");
        hash[1].put(2,"muhammad@gmail.com");
        hash[1].put(3,"muhammad123");

        hash[2].put(1,"Awais");
        hash[2].put(2,"awais@gmail.com");
        hash[2].put(3,"awais123");

        Info info = new Info();

        Scanner sc = new Scanner(System.in);


        while (true){
            info.welcome();
            info.info();

            int work = 0;
            work = sc.nextInt();
            if(work==2){
                System.exit(0);
            }
            if(work==1) {
                System.out.println("Welcome to login:");
                hash[3].put(0,sc.nextLine());
                info.username();
                hash[3].put(1,sc.nextLine());

                info.email();
                hash[3].put(2,sc.nextLine());
                info.pas();
                hash[3].put(3,sc.nextLine());

                if(hash[0].get(1).equals(hash[3].get(1))){
                    if (hash[0].get(2).equals(hash[1].get(2))){
                        if (hash[0].get(3).equals(hash[3].get(3))){
                            System.out.println("**********************");
                            System.out.println("Login succecful");
                            System.out.println();
                            System.out.println("Welcome MR Ali");
                            System.out.println();
                            System.out.println("Logout succecful");
                            System.out.println("**********************");
                        }
                    }
                }else if(hash[1].get(1).equals(hash[3].get(1))){
                    if (hash[1].get(2).equals(hash[3].get(2))){
                        if (hash[1].get(3).equals(hash[3].get(3))){
                            System.out.println("**********************");
                            System.out.println("Login succecful");
                            System.out.println();
                            System.out.println("Welcome MR Muhammad");
                            System.out.println();
                            System.out.println("Logout succecful");
                            System.out.println("**********************");
                        }
                    }
                }else if(hash[2].get(1).equals(hash[3].get(1))){
                    if (hash[2].get(2).equals(hash[3].get(2))){
                        if (hash[2].get(3).equals(hash[3].get(3))){
                            System.out.println("**********************");
                            System.out.println("Login succecful");
                            System.out.println();
                            System.out.println("Welcome MR Awais");
                            System.out.println();
                            System.out.println("Logout succecful");
                            System.out.println("**********************");
                        }
                    }
                }else{
                    System.out.println("Your id pass is wrong");
                }
            }
            System.out.println("=================================================================");
        }
    }
}
