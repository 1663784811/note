package com.cyyaw;

public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}