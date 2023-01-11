package jp.personal.takaichi.mybookshelf.domain.model.bookrecord;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Report {
  
  String value;

  public static Report of(String report) {
    return new Report(report);
  }
}
