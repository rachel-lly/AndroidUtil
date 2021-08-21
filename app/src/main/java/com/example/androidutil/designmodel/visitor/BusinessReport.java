package com.example.androidutil.designmodel.visitor;

import java.util.ArrayList;
import java.util.List;

class BusinessReport {
    ArrayList<Staff> staff = new ArrayList<>();

    public BusinessReport() {
        staff.add(new Manager("Manager-Wang"));
        staff.add(new Manager("Manager-Lin"));
        staff.add(new Engineer("Engineer-1"));
        staff.add(new Engineer("Engineer-2"));
        staff.add(new Engineer("Engineer-3"));
        staff.add(new Engineer("Engineer-4"));
    }

    public void showReport(Visitor visitor){
        for(Staff s: staff){
            s.accept(visitor);
        }
    }
}
