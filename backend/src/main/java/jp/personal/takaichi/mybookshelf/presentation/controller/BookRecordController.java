package jp.personal.takaichi.mybookshelf.presentation.controller;

import static org.springframework.http.ResponseEntity.ok;
import static org.springframework.http.ResponseEntity.status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.personal.takaichi.mybookshelf.application.usecase.FetchBookRecordListUseCase;
import jp.personal.takaichi.mybookshelf.application.usecase.FetchBookRecordUseCase;
import jp.personal.takaichi.mybookshelf.presentation.dto.FetchBookRecordListResponseDto;
import jp.personal.takaichi.mybookshelf.presentation.dto.FetchBookRecordResponseDto;
import lombok.val;

@RequestMapping("/api/v1/bookrecord")
@RestController
@Validated
// @CrossOrigin
public class BookRecordController {
  
  @Autowired
  private FetchBookRecordListUseCase fetchBookRecordListUseCase;

  @Autowired
  private FetchBookRecordUseCase fetchBookRecordUseCase;

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<FetchBookRecordListResponseDto> getBookRecords() { // ResponseEntity...HTTP応答全体（ステータスコード、ヘッダー、および本文）を表す、応答本文として任意のタイプを使用

    val output = fetchBookRecordListUseCase.execute();

    return ok().body(output);
  }

  @GetMapping(value = "/{bookRecordId}", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<FetchBookRecordResponseDto> getBookRecord(@PathVariable String bookRecordId) {
    return fetchBookRecordUseCase.execute(bookRecordId)
      .map(it -> ok().body(it))
      .orElse(status(HttpStatus.NOT_FOUND).build());
  }
}
