--本のリスト初期データ
--idカラムはオートインクリメントなので不要
INSERT INTO booktable
(book_name, volume_num,author_name,published_date)
VALUES
('HUNTER X HUNTER',36,'冨樫義博','2018-10-04'),
('SLAM DUNK',1,'井上雄彦','1991-2-8'),
('Spring解体新書',2,'田村達也','2021-2-28'),
('Doncker&Kubernetesのきほんのきほん',1,'小笠原種高','2021-9-20'),
('入門SQL',1,'木村博文、髙橋麻奈','2000-6-2'),
('羅生門',1,'芥川龍之介','1915-11-01')
;