package test.json;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/*
 * 데이터를 json형식으로 만들기
 * {} : JSON오브젝ㅌ트 => JSONObject(자바의 객체와 매핑 - DTO))
 * [] : JSON Array => JSONArray(자바의 List와 매핑)
*/
public class JSONMakerTest {

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("unused")//자바컴파일러가 워닝을 인식하지 못하도록 처리
		// TODO Auto-generated method stub
		//{}JSONObject만들기
		JSONObject myjson = new JSONObject();
		myjson.put("id", "bts");
		myjson.put("name", "방탄소년단");
		myjson.put("age", "30");
		//[]JSONArray 만들기 - ArrayList의 하위
		//ArrayList<String>
		JSONArray subjectlist = new JSONArray();
		subjectlist.add("자바");
		subjectlist.add("스프링");
		subjectlist.add("하둡");
		subjectlist.add("안드로이드");
		
		//위에서 작성한 JSONArray를 JSONObject에 추가
		myjson.put("subject", subjectlist);
		
		//JSONObject를 JSONArray에 저장하기 - List<DTO>
		JSONObject sing1 = new JSONObject();
		sing1.put("no", "1");
		sing1.put("title", "다이너마이트");
		sing1.put("year", "2020");
		
		JSONObject sing2 = new JSONObject();
		sing2.put("no", "2");
		sing2.put("title", "불타오르네");
		sing2.put("year", "2016");
		
		JSONObject sing3 = new JSONObject();
		sing3.put("no", "3");
		sing3.put("title", "봄날");
		sing3.put("year", "2016");
		
		JSONArray singlist = new JSONArray();
		singlist.add(sing1);
		singlist.add(sing2);
		singlist.add(sing3);
		myjson.put("singlist", singlist);
		System.out.println(myjson.toJSONString());
		
		FileWriter fw = new FileWriter("src/main/java/test/json/myjson.json");
		fw.write(myjson.toJSONString());
		fw.flush();
		fw.close();
		
	}

}
