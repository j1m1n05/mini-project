import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class TextStore {
    private Vector<String> v=new Vector<String>();
    public TextStore(){  //파일 읽어서 등록하기
        FileReader file;
        try{
            file=new FileReader("src\\Text.txt");
            StringBuffer sb=new StringBuffer();  //빈 스트링 버퍼
            Scanner scanner=new Scanner(file);
            while(scanner.hasNext()){
                String word=scanner.nextLine();
                word=word.trim();
                v.add(word);
            }
            file.close();
        } catch(FileNotFoundException e){
            System.out.println("파일 열수 없음");
            System.exit(1);
        } catch (IOException e) {
            System.out.println("입출력 오류");
            System.exit(2);
        }
    }
    public String get(){
        int index=(int)(Math.random()*v.size());
        return v.get(index);
    }
}
