package com.example.androidutil.designmodel.composite;

class Leaf extends Component{
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println(name);
    }

    @Override
    public void addChild(Component child) {
        throw new UnsupportedOperationException("no child");
    }

    @Override
    public void removeChild(Component child) {
        throw new UnsupportedOperationException("no child");
    }

    @Override
    public Component getChild(int index) {
        throw new UnsupportedOperationException("no child");
    }
}
