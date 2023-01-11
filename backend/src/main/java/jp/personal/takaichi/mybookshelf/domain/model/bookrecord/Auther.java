package jp.personal.takaichi.mybookshelf.domain.model.bookrecord;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Auther {
  
  String value;

  public static Auther of(String auther) {
    return new Auther(auther);
  }
}
