package com.example.androidutil.designmodel.composite;

import java.util.ArrayList;
import java.util.List;

class Composite extends Component{

    private List<Component> components = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println(name);
        if(components != null){
            for(Component c:components){
                c.doSomething();
            }
        }
    }
    @Override
    public void addChild(Component child){
        components.add(child);
    }
    @Override
    public void removeChild(Component child){
        components.remove(child);
    }
    @Override
    public Component getChild(int index){
        return components.get(index);
    }
}
