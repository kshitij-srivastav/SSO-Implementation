package com.SSO.SSO.Implementation.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

@NoArgsConstructor
public class User {
    String Username;
    String Password;

public  User(String username,String password){
    this.Username=username;
    this.Password=password;
}}
