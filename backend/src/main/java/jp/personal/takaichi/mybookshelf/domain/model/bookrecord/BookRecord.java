package jp.personal.takaichi.mybookshelf.domain.model.bookrecord;

import java.util.Date;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE, staticName = "of")
public class BookRecord {
  
  @NonNull
  private final Id id;

  @NonNull
  private Title title;
  
  @NonNull
  private Auther auther;
  
  @NonNull
  private Genre genre;
  
  @NonNull
  private Score score;
  
  @NonNull
  private Report report;
  
  // @NonNull
  // private Date createdAt;
  
  // @NonNull
  // private Date updatedAt;

  public static BookRecord reconstruct(String id, String title, String auther, String genre, int score, String report) {
    return BookRecord.of(
      Id.of(id),
      Title.of(title),
      Auther.of(auther),
      Genre.of(genre),
      Score.of(score),
      Report.of(report)
    );
  }
}
