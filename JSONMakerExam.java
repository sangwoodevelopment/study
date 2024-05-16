package test.json;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONMakerExam {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		JSONObject myjson = new JSONObject();
		myjson.put("name", "김서연");
		myjson.put("age", "25");
		
		JSONArray subjectlist = new JSONArray();
		subjectlist.add("자바");
		subjectlist.add("하둡");
		subjectlist.add("시큐어코딩");
		
		JSONObject addr = new JSONObject();
		addr.put("zip", "111-222");
		addr.put("addr1","인천시" );
		myjson.put("addr", addr);
		
		JSONArray historylist = new JSONArray();
		JSONObject history1 = new JSONObject();
		history1.put("subject", "java");
		history1.put("month", "3");
		
		JSONObject history2 = new JSONObject();
		history2.put("subject", "servlet");
		history2.put("month", "3");
		
		historylist.add(history1);
		historylist.add(history2);
		
		myjson.put("historylist", historylist);
		System.out.println(myjson.toJSONString());
		FileWriter fw = 
				new FileWriter("src/main/java/test/json/myjson2.json");
		fw.write(myjson.toJSONString());
		fw.flush();
		fw.close();
	}

}
