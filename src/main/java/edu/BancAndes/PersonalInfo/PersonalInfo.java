package edu.BancAndes.PersonalInfo;

import edu.BancAndes.IdType.IdType;
import edu.BancAndes.Location.Location;

public class PersonalInfo {
  private long id;
  private IdType idType;
  private final Location location;

  public PersonalInfo(long id, IdType idType, Location location){
    this.id = id;
    this.idType = idType;
    this.location = location;
  }
}
