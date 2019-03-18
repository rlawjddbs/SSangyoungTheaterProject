package kr.co.sist.cinema.admin.vo;

/**
 * 예매 관리 - 현장 예매 상영 조회
 * @author owner
 */
public class SCABookOnScreenVO {
	private String movie_code, movie_title, screen_name, screen_date, start_time, end_time;
	private int seat_remain, seat_count;
	
	public SCABookOnScreenVO(String movie_code, String movie_title, String screen_name, String screen_date,
			String start_time, String end_time, int seat_remain, int seat_count) {
		this.movie_code = movie_code;
		this.movie_title = movie_title;
		this.screen_name = screen_name;
		this.screen_date = screen_date;
		this.start_time = start_time;
		this.end_time = end_time;
		this.seat_remain = seat_remain;
		this.seat_count = seat_count;
	} // SCABookOnScreenVO

	public String getMovie_code() {
		return movie_code;
	}

	public String getMovie_title() {
		return movie_title;
	}

	public String getScreen_name() {
		return screen_name;
	}

	public String getScreen_date() {
		return screen_date;
	}

	public String getStart_time() {
		return start_time;
	}

	public String getEnd_time() {
		return end_time;
	}

	public int getSeat_remain() {
		return seat_remain;
	}

	public int getSeat_count() {
		return seat_count;
	}

	@Override
	public String toString() {
		return "SCABookOnScreenVO [movie_code=" + movie_code + ", movie_title=" + movie_title + ", screen_name="
				+ screen_name + ", screen_date=" + screen_date + ", start_time=" + start_time + ", end_time=" + end_time
				+ ", seat_remain=" + seat_remain + ", seat_count=" + seat_count + "]";
	} // toString
	
} // class
