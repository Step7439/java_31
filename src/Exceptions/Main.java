package Exceptions;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();

        //Проверить логин и пароль

        //Вызвать методы валидации пользователя
        validateUser(getUserByLoginAndPassword(login, password));
        System.out.println("Доступ предтавлен");
    }
    public static User[] getUsers() {
        User user1 = new User("jhon", "jhon@gmail.com", "pass", 24);
        User user2 = new User("Step", "step@gmail.com", "pass2", 19);
        User user3 = new User("Maik", "maik@gmail.com", "pass3", 15);
        return new User[]{user1, user2, user3};
    }
    public static User getUserByLoginAndPassword(String login,String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
          if(user.name.equals(login) && user.pass.equals(password)){
              return user;
          }

        }
        throw new UserNotFoundException("User not found");
    }

    public static void validateUser(User user) throws AccessDeniedException{
            if (user.age < 18 ) {
                throw new AccessDeniedException("Ваш возрост меньше 18!");
            }
    }
}
