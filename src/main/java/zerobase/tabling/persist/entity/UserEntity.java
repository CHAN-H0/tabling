package zerobase.tabling.persist.entity;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "USER")
public class UserEntity implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private int userStatus;

    @Transient
    private List<String> roles;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = this.roles.stream()
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());

        String role;
        switch (this.userStatus) {
            case 1:
                role = "ROLE_ADMIN";
                break;
            case 2:
                role = "ROLE_MANAGER";
                break;
            case 3:
                role = "ROLE_USER";
                break;
            default:
                throw new IllegalArgumentException("Unknown user status: " + this.userStatus);
        }
        authorities.add(new SimpleGrantedAuthority(role));

        return authorities;
    }
}
