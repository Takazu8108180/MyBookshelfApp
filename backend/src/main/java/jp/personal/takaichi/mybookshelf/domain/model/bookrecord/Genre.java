package jp.personal.takaichi.mybookshelf.domain.model.bookrecord;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Genre {
  
  String value;

  public static Genre of(String genre) {
    return new Genre(genre);
  }
}
