drop table board purge;

create table board(
	seq number primary key,
	title varchar2(50) not null,
	content varchar2(400) not null,
	writer varchar2(20) not null,
	regdate date not null,
	hitcount number
)
drop sequence board_seq;
create sequence board_seq;