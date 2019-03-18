create or replace procedure procedure_insert_booking(
	i_personnel number,
	i_book_number varchar2,
	i_movie_start varchar2,
	i_member_id varchar2,
	i_screen_num varchar2,
	cnt out number)
	
is

begin 
	insert into book(personnel, book_number, movie_start, member_id, screen_num)
	values(i_personnel, concat(i_book_number, trim(to_char(seq_book.nextval, '000'))), 
		to_date(i_movie_start, 'yyyy-mm-dd hh24:mi:ss'), i_member_id, i_screen_num);
		
	cnt := sql%rowcount;
	
end;
/
	