package com.das.auth.service;

import com.das.auth.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import com.das.auth.repository.UserRepository;

/**
 * Created by Dash on 9/2/2018.
 */
@Service(value = "userDetailsService")
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String input) {
        User user = null;

        if (input.contains("@"))
            user = userRepository.findByEmail(input);
        else
            user = userRepository.findByUsername(input);

        if (user == null)
            throw new BadCredentialsException("Bad credentials");

        new AccountStatusUserDetailsChecker().check(user);

        return user;
    }
}
