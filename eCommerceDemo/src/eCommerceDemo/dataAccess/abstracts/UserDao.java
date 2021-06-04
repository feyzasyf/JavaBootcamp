package eCommerceDemo.dataAccess.abstracts;

import java.util.List;

import eCommerceDemo.entities.concretes.User;

public interface UserDao {
void add(User user);
void update(User user);
void delete(User user);
void logIn(User user);
User findByEmail(String email);
User findByEmailAndPassword(String email, String password);
User getUser(int id);
List<User> getAll();
}
