package jp.personal.takaichi.mybookshelf.domain.model.bookrecord;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Score {
  
  int value;

  public static Score of(int score) {
    return new Score(score);
  }
}
