import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


/**
 * Created by adavi on 21.08.2017.
 */
public class BuildList{
    static Scanner scanner = new Scanner(System.in);

        ArrayList<User> users = new ArrayList<>();



    public void addUserToList(){
        System.out.println("Enter user id");
        int userId = scanner.nextInt();

        System.out.println("Enter name");
        String userName = scanner.next();

        System.out.println("Enter Surname");
        String userSurName  = scanner.next();

        User user = new User(userId,userName,userSurName);
    }
    public void removeUser(){
        System.out.println("Enter Name");
        String userNameToRemove = scanner.next();

        System.out.println("Enter Surname");
        String userSurNameToRemove = scanner.next();

        for (User u : users){
            if (userNameToRemove.equals(u.getName())
                    && userSurNameToRemove.equals(u.getSurName())){
                users.remove(u);
            }
        }
    }
    public void containsUser(){
        System.out.println("Enter name");
        String userName = scanner.next();

        System.out.println("Enter Surname");
        String userSurName  = scanner.next();

        for (User user : users) {
            if (user.getName().equalsIgnoreCase(userName)&&
                    user.getSurName().equalsIgnoreCase(userSurName)){

                System.out.println("Такий користувач існує :" + user.getSurName() + " " + user.getName());

            }else{

                System.out.println("Такий користвач не існує" + userSurName + " " + userSurName );
                System.out.println("Додати до списку? y/n");

                String userAnswer = scanner.next();
                if (userAnswer.equalsIgnoreCase("y")){
                    int newUserId = 0;
                    if (user.getUserId() > newUserId){
                        newUserId++;
                    }
                    users.add(new User(newUserId,userName,userSurName));

                }
            }

        }
    }
    public void isAmptiUserList(){
        users.isEmpty();
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BuildList buildList = (BuildList) o;

        return users != null ? users.equals(buildList.users) : buildList.users == null;
    }

    @Override
    public int hashCode() {
        return users != null ? users.hashCode() : 0;
    }


}
