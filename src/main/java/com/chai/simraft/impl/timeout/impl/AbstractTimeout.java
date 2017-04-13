package com.chai.simraft.impl.timeout.impl;

import com.chai.simraft.impl.timeout.api.Timeout;
import com.chai.simraft.impl.timeout.spi.TimeoutCallback;

/**
 * Created by chaishipeng on 2017/4/13.
 */
public class AbstractTimeout implements Timeout {

    private TimeoutCallback callback;

    public void reset() {

    }

    public void registerCallback(TimeoutCallback callback) {
        this.callback = callback;
    }

    public void start() {

    }

    public void stop() {

    }

    public boolean isRunning() {
        return false;
    }
}
