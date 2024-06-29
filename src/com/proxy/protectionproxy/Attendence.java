package com.proxy.protectionproxy;
import java.util.Date;
public class Attendence {
    private Date date;
    private boolean isPresent;

    public Attendence(Date date, boolean isPresent) {
        this.date = date;
        this.isPresent = isPresent;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }
}
