drop database if exists test;
create database test;
use test;

create table product(
pno int unsigned auto_increment,
constraint primary key(pno),
pnick varchar(5) not null,
pname varchar(20) not null,
pcomment longtext not null,
pprice int not null,
ppw varchar(10) not null,
pphone varchar(13),
pdate datetime default now()
);

INSERT INTO product (pnick, pname, pcomment, pprice, ppw, pphone, pdate) VALUES
('캠핑고수', '감성 캠핑 의자 2개', '사용감 적고 깨끗합니다. 전용 가방 포함해서 드려요.', 35000, 'camp12', '010-1111-2222', NOW()),
('독서왕', '슬램덩크 전권 세트', '소장용으로 구매했던 거라 상태 최상입니다. 박스판이에요.', 150000, 'book99', '010-2222-3333', NOW()),
('애플맨', '에어팟 프로 2세대', '오른쪽 유닛 생활 기스 외 기능 이상 없습니다. 노캔 잘 돼요.', 180000, 'apple0', '010-3333-4444', NOW()),
('나눔천사', '토스터기 (무료나눔)', '작동은 잘 되는데 내부 세척이 좀 필요합니다. 집 앞으로 오셔야 해요.', 0, 'free00', NULL, NOW()),
('게임덕후', '닌텐도 스위치 OLED', '젤다 하려고 샀다가 엔딩 보고 판매합니다. 보호필름 붙어있음.', 320000, 'game77', '010-4444-5555', NOW()),
('운동광', '치닝디핑 철봉', '집이 좁아져서 내놓습니다. 직접 분해해서 가져가셔야 합니다.', 40000, 'fit101', '010-5555-6666', NOW()),
('주부단단', '에어프라이어 5L', '용량이 커서 닭 한 마리 통째로 들어갑니다. 상태 양호해요.', 25000, 'cook55', '010-6666-7777', NOW()),
('음악가', '입문용 통기타', '독학하려고 샀다가 보관만 했습니다. 튜너랑 피크 다 드려요.', 70000, 'music1', '010-7777-8888', NOW()),
('플랜터', '이케아 화분 스탠드', '인테리어 소품으로 썼습니다. 철제라 튼튼하고 예뻐요.', 12000, 'plant0', NULL, NOW()),
('수집가', '레고 스타워즈 기체', '조립 후 전시만 했던 제품입니다. 누락 부품 없습니다.', 95000, 'lego12', '010-8888-9999', NOW());