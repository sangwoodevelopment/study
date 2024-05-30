package com.example.bootErp.dto;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Alias("boardfile")
public class BoardFileDTO {
	private String board_file_no;//식별할 수 있는 번호
	private String board_no;//첨부된 파일이 어떤 게시글의 파일인지 구분하기 위한 게시글번호(tbboard의 board_no)
	private String originalFilename;//원본파일명
	private String storeFilename;//실제저장될파일명
	
}
