

-- student definition
CREATE TABLE `student` (
  `student_id` varchar(100) NOT NULL,
  `student_name` varchar(100) DEFAULT NULL,
  `student_age` int DEFAULT NULL,
  PRIMARY KEY (`student_id`)
);

--insert queries to student table

insert into studenttt values('501','sai',21);
insert into studenttt values('502','varun',21);
insert into studenttt values('503','yaswanth',21);
insert into studenttt values('504','syed',22);
insert into studenttt values('505','shyam',23);
insert into studenttt values('506','kiram',23);
insert into studenttt values('507','krishna',23);
insert into studenttt values('508','john',23);
insert into studenttt values('509','mike',23);
insert into collegeee values('510','don',20);


-- college definition
CREATE TABLE `college` (
  `student_id` varchar(100) NOT NULL,
  `college_name` varchar(100) DEFAULT NULL,
  `branch_name` varchar(100) DEFAULT NULL,
  KEY `college_FK` (`student_id`),PRIMARY KEY (`student_id`),
  CONSTRAINT `college_FK` FOREIGN KEY (`student_id`) REFERENCES `student` (`student_id`)
);

-- insert queries 
insert into collegeee values('501','Mits','CSE');
insert into collegeee values('502','svtm','mech');
insert into collegeee values('503','JNTUA','Civil');
insert into collegeee values('504','JNTUA','EEE');
insert into collegeee values('505','Mits','CSE');
insert into collegeee values('506','Mits','cse');
insert into collegeee values('507','SVTM','ECE');
insert into collegeee values('508','JNTUA','ECE');



select * from student s inner join college c on s.student_id = c.student_id;		-- inner join

select * from student s left join college c on s.student_id = c.student_id ;   -- left join

select * from student s right join college c on s.student_id = c.student_id ;	-- right join

select * from student s cross join college c;  -- cross join
