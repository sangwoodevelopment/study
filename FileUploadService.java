package com.example.erp.board;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.erp.dto.BoardFileDTO;

@Service
public class FileUploadService {

	//설정파일에 정의된 property정보를 가져와서 사용자정의로 설정한 경로에 파일업로드가 되도록  수정하기
	@Value("${file.dir}")
	private String uploadpath;
	//파일명을 전달받아서 업로드 폴더 경로와 연결해서 path를 리턴하는 메소드
	public String getUploadpath(String filename){
		return uploadpath+filename;
	}
	//파일업로드를 수행하는 메소드 - 파일업로드를 하기 위해서 List<MultipartFile>객체와 실제 업로드할 위치를 매개변수로 전달 받아 사용
	//업로드되는 파일의 정보를 List<BoardFileDTO>로 만들어서 반환
	public List<BoardFileDTO> uploadFiles(List<MultipartFile> multipartFiles)
							throws IllegalStateException, IOException {
		List<BoardFileDTO> filedtolist = new ArrayList<BoardFileDTO>();
		for(MultipartFile multipartFile:multipartFiles) {
			if(!multipartFile.isEmpty()) {
				String storeFilename = uploadFile(multipartFile);
				filedtolist.add(new BoardFileDTO(UUID.randomUUID().toString(),null, 
						multipartFile.getOriginalFilename(), storeFilename));
			}
		}
		return filedtolist;
	}
	//파일 한 개를 업로드하고 저장된 파일명을 리턴하는 메소드
	public String uploadFile(MultipartFile multipartFile)
									throws IllegalStateException, IOException {
		String storefilename = "";
		if(!multipartFile.isEmpty()) {
			//파일명
			String originalFilename = multipartFile.getOriginalFilename();
			storefilename = createStoreFilename(originalFilename);
			System.out.println(originalFilename+":"+storefilename);
			multipartFile.transferTo(new File(getUploadpath(storefilename)));
		}
		return storefilename;
	}
	//UUID를 이용해서 파일명을 변경해서 리턴
	private String createStoreFilename(String originalFilename) {
		int position = originalFilename.lastIndexOf(".");//확장자위치구하기
		//확장자추출 - substring메소드에서 시작index만 지정하면 시작index부터 전체 문자열을 추출
		String ext = originalFilename.substring(position+1);
		String uuid = UUID.randomUUID().toString();
		return uuid+"."+ext;
	}
}
