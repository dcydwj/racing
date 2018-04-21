package org.racing.seda;


import org.racing.common.NamedThread;

/**
 * Created by dennis on 2016/4/15.
 */
public class Worker extends NamedThread {

    public Worker(String name) {
        super(name);
    }

    public Worker(Runnable target, String name) {
        super(target, name);
    }
}
