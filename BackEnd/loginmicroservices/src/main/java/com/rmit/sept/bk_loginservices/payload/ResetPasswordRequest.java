package com.rmit.sept.bk_loginservices.payload;

import javax.validation.constraints.NotBlank;

public class ResetPasswordRequest {

    @NotBlank(message = "Username cannot be blank")
    private String username;
    @NotBlank(message = "Password cannot be blank")
    private String oldPassword;

    @NotBlank(message = "New password cannot be blank")
    private  String newPassword;

    @NotBlank(message = "Confirm new password cannot be blank")
    private  String confirmNewPassword;

    public String getPassword() {
        return newPassword;
    }

    public void setPassword(String password) {
        this.newPassword = newPassword;
    }
}