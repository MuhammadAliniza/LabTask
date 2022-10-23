package LabTaskTwo.login;

public class Info {
    public void guide(){
        System.out.println(" 1 : for new account");
        System.out.println(" 3 : Exit");
    }
    //ID
    private int id;
    //UserName
    private String user_name1 = "0";
    private String user_name2 = "1";
    private String user_name3 = "2";
    private String user_name4 = "3";
    private String user_name5 = "4";
    //Email
    private String email1 = "";
    private String email2 = "";
    private String email3 = "";
    private String email4 = "";
    private String email5 = "";
    //password
    private String pass1 = "";
    private String pass2 = "";
    private String pass3 = "";
    private String pass4 = "";
    private String pass5 = "";


    public void userName(){
        String[][][] sb = new String[5][2][2];

        //UserName
        sb[0][0][0]  = user_name1;
        sb[1][0][0]  = user_name2;
        sb[2][0][0]  = user_name3;
        sb[3][0][0]  = user_name4;
        sb[4][0][0]  = user_name5;


        //Email
        sb[0][1][0]  = email1;
        sb[1][1][0]  = email2;
        sb[2][1][0]  = email3;
        sb[3][1][0]  = email4;
        sb[4][1][0]  = email5;

        //password

        sb[0][0][1]  = pass1;
        sb[1][0][1]  = pass2;
        sb[2][0][1]  = pass3;
        sb[3][0][1]  = pass4;
        sb[4][0][1]  = pass5;
        if(id==0){
            System.out.println("Welcome");
            System.out.println("Hi how are you "+sb[id][0][0]);
            System.out.println("Sir username availability cheek ka lea boht try kea pr nhi hoa ");
        }
        if(id==1){
            System.out.println("Welcome");
            System.out.println("Hi how are you "+sb[id][0][0]);
            System.out.println("Sir username availability cheek ka lea boht try kea pr nhi hoa ");
        }
        if(id==2){
            System.out.println("Welcome");
            System.out.println("Hi how are you "+sb[id][0][0]);
            System.out.println("Sir username availability cheek ka lea boht try kea pr nhi hoa ");
        }
        if(id==3){
            System.out.println("Welcome");
            System.out.println("Hi how are you "+sb[id][0][0]);
            System.out.println("Sir username availability cheek ka lea boht try kea pr nhi hoa ");
        }
        if(id==4){
            System.out.println("Welcome");
            System.out.println("Hi how are you "+sb[id][0][0]);
            System.out.println("Sir username availability cheek ka lea boht try kea pr nhi hoa ");
        }



    }

    public void setUser_name1(String user_name,int n) {
        if(id==0) {
            this.user_name1 = user_name;
        } else if (id==1) {
            this.user_name2 = user_name;
        } else if (id==2) {
            this.user_name3 = user_name;
        } else if (id==3) {
            this.user_name4 = user_name;
        } else if (id==4) {
            this.user_name5 = user_name;
        }
    }


    public void setPass1(String pass,int n) {
        if (id==0){
            this.pass1 = pass;
        } else if (id==1) {
            this.pass2 = pass;
        } else if (id==2) {
            this.pass3 = pass;
        } else if (id==3) {
            this.pass4 = pass;
        } else if (id==4) {
            this.pass5 = pass;
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail1(String email,int n) {
        if (id==0){
            this.email1 = email;
        } else if (id==1) {
            this.email2 = email;
        } else if (id==2) {
            this.email3 = email;
        } else if (id==3) {
            this.email4 = email;
        } else if (id==4) {
            this.email5 = email;
        }
    }
}
