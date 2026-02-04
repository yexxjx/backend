create database mydb0203;
use mydb0203;

-- [1] 테이블 생성
-- create table 테이블명(속성명 타입 제약조건, 속성명 타입 제약조건);
create table test1(속성명 int);

-- [2] 테이블 목록 보기
show tables;

-- 2개 이상의 속성명 정의한 테이블
create table test2(속성명1 int, 속성명2 int);

-- [3] 테이블 삭제 drop table 테이블명; drop table/database if exists 테이블/데이터베이스명;
drop table if exists test1;

-- [4] 테이블 간단 조회 select 속성명1, 속성명2 from 테이블명; select*from 테이블명;
select*from test2;

-- [5] 다양한 데이터타입의 테이블 생성
create table test3(
정수속성1 tinyint, 정수속성2 smallint, 정수속성3 mediumint,
정수속성4 int, 정수속성5 bigint, 정수속성6 int unsigned, -- signed 부호있는(+-) unsigned 부호없는
실수속성1 float, 실수속성2 double, 실수속성3 decimal, -- decimal 문자 타입으로 실수 표현(오차x/부동소수점x)
날짜속성 date, 시간속성 time, 날짜시간속성 datetime,
문자속성1 char(5), -- 고정길이의 문자타입, char(5) > 유재석 > [유][재][석][ ][ ] 2칸 남음,
문자속성2 varchar(5), -- 가변길이의 문자타입, varchar(5) > 유재석 > [유][재][석] 남은 칸 알아서 삭제,
문자속성3 text, 문자속성4 longtext, -- 4G 대용량,
논리속성 bool -- true 또는 false, tinyint 취급, 1 또는 0
);
select*from test3;

-- [*] 방문록 기록하는 테이블 설계
create table comment(
content varchar(255), -- 내용물 최대 255글자
writer varchar(20) -- 작성자 최대 20글자
);
select*from comment;

-- [*] 대기 명단 기록하는 테이블 설계
create table waiting(
count tinyint unsigned, -- 인원수 최대 정수 0~255까지, signed +-128
phone char(13) -- 연락처 최대 13글자까지 고정길이 문자
);
select*from waiting;

drop table if exists test5;
drop table if exists test4;

-- [6] 제약조건 : 테이블 내 데이터들의 문제의 결함이 되는 입력 방지/해결
create table test4(
# 속성명 타입 제약조건명
속성명1 tinyint not null, -- not null? 해당 속성값들은 null 저장할 수 없음
속성명2 smallint unique, -- unique? 해당 속성값들은 중복이 불가능함
속성명3 int default 10, -- default 자료? 만일 해당 속성에 초기값이 생략되면 기본값 자료 사용
속성명4 bigint auto_increment, -- auto_increment? 만일 해당 속성에 초기값이 생략되면 자동번호 부여
constraint primary key(속성명4)
-- 속성명5 mediumint primary key -- primary? pk(식별/기본)키, 식별 가능한 고유한 값 가진 키
							    -- 중복없음 unique+빈칸없음 not null, 학번/사번/주민등록번호/제품번호 등
							     -- constraint primary key(속성명5)
);

create table test5(
속성명1 bigint,
-- foreign key? fk(참조/외래), 다른 테이블의 기본키(pk) 참조
-- constraint foreign key(FK 속성명) references 테이블명(pk필드명)  -- 중복 가능, 빈칸 가능
															   --  pk(1):fk(n) 관계에서 fk: 수강신청한학번 휴가신청한사원 구매한제품번호 등
															    -- on update/delete restrict? pk가 삭제/수정될 때 fk가 참조중이면 삭제/수정 불가능 관계 <자식이 있으면 부모 삭제 불가능>
																 -- cascade? pk가 삭제/수정될 때 fk 필드의 레코드도 같이 삭제 <게시물 삭제되면 댓글도 같이 삭제>
                                                                  -- set null? pk가 삭제/수정될 때 fk는 null 변경 관계 <게시물 삭제되면 댓글 참조는 null>
constraint foreign key(속성명1) references test4(속성명4) on delete set null
);
select*from test5;

-- [5] 회웑제 게시판 설계
-- 관례 순서
drop database if exists boradservice6; -- 이미 존재할 수 있으므로 데이터베이스 삭제
create database boardservice6;
use boardservice6;

create table member(
mno int auto_increment, -- 회원번호, 정수타입, 자동번호 부여
mid varchar(30) not null unique, -- 회원아이디, 문자타입(30), 빈칸불가능, 중복불가능
mpw varchar(30) not null, -- 회원비밀번호, 문자타입(30), 빈칸불가능
mname varchar(10), -- 회원닉네임, 문자타입(10)
mphone char(13), -- 회원연락처, 문자타입(13)
constraint primary key(mno) -- 회원번호 틀 pk(식별키) 선정
);
select*from member;

create table product(
pno int auto_increment,
pname varchar(100) not null unique,
pprice int unsigned default 0, -- 가격이므로 음수는 필요없어서 unsigned, 초기값 생략시 0
pcomment longtext, -- 최대 4GB까지 가능한 문자타입
pdate datetime default now(), -- 날짜/시간타임, 기본값을 현재 시스템 날짜/시간 자동 부여
mno int, -- fk로 사용할 필드명의 타입은 pk 필드명과 일치, 필드/속성명 일치 권장
constraint primary key(pno), -- pno 속성에 pk 설정
constraint foreign key(mno) references member(mno) on delete cascade -- 회원이 탈퇴하면 그 회원의 제품도 삭제
);
select*from product;
-- ER 다이어그램 : 여러 객체 틀 간의 크게 시각적, ERD 다이어그램 : 데이터베이스 테이블 간의 관계 시각적
-- menu database > reverse engineer 
