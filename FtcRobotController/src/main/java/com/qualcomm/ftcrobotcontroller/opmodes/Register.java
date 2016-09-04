package com.qualcomm.ftcrobotcontroller.opmodes;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by chris on 9/3/16.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Register {
    String value();
}
