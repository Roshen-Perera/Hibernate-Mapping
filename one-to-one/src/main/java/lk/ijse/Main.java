package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Laptop;
import lk.ijse.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Laptop laptop = new Laptop();
        laptop.setId("L001");
        laptop.setBrand("HP");
        laptop.setModel("Pavillion");

        Student student = new Student();
        student.setId("S001");
        student.setName("Roshen");
        student.setAddress("Avissawella");
        student.setLaptop(laptop);

        //session.save(laptop);
        session.save(student);

        transaction.commit();
        session.close();
    }
}
