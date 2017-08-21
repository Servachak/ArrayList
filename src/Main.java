/**
 * Created by adavi on 21.08.2017.
 */
public class Main {

    public static void main(String[] args) {
        BuildList buildList = new BuildList();
        System.out.println("Виберіть дію\n" + "1\n" + "2\n" +
                            "3\n" + "4\n" +
                            "5\n" + "6\n" +
                            "7\n" + "8\n" +
                            "9\n" + "10\n");
        int numberFromUser = BuildList.scanner.nextInt();
        switch (numberFromUser){

            case 1:{
                buildList.addUserToList();
                break;
            }
            case 2:{
                buildList.removeUser();
                break;
            }
            case 3:{
                buildList.containsUser();
                break;
            }
            case 4:{
                buildList.isAmptiUserList();
                break;
            }
            case 5:{}
            case 6:{}
            case 7:{}
            case 8:{}
            case 9:{}
            case 10:{}

        }
    }
}
