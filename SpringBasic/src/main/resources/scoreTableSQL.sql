create table score(
    
    num number(10,0),
    name varchar2(50),
    kor varchar2(50),
    eng varchar2(50),
    math varchar2(50)
);
alter table score add CONSTRAINT socre_pk PRIMARY key (num);
create SEQUENCE score_seq INCREMENT BY 1 START with 1 NOCACHE;

drop SEQUENCE score_seq;

select* from score;