


-- college definition
CREATE TABLE `college` (
  `student_id` varchar(100) NOT NULL,
  `college_name` varchar(100) DEFAULT NULL,
  `branch_name` varchar(100) DEFAULT NULL,
  KEY `college_FK` (`student_id`),
  CONSTRAINT `college_FK` FOREIGN KEY (`student_id`) REFERENCES `student` (`student_id`)
);

-- student definition
CREATE TABLE `student` (
  `student_id` varchar(100) NOT NULL,
  `student_name` varchar(100) DEFAULT NULL,
  `student_age` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`student_id`)
);

select * from student s inner join college c on s.student_id = c.student_id;		-- inner join

select * from student s left join college c on s.student_id = c.student_id ;   -- left join

select * from student s right join college c on s.student_id = c.student_id ;	-- right join

select * from student s cross join college c;  -- cross join
