package jp.personal.takaichi.mybookshelf.domain.repository;

import java.util.List;
import java.util.Optional;

import jp.personal.takaichi.mybookshelf.domain.model.bookrecord.BookRecord;
import jp.personal.takaichi.mybookshelf.domain.model.bookrecord.Id;

public interface BookRecordRepository {
  List<BookRecord> findAll();
  Optional<BookRecord> findById(Id BookRecordId);
}
