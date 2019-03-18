create or replace procedure procedure_insert_seat(
	i_book_number varchar2,
	i_seat_num number,
	i_screen_name varchar2,
	cnt out number)

is

begin
	if i_screen_name = 'N' then 
		insert into standard_seat(seat_num, book_number)
		values(i_seat_num, concat(i_book_number, trim(to_char(seq_book.currval, '000'))));
		cnt := sql%rowcount;
	elsif i_screen_name = 'P' then
		insert into premium_seat(seat_num, book_number)
		values(i_seat_num, concat(i_book_number, trim(to_char(seq_book.currval, '000'))));
		cnt := sql%rowcount;
	end if;	

end;