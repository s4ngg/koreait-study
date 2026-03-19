package kr.co.restStudy.member.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ResMemberDTO {
    private Long id;
    private String userId;
    private String userName;
    private String email;
}