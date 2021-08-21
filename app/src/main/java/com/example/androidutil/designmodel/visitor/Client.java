package com.example.androidutil.designmodel.visitor;

class Client {
    public static void main(String[] args) {
        BusinessReport report = new BusinessReport();
        System.out.println("CEO visit:");
        report.showReport(new CEOVisitor());
        System.out.println("CTO visit:");
        report.showReport(new CTOVisitor());
    }
}
