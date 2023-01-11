package jp.personal.takaichi.mybookshelf.infrastructure.repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jp.personal.takaichi.mybookshelf.domain.model.bookrecord.BookRecord;
import jp.personal.takaichi.mybookshelf.domain.model.bookrecord.Id;
import jp.personal.takaichi.mybookshelf.domain.repository.BookRecordRepository;
import jp.personal.takaichi.mybookshelf.infrastructure.repository.mapper.BookRecordMapper;
import lombok.val;

@Repository
public class BookRecordRepositoryImpl implements BookRecordRepository {
  
  @Autowired
  private BookRecordMapper bookRecordMapper;

  @Override
  public List<BookRecord> findAll() {
    val records = bookRecordMapper.selectAll();

    return records.stream().map(m -> BookRecord.reconstruct(
      m.getId(),
      m.getTitle(),
      m.getAuther(),
      m.getGenre(),
      m.getScore(),
      m.getReport()
    )).collect(Collectors.toList());
  }

  @Override
  public Optional<BookRecord> findById(Id BookRecordId) {
    val optionalRecord = bookRecordMapper.selectById(BookRecordId.getValue());

    return optionalRecord.map(it -> BookRecord.reconstruct(
      it.getId(),
      it.getTitle(),
      it.getAuther(),
      it.getGenre(),
      it.getScore(),
      it.getReport()
    ));
  }
}
