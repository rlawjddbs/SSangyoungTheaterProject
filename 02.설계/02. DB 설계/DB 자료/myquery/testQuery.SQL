create or replace procedure my_procedure1(
	empno number,
	cur_result out sys_refcursor)
	
is
	input_empno number := empno;
	
begin

	open cur_result for
		select ename, job, sal
		from emp
		where empno = input_empno;
		
end;
/
