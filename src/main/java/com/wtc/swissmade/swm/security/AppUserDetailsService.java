package com.wtc.swissmade.swm.security;

import com.wtc.swissmade.swm.models.Role;
import com.wtc.swissmade.swm.models.User;
import com.wtc.swissmade.swm.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
@Transactional
public class AppUserDetailsService implements UserDetailsService {


    private UserRepository userRepository;

    @Autowired
    public AppUserDetailsService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    private static Collection<? extends GrantedAuthority> getAuthorities(User user) {

        String[] userRoles = user.getRoles()
                .stream()
                .map(Role::getName)
                .toArray(String[]::new);

        Collection<GrantedAuthority> authorities = AuthorityUtils.createAuthorityList(userRoles);
        return authorities;
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        User user = userRepository.findByName(userName).orElseThrow(() -> new UsernameNotFoundException("User with name: " + userName + " not found."));
        return new org.springframework.security.core.userdetails.User(user.getName(), user.getPassword(), getAuthorities(user));
    }
}
