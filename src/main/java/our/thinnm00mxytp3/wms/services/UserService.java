package our.thinnm00mxytp3.wms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import our.thinnm00mxytp3.wms.entities.User;
import our.thinnm00mxytp3.wms.repository.UserRepository;
import our.thinnm00mxytp3.wms.utils.CustomUserDetails;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public CustomUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        return new CustomUserDetails(user);
    }
}
