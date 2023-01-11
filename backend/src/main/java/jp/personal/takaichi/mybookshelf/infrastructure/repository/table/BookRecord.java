package jp.personal.takaichi.mybookshelf.infrastructure.repository.table;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookRecord {

  private String id;

  private String title;
  
  private String auther;
  
  private String genre;
  
  private int score;
  
  private String report;
  
  private Date createdAt;
  
  private Date updatedAt;
}
