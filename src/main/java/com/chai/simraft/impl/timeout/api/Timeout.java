package com.chai.simraft.impl.timeout.api;

import com.chai.simraft.impl.common.LifeCircle;
import com.chai.simraft.impl.timeout.spi.TimeoutCallback;

/**
 * Created by chaishipeng on 2017/4/13.
 */
public interface Timeout extends LifeCircle {

    void reset();

    void registerCallback(TimeoutCallback callback);

}
