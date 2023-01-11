package jp.personal.takaichi.mybookshelf.domain.model.bookrecord;

import java.util.UUID;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Value;
import lombok.val;

@Value
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Id {

  String value;

  public static Id of(String id) {
    
    // ドメイン内でのNull検証＆例外処理
    // if(id == null) {
    //   throw new DomainExeption;
    // }
    return new Id(id); 
  }

  public static Id generate() {
    val uuid = UUID.randomUUID().toString();
    return Id.of(uuid);
  }
}
