package com.proxy.protectionproxy;

public class StudentProxy extends Student{
    public StudentProxy(Attendence attendence) {
        super(attendence);
    }

    @Override
    public void attendLesson(){
        if(!super.getAttendence().isPresent()){
            throw new RuntimeException("Student is not present and can't attend the lesson");
        }
        super.attendLesson();
    }
}
