package zerobase.tabling.model;

import lombok.Data;
import zerobase.tabling.persist.entity.UserEntity;

import java.util.List;

public class Auth {

    @Data
    public static class SignIn {
        private String username;
        private String password;

    }

    @Data
    public static class SignUp {
        private String username;
        private String password;
        private List<String> roles;
        private int userStatus;

        public UserEntity toEntity(){
            return UserEntity.builder()
                    .username(this.username)
                    .password(this.password)
                    .roles(this.roles)
                    .userStatus(this.userStatus)
                    .build();
        }
    }


}
