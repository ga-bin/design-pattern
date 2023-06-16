package composite;

// 객체들의 관계를 트리구조로 구성하여 부분-전체 계층을 표현하는 패턴
// 사용자가 단일 객체와 복합 객체 모두 동일하게 다루도록
public class CompositePattern {

	public static void main(String[] args) {
		Folder root = new Folder("root"); 
		Folder home = new Folder("home");
		Folder garam = new Folder("garam");
		Folder music = new Folder("music");
		Folder picture = new Folder("picture"); 
		Folder doc = new Folder("doc");
		Folder usr = new Folder("usr");
		
		File track1 = new File("track1");
		File track2 = new File("track2");
		File pic1 = new File("pic1");
		File doc1 = new File("doc1");
		File java = new File("java");
		
		// 폴더 파일시스템 처럼 집어 넣기
		root.addComponent(home);
		home.addComponent(garam);
		garam.addComponent(music);
		music.addComponent(track1);
		music.addComponent(track2);
		garam.addComponent(picture);
		picture.addComponent(pic1);
		garam.addComponent(doc);
		doc.addComponent(doc1);
		root.addComponent(usr);
		usr.addComponent(java);
		show(root);
	}
	
	private static void show(Component component) {
		System.out.println(component.getClass().getName() + "|" + component.getName());
		if(component instanceof Folder) {
			for(Component c: ((Folder) component).getChildren()) {
				show(c);
			}
		}
	}
}
