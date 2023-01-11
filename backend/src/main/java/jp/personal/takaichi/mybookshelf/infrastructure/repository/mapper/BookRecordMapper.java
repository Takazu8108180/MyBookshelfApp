package jp.personal.takaichi.mybookshelf.infrastructure.repository.mapper;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

import jp.personal.takaichi.mybookshelf.infrastructure.repository.table.BookRecord;


@Mapper
public interface BookRecordMapper {
  
  List<BookRecord> selectAll();
  Optional<BookRecord> selectById(String id);
}
