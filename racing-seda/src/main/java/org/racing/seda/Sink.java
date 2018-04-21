package org.racing.seda;

/**
 * Created by dennis on 2016/4/22.
 */
public interface Sink {

    String take();

    long size();

}
