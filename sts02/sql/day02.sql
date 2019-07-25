use xe;
DROP TABLE day02;
CREATE TABLE day02 (
	num INT NOT NULL AUTO_INCREMENT,
	name VARCHAR(8) NULL,
	sub VARCHAR(20) NULL DEFAULT '제목없음',
	content TEXT NULL,
	nalja DATETIME NULL,
	PRIMARY KEY (num)
) COLLATE='utf8_general_ci';
-- dummy
insert into day02 (name,sub,content,nalja) 
	values ('테스터','제목1','내용1',now());
	insert into day02 (name,sub,content,nalja) 
	values ('테스터','제목2','내용2',now());
	insert into day02 (name,sub,content,nalja) 
	values ('테스터','제목3','내용3',now());
	insert into day02 (name,sub,content,nalja) 
	values ('테스터','제목4','내용4',now());
commit;
select * from day02;
