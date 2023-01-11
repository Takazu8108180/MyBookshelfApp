/* 既存のテーブル削除 */
DROP TABLE IF EXISTS book_records;

/* 記録用テーブル作成 */
CREATE TABLE book_records(
  id VARCHAR(36) NOT NULL,
  title VARCHAR(255) NOT NULL,
  auther VARCHAR(255) NOT NULL,
  genre VARCHAR(255) NOT NULL,
  score INT NOT NULL,
  report TEXT NOT NULL,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY(id)
);
