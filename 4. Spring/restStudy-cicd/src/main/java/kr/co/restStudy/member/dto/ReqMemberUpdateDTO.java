package kr.co.restStudy.member.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor  // ✅ 추가!
@AllArgsConstructor // ✅ 추가!
public class ReqMemberUpdateDTO {
	 private String userName;  
	 private String email;     
}
