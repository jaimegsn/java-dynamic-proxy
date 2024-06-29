package com.proxy.protectionproxy;

public class Student implements DailySession {

    private Attendence attendence;

    public Student(Attendence attendence) {
        this.attendence = attendence;
    }

    @Override
    public void attendLesson() {
        System.out.println("attending the session...");
    }

    public Attendence getAttendence() {
        return attendence;
    }

    public void setAttendence(Attendence attendence) {
        this.attendence = attendence;
    }
}
