package jp.personal.takaichi.mybookshelf.domain.model.bookrecord;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Title {
  
  String value;

  public static Title of(String title) {
    return new Title(title);
  }
}
