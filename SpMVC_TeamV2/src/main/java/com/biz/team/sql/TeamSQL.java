package com.biz.team.sql;

import org.apache.ibatis.jdbc.SQL;

public class TeamSQL {

public String bbs_insert() {
		
		SQL sql = new SQL();
		sql.INSERT_INTO("tbl_bbs");
		sql.INTO_COLUMNS("b_seq").INTO_VALUES("seq_bbs.NEXTVAL");
		sql.INTO_COLUMNS("b_date").INTO_VALUES("#{b_date}");
		sql.INTO_COLUMNS("b_time").INTO_VALUES("#{b_time}");
		sql.INTO_COLUMNS("b_writer").INTO_VALUES("#{b_writer}");
		sql.INTO_COLUMNS("b_subject").INTO_VALUES("#{b_subject}");
		sql.INTO_COLUMNS("b_content").INTO_VALUES("#{b_content}");
		sql.INTO_COLUMNS("b_file").INTO_VALUES("#{b_file}");
		sql.INTO_COLUMNS("b_count").INTO_VALUES("#{b_count}");

		return sql.toString();
		
	}

	/*
	 * SQL 클래스를 사용하여 xml 대신 Java Code방식으로 SQL 작성
	 */
	public String bbs_update() {
		
		SQL sql = new SQL();
		sql.UPDATE("tbl_bbs");
		sql.SET("b_date = #{b_date}");
		sql.SET("b_time= #{b_time}");
		sql.SET("b_writer= #{b_writer}");
		sql.SET("b_subject= #{b_subject}");
		sql.SET("b_content= #{b_content}");
		sql.WHERE("b_seq = #{b_seq}");
		return sql.toString();
	}
}