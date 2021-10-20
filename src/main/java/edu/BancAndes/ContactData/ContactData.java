package edu.BancAndes.ContactData;

import java.util.Objects;

public class ContactData {

  private final int prefix;
  private final int telephone;

  public ContactData(int prefix, int telephone) {
    this.prefix = prefix;
    this.telephone = telephone;
  }

  public int getPrefix() {
    return prefix;
  }

  public int getTelephone() {
    return telephone;
  }

  @Override
  public boolean equals(Object o) {
    var that = (ContactData) o;
    return prefix == that.prefix && telephone == that.telephone;
  }

  @Override
  public int hashCode() {
    return Objects.hash(prefix, telephone);
  }
}
