package com.logic.examples;

import com.logic.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExamples {

    private final static List<User> users = new ArrayList();
    // private final static List<User> users = new ArrayList<>(); // valido
    // private final static List<User> users = new ArrayList<User>();  // valido pero redundante

    public static List<User> getUsers() {
        return users;
    }

    public static List<User> getUsers(int p) {
        System.out.println(users.get(p));
        return users;
    }

    public static void createUser(String nickName, String passwork, String email) {
        if (findUser(nickName) == null) { // if con contein
            User user = new User(nickName, passwork, email);
            users.add(user);
        } else {
            System.out.println("Es nickName ya existe,elige otro");
        }
    }

    public static void createUser(User user) {
        if (user!= null) {
            users.add(user);
            
        }else System.out.println("no es un registro valido");
        
    }
    public static boolean addUsers ( User... users){
        ListExamples.users.addAll(Arrays.asList(users));
        return false;        
    }

    public static void showAllUsers() {
        if (!users.isEmpty()) {  //  igual que decir ----  users.size()>0
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i) != null) {
                    System.out.println(users.get(i));
                } else {
                    System.out.println("Este elemento no tiene nombre");
                }
            }
        } else {
            System.out.println("No hay valores que mostrar");
        }
    }
//    public static void showAllUsers() {
//        if (!users.isEmpty()) {  //  igual que decir ----  users.size()>0
//            for (int i = 0; i < users.size(); i++) {
//                if (users.get(i) != null) {
//                    System.out.println(users.get(i));
//                } else {
//                    System.out.println("Este elemento no tiene nombre");
//                }
//            }
//        } else {
//            System.out.println("No hay valores que mostrar");
//        }
//    }

    public static void setUsers(int p, String nickName, String passwork, String email) {
        User user1 = new User(nickName, passwork, email);
        users.remove(users.get(p));
        users.add(p, user1);
    }

    public static void deleteUsers(int p) {
        users.remove(users.get(p));
    }

    public static User findUser(String name) {
        for (User user : users) {
            if (user.getNickName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    public static void updateUser(String nickName, String... args) {
        User user = findUser(nickName);
        if (user != null) {
            for (int i = 0; i < args.length; i++) {
                if (i == 0 && args[i] != null) {
                    user.setNickName(args[i]);
                }
                if (i == 1 && args[i] != null) {
                    user.setPasswork(args[i]);
                }
                if (i == 2 && args[i] != null) {
                    user.setEmail(args[i]);
                }

            }

        }

    }
    public static boolean removeUser(String nikeName){
        return users.remove(findUser(nikeName));
    }
    public static void showUser(String nickName){
        
       System.out.println(( (findUser(nickName))!= null)? findUser(nickName): "No hay ningun usuario con ese nombre");
    }

//    public static void showUser(String nickName, int mail) {
//        if (!users.isEmpty()) {
//            for (int i = 0; i < users.size(); i++) {
//
//                switch (mail) {
//                    case 1:
//                        if (users.get(i).getNickName().equals(nickName)) {
//                            System.out.println("Usted ha buscado el mail de: " + users.get(i).getNickName() + "\n\t " + users.get(i).getEmail());
//                        }
//                        break;
//                    case 2:
//                        if (users.get(i).getNickName().equals(nickName)) {
//                            System.out.println("Usted ha buscado la informacion de: " + users.get(i).getNickName() + "\n\t " + users.get(i));
//                        }
//                        break;
//
//                    default:
//                        throw new AssertionError();
//                }
//
//            }
//        } else {
//            System.out.println("No hay valores que mostrar");
//        }
//    }
//
//    public static void deleteUser(String nickName) {
//
//        if (!users.isEmpty()) {
//            VAL:
//            for (int i = 0; i < users.size(); i++) {
//
//                if (users.get(i).getNickName().equals(nickName)) {
//                    users.remove(i);
//                }
//            }
//        } else {
//            System.out.println("No hay valores que eliminar");
//        }
//
//    }
//    public static void refill(String nickName, int val, Scanner sc) {
//
//        if (!users.isEmpty()) {
//            VAL:
//            for (int i = 0; i < users.size(); i++) {
//                String text = sc.nextLine();
//                if (users.get(i).getNickName().equals(nickName)) {
//                    switch (val) {
//                        case 1:
//                            System.out.println("Introduzca el nuevo nombre: ");
//                            users.get(i).setNickName(text);
//                            break;
//                        case 2:
//                            System.out.println("Introduzca la nueva contraseña");
//                            users.get(i).setPassword(text);
//                            break;
//                        case 3:
//                            System.out.println("Introduzca el nuevo mail");
//                            users.get(i).setEmail(text);
//                            break;
//                        default:
//                            throw new AssertionError();
//                    }
//                }
//
//            }
//        } else {
//            System.out.println("No hay valores que cambiar");
//        }
//
//    }
}
