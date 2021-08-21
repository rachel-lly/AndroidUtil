package com.example.androidutil.designmodel.visitor;

class CTOVisitor implements Visitor{
    @Override
    public void visit(Engineer engineer) {
        System.out.println("Name:"+engineer.name+"\tkpi:"+engineer.kpi+"\tCodeLines:"+engineer.getCodeLines());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("Name:"+manager.name+"\tkpi:"+manager.kpi+"\tproduct:"+manager.getProduce());
    }
}
