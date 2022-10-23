package LabTaskTwo.login;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Welcome to our Login interface");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int id = 0;
        while (true) {
            Info info = new Info();
            info.guide();
            int c = Integer.parseInt(br.readLine());

            if(c==1){
                //id
                info.setId(id);
                //new account
                System.out.println("Enter Username:");
                String userName = br.readLine();
                info.setUser_name1(userName,id);

                System.out.println("Enter your Email:");
                String email = br.readLine();
                info.setEmail1(email,id);

                System.out.println("Enter your Password:");
                String password = br.readLine();
                info.setPass1(password,id);
                System.out.println("=============================");
                System.out.println("Login Successful");
                info.userName();
                System.out.println("Logout Successful");
                System.out.println("=============================");
                id++;
            }
            if(c==3||id==6){
                //Exit
                break;
            }
        }
        System.out.println("Thanks for useing our Login interface.\t(:");

    }
}
