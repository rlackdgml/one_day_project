package com.biz.team.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BbsVO {
	
	  private long b_seq;	
	  private String b_date;	
	  private String  b_time;		
	  private String b_writer;	
	  private String b_subject;	
	  private String b_content;
	  private int b_count;
	

}
