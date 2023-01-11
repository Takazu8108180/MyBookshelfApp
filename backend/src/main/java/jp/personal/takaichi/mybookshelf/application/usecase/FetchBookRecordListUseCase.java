package jp.personal.takaichi.mybookshelf.application.usecase;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jp.personal.takaichi.mybookshelf.domain.repository.BookRecordRepository;
import jp.personal.takaichi.mybookshelf.presentation.dto.FetchBookRecordListResponseDto;
import lombok.val;

@Component
public class FetchBookRecordListUseCase {

  @Autowired
  private BookRecordRepository bookRecordRepository;
  
  public FetchBookRecordListResponseDto execute(){

    val bookRecords = bookRecordRepository.findAll();

    val bookRecordDtoList = bookRecords.stream()
      .map(it -> FetchBookRecordListResponseDto.BookRecord.of(
        it.getId().getValue(),
        it.getTitle().getValue(),
        it.getAuther().getValue(),
        it.getGenre().getValue(),
        it.getScore().getValue(),
        it.getReport().getValue()
      )).collect(Collectors.toList());
    
    return FetchBookRecordListResponseDto.of(bookRecordDtoList);
  }
}
