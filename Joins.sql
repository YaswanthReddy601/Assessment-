

-- student definition
CREATE TABLE `student` (
  `student_id` varchar(100) NOT NULL,
  `student_name` varchar(100) ,
  `student_age` int ,
  PRIMARY KEY (`student_id`)
);

--insert queries 

insert into student values('501','sai',21);
insert into student values('502','varun',21);
insert into student values('503','yaswanth',21);
insert into student values('504','syed',22);
insert into student values('505','shyam',23);
insert into student values('506','kiram',23);
insert into student values('507','krishna',23);
insert into student values('508','john',23);
insert into student values('509','mike',23);
insert into student values('510','don',20);


-- college definition
CREATE TABLE `college` (
  `student_id` varchar(100) NOT NULL,
  `college_name` varchar(100) ,
  `branch_name` varchar(100) ,
  PRIMARY KEY (`student_id`),
  CONSTRAINT `college_FK` FOREIGN KEY (`student_id`) REFERENCES `student` (`student_id`)
);

-- insert queries 
insert into college values('501','Mits','CSE');
insert into college values('502','svtm','mech');
insert into college values('503','JNTUA','Civil');
insert into college values('504','JNTUA','EEE');
insert into college values('505','Mits','CSE');
insert into college values('506','Mits','cse');
insert into college values('507','SVTM','ECE');
insert into college values('508','JNTUA','ECE');



select * from student s inner join college c on s.student_id = c.student_id;		-- inner join

select * from student s left join college c on s.student_id = c.student_id ;   -- left join

select * from student s right join college c on s.student_id = c.student_id ;	-- right join

select * from student s cross join college c;  -- cross join
