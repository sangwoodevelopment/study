package di.constructor.exam03;

public class OracleArticleDAO implements IArticleDAO {
	@Override
	public void insert(ArticleDTO article) {
		System.out.println("Oracle의 Insert 실행");
		System.out.println("아티클 이름 : " + article.getName());
		System.out.println("아티클 제목 : " + article.getTitle());
		System.out.println("아티클 내용 : " + article.getContent());
		System.out.println("아티클 날짜 : " + article.getDate());
	}
}