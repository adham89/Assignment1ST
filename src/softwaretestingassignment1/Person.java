/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaretestingassignment1;

/**
 *
 * @author ad
 */
public class Person {

    public int age;
    public int salary;

    /**
     * @return the age
     */
    public int getPersonAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setPersonAge(int age) {
        this.age = age;
    }

    /**
     * @return the salary
     */
    public int getPersonSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setPersonSalary(int salary) {
        this.salary = salary;
    }

    public boolean isPersonOver18() {

        if (this.age >= 18) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isHighSalary() {
        if (this.salary >= 5000) {
            return true;

        } else {

            return false;

        }
    }

    }
