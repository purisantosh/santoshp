package com.java.week1;

class Child extends ParentClass{
    private int var;

    public Child()
    {
        super();
    }
    public Child(int var) {
        this.var = var;
    }

    public Child(int var, int var1) {
        super(var1);
        this.var = var;
    }

    public int getVar() {
        return var;
    }

    public void setVar(int var) {
        this.var = var;
    }
}
