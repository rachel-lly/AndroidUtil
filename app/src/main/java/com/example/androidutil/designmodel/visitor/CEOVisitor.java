package com.example.androidutil.designmodel.visitor;

class CEOVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("Name:"+engineer.name+"\tkpi:"+engineer.kpi);
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("Name:"+manager.name+"\tkpi:"+manager.kpi+"\tproduct:"+manager.getProduce());
    }
}
