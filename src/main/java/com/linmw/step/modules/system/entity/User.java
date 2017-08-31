package com.linmw.step.modules.system.entity;

public class User {
  private Long id;
  private String login_name;
  private String password;
  private String email;
  private String description;
  private String nickname;
  private String status;
  private String or_logon;
  private String security_password;
  private String salt;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getLogin_name() {
    return login_name;
  }

  public void setLogin_name(String login_name) {
    this.login_name = login_name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getOr_logon() {
    return or_logon;
  }

  public void setOr_logon(String or_logon) {
    this.or_logon = or_logon;
  }

  public String getSecurity_password() {
    return security_password;
  }

  public void setSecurity_password(String security_password) {
    this.security_password = security_password;
  }

  public String getSalt() {
    return salt;
  }

  public void setSalt(String salt) {
    this.salt = salt;
  }
}
