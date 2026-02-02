package exPackage.game_project.info;

public class AppInfo {
	private static AppInfo instance = null;
	
	private AppInfo() {}
	
	public static AppInfo getInstance() {
		if (instance == null) {
			instance = new AppInfo();
		}
		return instance;
	}
	
	public void showInfo() {
		System.out.println();
		System.out.println("**************************************");
		System.out.println("          애플리케이션 정보");
		System.out.println("--------------------------------------");
		System.out.println("제목: ⭐⭐게임");
		System.out.println("제작자: 홍길동");
		System.out.println("내용: 가위바위보 게임/숫자 알아맞히기 게임");
		System.out.println("**************************************");
		System.out.println();
	}
}
