package jp.personal.takaichi.mybookshelf.presentation.dto;

import lombok.NonNull;
import lombok.Value;

@NonNull
@Value(staticConstructor = "of")
public class FetchBookRecordResponseDto {

  String id;
  String title;
  String auther;
  String genre;
  int score;
  String report;
  
}
