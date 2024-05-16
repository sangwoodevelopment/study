package test.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

//json파일을 JSONArray나 JSONObject로 변경하는 작업
public class JSONParserTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		// TODO Auto-generated method stub
		//1. json parser를 생성
		//	 => json문자열을 분석할 수 있는 객체
		JSONParser parser = new JSONParser();
		//2. json문자열을 생성
		JSONObject root = (JSONObject) parser.parse(new FileReader("src/main/java/test/json/myjson.json"));
		//3. JSONObject에서 데이터읽기
		String id = (String) root.get("id");
		String name = (String) root.get("name");
		String age = (String) root.get("age");
		
		System.out.println("id"+id);
		System.out.println("name"+name);
		System.out.println("age"+age);
		//4. JSONArray에서 데이터읽기
		JSONArray subjectlist = (JSONArray) root.get("subject");
		for(int i=0; i<subjectlist.size(); i++) {
			String subject = (String) subjectlist.get(i);
			System.out.println("subject"+subject);
		}
		JSONArray singlist = (JSONArray) root.get("singlist");
		for(int i=0; i<singlist.size(); i++) {
			JSONObject sing = (JSONObject) singlist.get(i);
			System.out.println("no"+sing.get("no"));
			System.out.println("title"+sing.get("title"));
			System.out.println("year"+sing.get("year"));
			System.out.println("====================================");
		}
	}

}
