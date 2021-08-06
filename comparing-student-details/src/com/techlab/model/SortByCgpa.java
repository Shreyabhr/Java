package com.techlab.model;

import java.util.Comparator;

public class SortByCgpa implements Comparator<Student>{
	@Override
    public int compare(Student o1, Student o2) {
        return o1.getCgpa() - o2.getCgpa();
    }

}
