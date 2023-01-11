package jp.personal.takaichi.mybookshelf.presentation.dto;

import java.util.List;

import lombok.NonNull;
import lombok.Value;

@NonNull
@Value(staticConstructor = "of")
public class FetchBookRecordListResponseDto {
  
  List<BookRecord> bookRecord;
  
  @NonNull
  @Value(staticConstructor = "of")
  public static class BookRecord {

    String id;
    String title;
    String auther;
    String genre;
    int score;
    String report;
  }
}
