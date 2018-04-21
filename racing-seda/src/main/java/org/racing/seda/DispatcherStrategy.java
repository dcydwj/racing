package org.racing.seda;

import java.util.List;

/**
 * Created by dennis on 2016/4/15.
 */
public interface DispatcherStrategy {

    Executor selectExecutor(List<Executor> executors);

}
