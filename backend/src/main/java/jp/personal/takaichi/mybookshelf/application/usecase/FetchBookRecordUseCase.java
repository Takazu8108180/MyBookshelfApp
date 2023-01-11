package jp.personal.takaichi.mybookshelf.application.usecase;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jp.personal.takaichi.mybookshelf.domain.model.bookrecord.Id;
import jp.personal.takaichi.mybookshelf.domain.repository.BookRecordRepository;
import jp.personal.takaichi.mybookshelf.presentation.dto.FetchBookRecordResponseDto;
import lombok.val;

@Component
public class FetchBookRecordUseCase {

  @Autowired
  private BookRecordRepository bookRecordRepository;

  public Optional<FetchBookRecordResponseDto> execute(final String bookRecordId) {
    val bookRecord = bookRecordRepository.findById(Id.of(bookRecordId));

    return bookRecord.map(it -> FetchBookRecordResponseDto.of(
      it.getId().getValue(),
      it.getTitle().getValue(),
      it.getAuther().getValue(),
      it.getGenre().getValue(),
      it.getScore().getValue(),
      it.getReport().getValue()
    ));
  }
}
