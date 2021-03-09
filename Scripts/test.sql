
select *from department;

create database studentmgn;

grant all on studentmgn.*
	to 'user_studentmgn'@'localhost' identified by 'rootroot';



 -- ----------------------------------- 
select stdNo ,stdName,stateName
from studentManagement m join stdState s on m.stateCode =s.stateCode;
	
-- 평균 구하기  (과목별 평균, 학생별 총점평균, 학년별총점평균)

select * from studentscore ;
 
select avg(subject1) as '1과목평균점수' 
from studentscore;

select stdNo,stdName,stdState from

select * from stdstate;

select stdNo ,stdName,stateName
from studentManagement m join stdState s on m.stateCode =s.stateCode;


