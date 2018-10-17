package com.company;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

public class Menu {
    //has a:
    // logged in user
    //ArrayList<User> user
    //scanner

    User currentUser;
    Scanner keyboard = new Scanner(System.in);
    ArrayList userList = new ArrayList();
    boolean exit;
    //can-do:
    //constructor
    //displayMenu
    //reactToUser

    public void displayMenu() {
        out.println("Main Menu\n" +
                "1) Create a new user\n" +
                "2) Become an existing user\n" +
                "3) Create a post as the current user\n" +
                "4) Print all posts\n" +
                "5) Print all users\n" +
                "6) Exit");
        if (currentUser != null)
            out.println("You are currently user " + currentUser.name + ". What would you like to do?");
        int option = keyboard.nextInt();
        keyboard.skip("\n");
        if (option == 1)
            createNewUser();
        if (option == 2)
            becomeAnExistingUser();
        if (option == 3)
            CreateAPostAsTheCurrentUser();
        if (option == 4)
            printAllPosts();
        if (option == 5)
            printAllUsers();
        if (option == 6)
            exit = true;

    }

    public void createNewUser() {
        out.println("Please enter the web address (url) to avatar picture");
        String avatarUrl = keyboard.nextLine();
        out.println("Please enter the username");
        String userName = keyboard.nextLine();
        out.println("Please enter the name");
        String name = keyboard.nextLine();
        out.println("Please enter the email address");
        String email = keyboard.nextLine();

        User user = new User(avatarUrl, userName, name, email);
        userList.add(user);
    }

    public void becomeAnExistingUser() {
        if(userList.size() != 0) {
            for (int i = 0; i < userList.size(); i++) {
                User user = (User) userList.get(i);
                //out.println(i+" "+ userl.get(i).getName());
                out.println((i + 1) + " " + user.name);
            }
            out.println("Select a user");
            //int num = keyboard.nextInt();
            //keyboard.skip("\n");
            currentUser = (User) userList.get(keyboard.nextInt() - 1);
            keyboard.skip("\n");
        }
        else
            out.println("There are no existing users \n");

    }

    public void CreateAPostAsTheCurrentUser() {
        if (currentUser != null) {
            if (currentUser.postList.size() != 0) {
                int lastPostNum = currentUser.postList.size();
                out.println(currentUser.postList.get(lastPostNum - 1).postContent);
            }
            out.println("Type in the next post content and url");
            String nextPostContent = keyboard.nextLine();
            String nextPostUrl = keyboard.nextLine();
            Post p = new Post(currentUser, nextPostContent, nextPostUrl);
            currentUser.addPost(p);
        }
        else
            out.println("There is no current user");
    }

    public void printAllPosts() {
        if(currentUser != null && currentUser.postList.size() != 0) {
            for (int i = 0; i < currentUser.postList.size(); i++) {
                Post p = currentUser.postList.get(i);
                out.println(p.postContent);
                out.println(p.url);
            }
        }
        else
            out.println("There are no existing posts of current user");
    }

    public void printAllUsers() {
        if(userList.size() != 0) {
            for (int i = 0; i < userList.size(); i++) {
                User user = (User) userList.get(i);
                out.println((i + 1) + " " + user.name);
            }
        }
        else
            out.println("There are no existing users ");
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        while (!menu.exit)
            menu.displayMenu();
    }
}
