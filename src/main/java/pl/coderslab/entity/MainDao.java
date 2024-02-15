package pl.coderslab.entity;

import java.sql.SQLException;

public class MainDao {

  public static void main(String[] args) throws SQLException {
//  test create
//    User dawid = new User();
//    dawid.setEmail("zxczxc@gmail.com");
//    dawid.setUserName("zxczxc");
//    dawid.setPassword("zxczxc");
//    UserDao dawidDao = new UserDao();
//    dawidDao.create(dawid);
//  test read
//    UserDao ja = new UserDao();
//    System.out.println(ja.read(3));
//    System.out.println(ja.read(3).getId());
//    System.out.println(ja.read(3).getEmail());
//    System.out.println(ja.read(3).getUserName());
//    System.out.println(ja.read(3).getPassword());
//    User updated = new User();
//    updated.setUserName("daw");
//    updated.setId(ja.read(3).getId());
//    updated.setEmail("daw@gmail.com");
//    updated.setPassword("daw");
//    ja.update(updated);
//    System.out.println(ja.read(3));
//    System.out.println(ja.read(3).getId());
//    System.out.println(ja.read(3).getEmail());
//    System.out.println(ja.read(3).getUserName());
//    System.out.println(ja.read(3).getPassword());
//UserDao del = new UserDao();
//del.delete(2);
    // test findall
    UserDao findall = new UserDao();
//    findall.findAll();
    for (int i = 0; i < findall.findAll().length; i++) {
      System.out.println(findall.findAll()[i].getId());
      System.out.println(findall.findAll()[i].getEmail());
      System.out.println(findall.findAll()[i].getUserName());
      System.out.println(findall.findAll()[i].getPassword());
    }
  }
}

