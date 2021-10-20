package edu.BancAndes.Account;

import java.sql.Time;
import java.sql.Timestamp;

public class Account {

  private long id;
  private final String nickname;
  private final String password;
  private final Timestamp creationDate;
  //private

  public Account(long id, String nickname, String password, Timestamp creationDate) {
    this.id = id;
    this.nickname = nickname;
    this.password = password;
    this.creationDate = creationDate;
  }
}
