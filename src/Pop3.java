import java.util.Scanner;

public class Pop3{
     public  static  boolean exit= true;
     public static  Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("+OK Cyrus POP3 server ready\n");
        do {
            String input= scanner.nextLine();
            switch (input){
                case "USER":
                    System.out.print("=");
                    String user=scanner.nextLine();
                    userInput(user);
                    break;
                case "PASS":

                    String pass=scanner.nextLine();
                    passInput(pass);
                    break;
                case  "LIST":

                    listInput();
                    break;
                case "RETR":
                    break;
                case "DELE":
                    break;
                case "QUIT":
                    break;
                case "SMTP":
                    System.out.println("Команды протокола для отправки запроса \n" +
                            "HELO=:Устоновка соидинение \n" +
                            "MAIL=:Адрес отправителя");


            }
        }while (exit);
    }
    private static void userInput(String user){
        if (user.equals("damir1397")){
            System.out.println("+OK Name is a valid mailbox\n");
        }else {
            System.out.println("-ERR\n");

        }

    }
    private static void passInput(String pass){
        if (pass.equals("1397")){
            System.out.println("+OK Mailbox locked and ready\n");
        }else {
            System.out.println("-ERR\n");

        }
    }
    private  static  void listInput(){

    }
}
