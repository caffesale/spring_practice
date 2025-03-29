package hellojpa;

import javax.persistence.Entity;

@Entity
public class Member {
  @Id
  private Long id;
  private String name;
  private int age;
}
