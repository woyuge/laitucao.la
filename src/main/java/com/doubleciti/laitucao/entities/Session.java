package com.doubleciti.laitucao.entities;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class Session {
    public User user = null;

    public Session() {}
}
