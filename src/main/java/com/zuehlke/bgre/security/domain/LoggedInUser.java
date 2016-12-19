package com.zuehlke.bgre.security.domain;

import org.springframework.security.core.authority.AuthorityUtils;

public class LoggedInUser extends org.springframework.security.core.userdetails.User {

    public LoggedInUser(User user) {
        super(user.getUsername(), user.getPasswordHash(), AuthorityUtils.NO_AUTHORITIES);
    }
}
