package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;


import java.util.Date;

public class Program2 {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        System.out.println("\n ==== Test 1 : Seller insert ====");
        Department newDepartment = new Department(null, "Music");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

        System.out.println("\n ==== Test 2: Seller update ====");
        Department department = departmentDao.findById(1);
        department.setName("Food");
        departmentDao.update(department);
        System.out.println("Update completed!");

        System.out.println("\n==== Test 3: Seller findById ====");
        department = departmentDao.findById(3);
        System.out.println(department);
    }

}
