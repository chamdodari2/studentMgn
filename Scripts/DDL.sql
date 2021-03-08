-- 학생관리
DROP SCHEMA IF EXISTS studentmgn;

-- 학생관리
CREATE SCHEMA studentmgn;

-- 학생성적
CREATE TABLE studentmgn.studentScore (
	stdNo    INT(8) NOT NULL COMMENT '학번', -- 학번
	subject1 INT(3) NULL     COMMENT '1과목', -- 1과목
	subject2 INT(3) NULL     COMMENT '2과목', -- 2과목
	subject3 INT(3) NULL     COMMENT '3과목' -- 3과목
)
COMMENT '학생성적';

-- 학생성적
ALTER TABLE studentmgn.studentScore
	ADD CONSTRAINT PK_studentScore -- 학생성적 기본키
		PRIMARY KEY (
			stdNo -- 학번
		);

-- 병역
CREATE TABLE studentmgn.militaryState (
	militaryCode VARCHAR(3)  NOT NULL COMMENT '병역코드', -- 병역코드
	militaryName VARCHAR(13) NOT NULL COMMENT '병역구분' -- 병역구분
)
COMMENT '병역';

-- 병역
ALTER TABLE studentmgn.militaryState
	ADD CONSTRAINT PK_militaryState -- 병역 기본키
		PRIMARY KEY (
			militaryCode -- 병역코드
		);

-- 학적상태
CREATE TABLE studentmgn.stdState (
	stateCode VARCHAR(3) NOT NULL COMMENT '학적코드', -- 학적코드
	stateName VARCHAR(2) NOT NULL COMMENT '학적구분' -- 학적구분
)
COMMENT '학적상태';

-- 학적상태
ALTER TABLE studentmgn.stdState
	ADD CONSTRAINT PK_stdState -- 학적상태 기본키
		PRIMARY KEY (
			stateCode -- 학적코드
		);

-- 성적 환산표
CREATE TABLE studentmgn.gradeConvertion (
	scoreMin   INT(3)     NOT NULL COMMENT '최소실점수', -- 최소실점수
	scoreMax   INT(3)     NOT NULL COMMENT '최대실점수', -- 최대실점수
	grade      VARCHAR(1) NOT NULL COMMENT '평어', -- 평어
	gradescore DOUBLE     NOT NULL COMMENT '평점' -- 평점
)
COMMENT '성적 환산표';

-- 학생정보
CREATE TABLE studentmgn.studentManagement (
	stdNo        INT(8)      NOT NULL COMMENT '학번', -- 학번
	stdName      VARCHAR(5)  NOT NULL COMMENT '이름', -- 이름
	deptCode     VARCHAR(1)  NOT NULL COMMENT '학과코드', -- 학과코드
	grade        INT(1)      NOT NULL COMMENT '학년', -- 학년
	stateCode    VARCHAR(3)  NOT NULL COMMENT '학적코드', -- 학적코드
	militaryCode VARCHAR(3)  NOT NULL COMMENT '병역코드', -- 병역코드
	idNo         VARCHAR(13) NOT NULL COMMENT '주민번호', -- 주민번호
	hpNo         VARCHAR(13) NULL     COMMENT '연락처', -- 연락처
	dayNighShift VARCHAR(2)  NOT NULL COMMENT '주야' -- 주야
)
COMMENT '학생정보';

-- 학생정보
ALTER TABLE studentmgn.studentManagement
	ADD CONSTRAINT PK_studentManagement -- 학생정보 기본키
		PRIMARY KEY (
			stdNo -- 학번
		);

-- 학과
CREATE TABLE studentmgn.department (
	deptCode VARCHAR(1) NOT NULL COMMENT '학과코드', -- 학과코드
	deptName VARCHAR(5) NOT NULL COMMENT '학과명' -- 학과명
)
COMMENT '학과';

-- 학과
ALTER TABLE studentmgn.department
	ADD CONSTRAINT PK_department -- 학과 기본키
		PRIMARY KEY (
			deptCode -- 학과코드
		);

-- 학생성적
ALTER TABLE studentmgn.studentScore
	ADD CONSTRAINT FK_studentManagement_TO_studentScore -- 학생정보 -> 학생성적
		FOREIGN KEY (
			stdNo -- 학번
		)
		REFERENCES studentmgn.studentManagement ( -- 학생정보
			stdNo -- 학번
		);

-- 학생정보
ALTER TABLE studentmgn.studentManagement
	ADD CONSTRAINT FK_stdState_TO_studentManagement -- 학적상태 -> 학생정보
		FOREIGN KEY (
			stateCode -- 학적코드
		)
		REFERENCES studentmgn.stdState ( -- 학적상태
			stateCode -- 학적코드
		);

-- 학생정보
ALTER TABLE studentmgn.studentManagement
	ADD CONSTRAINT FK_militaryState_TO_studentManagement -- 병역 -> 학생정보
		FOREIGN KEY (
			militaryCode -- 병역코드
		)
		REFERENCES studentmgn.militaryState ( -- 병역
			militaryCode -- 병역코드
		);

-- 학생정보
ALTER TABLE studentmgn.studentManagement
	ADD CONSTRAINT FK_department_TO_studentManagement -- 학과 -> 학생정보
		FOREIGN KEY (
			deptCode -- 학과코드
		)
		REFERENCES studentmgn.department ( -- 학과
			deptCode -- 학과코드
		);