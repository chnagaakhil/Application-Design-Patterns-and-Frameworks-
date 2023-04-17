/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Comparator;

/**
 *
 * @author AJAY
 */
public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getGpa() < s2.getGpa()) {
            return 1;
        } else if (s1.getGpa() == s2.getGpa()) {
            return 0;
        } else {
            return -1;
        }
    }

}
