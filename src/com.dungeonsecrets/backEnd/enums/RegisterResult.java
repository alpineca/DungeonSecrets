package com.dungeonsecrets.backEnd.enums;

public enum RegisterResult {
    REGISTERED, SQL_ERROR, USERNAME_EXIST, EMAIL_EXIST,
    USERNAME_FAIL, EMAIL_FAIL, PASSWORD_FAIL, PASSWORD_NOT_MATCH
}
