package com.example.androidutil.designmodel.visitor;

interface Visitor {
    public void visit(Engineer engineer);
    public void visit(Manager manager);
}
