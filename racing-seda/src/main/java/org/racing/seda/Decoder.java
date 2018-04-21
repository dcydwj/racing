package org.racing.seda;

/**
 * Created by dennis on 2016/4/22.
 */
public interface Decoder<T> {

    T decode(String input);
}
