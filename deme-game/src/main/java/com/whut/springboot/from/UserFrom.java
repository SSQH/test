package com.whut.springboot.from;

import lombok.Data;

@Data
public class UserFrom {
    public String username;
    public String password;

    private String itemInfo;

    private Integer curRoom;
}
