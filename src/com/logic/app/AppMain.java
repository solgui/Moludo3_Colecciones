
package com.logic.app;

import com.logic.examples.ListExamples;
import com.logic.model.User;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class AppMain {

  
    public static void main(String[] args) {
      //ListExamples le = new ListExamples();
      ListExamples.createUser("Sol","124","sols@jls.com");
      ListExamples.createUser("Sol","124","sols@jls.com");
      ListExamples.createUser("1Paula","1111@1","paulitas@jls.com");
      ListExamples.createUser(null);
      
      User[] userArr ={new User("Sol","124","sols@jls.com"),
                        new User("Sol","124","sols@jls.com")
      
      };
      ListExamples.addUsers(userArr);
      
      List<User> users=  ListExamples.getUsers();
      
      ListExamples.showAllUsers();
      
      ListExamples.getUsers(2);
      
      ListExamples.deleteUsers(1);
      ListExamples.showAllUsers();  
      
      ListExamples.setUsers(1, "Loquita22222", "4klko6", "jsojtoo@gmail.com");
      ListExamples.showAllUsers(); 
        System.out.println("----------------");
        
        Set<String> nombres = new HashSet<>();
        nombres.add("Juan");
        nombres.add("Juan");
        nombres.add("Juan");
//        Set<User> nombre1 = new HashSet<>(ListExamples.getUsers());
        Set<User> nombre1 = new TreeSet<>(ListExamples.getUsers());
        nombre1.add(new User("Paula","1111@1","paulitas@jls.com"));
        
        User u1 = new User("Cosa","124","sols@jls.com");
        User u2 = new User("Cosa1","124","sols@jls.com");
        System.out.println(u1.equals(u2));
        System.out.println(u1.hashCode());
        System.out.println(u2.hashCode());
      nombres.forEach(s-> System.out.println(s));

      
    }
    
}
