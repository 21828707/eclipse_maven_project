create table guestbook_message(
	guestbook_message_id number,
	guestbook_name varchar2(20) not null,
	guestbook_content varchar2(4000) not null,
	primary key (guestbook_message_id)
);

create sequence guestbook_seq;