package com.alexey.starter;

import com.alexey.dao.impl.*;
import com.alexey.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StarterAppDal {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        Administrator administrator = new Administrator("Admin", "Adminovich", "hell@gmail.com",
                "U43hd2fkdd", "control", 1);
        AdministratorDaoImpl.getInstance().create(administrator, session);

        Teacher teacher1 = new Teacher("Albert", "Einstein", "einstein@gmail.com",
                "01001001", "distribution", 2);
        Teacher teacher2 = new Teacher("Maria", "Curie", "curie@gmail.com",
                "ewfwwwwssdDD", "teaching", 3);
        TeacherDaoImpl.getInstance().create(teacher1, session);
        TeacherDaoImpl.getInstance().create(teacher2, session);

        Student student1 = new Student("Ivan", "Ivanovich", "ivan@gmail.com",
                "iv378vi", "study", 4);
        Student student2 = new Student("Petrov", "Petrovich", "petr@gmail.com",
                "pe935pe", "study", 5);
        Student student3 = new Student("Alesya", "Alesyanovich", "ales@gmail.com",
                "al735la", "study", 6);
        Student student4 = new Student("Rick", "Rickovich", "rick@gmail.com",
                "ri163ri", "study", 7);
        StudentDaoImpl.getInstance().create(student1, session);
        StudentDaoImpl.getInstance().create(student2, session);
        StudentDaoImpl.getInstance().create(student3, session);
        StudentDaoImpl.getInstance().create(student4, session);

        Group group1 = new Group("group 001");
        Group group2 = new Group("group 002");
        GroupDaoImpl.getInstance().create(group1, session);
        GroupDaoImpl.getInstance().create(group2, session);

        UserGroupLink userGroupLink1 = new UserGroupLink(1, 1);
        UserGroupLink userGroupLink2 = new UserGroupLink(1, 2);
        UserGroupLink userGroupLink3 = new UserGroupLink(2, 1);
        UserGroupLink userGroupLink4 = new UserGroupLink(3, 2);
        UserGroupLink userGroupLink5 = new UserGroupLink(4, 1);
        UserGroupLink userGroupLink6 = new UserGroupLink(5, 1);
        UserGroupLink userGroupLink7 = new UserGroupLink(6, 2);
        UserGroupLink userGroupLink8 = new UserGroupLink(7, 2);
        UserGroupLinkDaoImpl.getInstance().create(userGroupLink1, session);
        UserGroupLinkDaoImpl.getInstance().create(userGroupLink2, session);
        UserGroupLinkDaoImpl.getInstance().create(userGroupLink3, session);
        UserGroupLinkDaoImpl.getInstance().create(userGroupLink4, session);
        UserGroupLinkDaoImpl.getInstance().create(userGroupLink5, session);
        UserGroupLinkDaoImpl.getInstance().create(userGroupLink6, session);
        UserGroupLinkDaoImpl.getInstance().create(userGroupLink7, session);
        UserGroupLinkDaoImpl.getInstance().create(userGroupLink8, session);

        Course course1 = new Course("Java Basics", 1);
        Course course2 = new Course("Photoshop", 2);
        CourseDaoImpl.getInstance().create(course1, session);
        CourseDaoImpl.getInstance().create(course2, session);

        Topic topic1 = new Topic("Datatypes", "...", 1);
        Topic topic2 = new Topic("Variables", "...", 1);
        Topic topic3 = new Topic("Methods", "...", 1);
        Topic topic4 = new Topic("Array", "...", 1);
        Topic topic5 = new Topic("Classes", "...", 1);
        Topic topic6 = new Topic("Creating a New Image", "...", 2);
        Topic topic7 = new Topic("Text & Layers", "...", 2);
        Topic topic8 = new Topic("Masks", "...", 2);
        Topic topic9 = new Topic("Filters", "...", 2);
        Topic topic10 = new Topic("Landscape", "...", 2);
        TopicDaoImpl.getInstance().create(topic1, session);
        TopicDaoImpl.getInstance().create(topic2, session);
        TopicDaoImpl.getInstance().create(topic3, session);
        TopicDaoImpl.getInstance().create(topic4, session);
        TopicDaoImpl.getInstance().create(topic5, session);
        TopicDaoImpl.getInstance().create(topic6, session);
        TopicDaoImpl.getInstance().create(topic7, session);
        TopicDaoImpl.getInstance().create(topic8, session);
        TopicDaoImpl.getInstance().create(topic9, session);
        TopicDaoImpl.getInstance().create(topic10, session);

        User foundUser1 = UserDaoImpl.getInstance().readById(1, session);
        Object foundUser2 = UserDaoImpl.getInstance().readById(2, session);
        System.out.println(foundUser1);
        System.out.println(foundUser2);

//        foundUser1.setFirstName("Rob");
//        foundUser1.setLastName("Robokovich");
//        foundUser1.setEmail("Rob@gmail.com");
//        foundUser1.setPassword("RRRw2");
//        UserDaoImpl.getInstance().update(foundUser1, session);
//        System.out.println(UserDaoImpl.getInstance().readById(1, session));

//        UserGroupLinkDaoImpl.getInstance().delete(userGroupLink1, session);
//        UserGroupLinkDaoImpl.getInstance().delete(userGroupLink2, session);
//        AdministratorDaoImpl.getInstance().delete(administrator, session);

        session.close();
    }
}
