--booktable‚ª‚ ‚ê‚Îíœ
DROP TABLE IF EXISTS booktable;

--booktable‚ª‚È‚¯‚ê‚ÎV‚µ‚­ì¬
CREATE TABLE IF NOT EXISTS booktable(
id INT AUTO_INCREMENT,
book_name VARCHAR(50) NOT NULL,
volume_num INT NOT NULL,
author_name VARCHAR(50) NOT NULL,
published_date DATE NOT NULL,
PRIMARY KEY(id)
);