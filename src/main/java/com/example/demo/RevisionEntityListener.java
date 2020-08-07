package com.example.demo;

import org.hibernate.envers.RevisionListener;
import org.springframework.beans.factory.annotation.Autowired;

public class RevisionEntityListener implements RevisionListener {

    private final MyService myService;

    @Autowired
    public RevisionEntityListener(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void newRevision(Object revisionEntity) {
        Revinfo revinfo = (Revinfo) revisionEntity;
    }
}
