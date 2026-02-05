package com.example;

import java.util.HashMap;

public class Container {
    private HashMap<String,IFunc> registry;
    private HashMap<String,IContextualFunc> Contextualregistry;

    public Container(){
        this.registry = new HashMap<String,IFunc>();
        this.Contextualregistry = new HashMap<String,IContextualFunc>();
    }

    public void register(String name , IFunc definition){
        System.out.println(name + " registered as IFunc !");
        this.registry.put(name, definition);
    }

    public void register(String name , IContextualFunc definition){
        System.out.println(name + " registered as IContextualFunc !");
        this.Contextualregistry.put(name, definition);
    }

    public <T> T resolve(String name){
        if(this.registry.containsKey(name)){
            IFunc<T> ifunc = this.registry.get(name);
            return ifunc.func();
        }else if (this.Contextualregistry.containsKey(name)){
            IContextualFunc<T> ifunc = this.Contextualregistry.get(name);
            return ifunc.func(this);
        }
        return null;
    }
}
