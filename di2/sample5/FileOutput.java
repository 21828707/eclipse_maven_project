package sample5;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutput implements Outputter {

	private String filePath;
	
	public void setFilePath(String filePath) {
		this.filePath = filePath;
		System.out.println("2. 파일 경로와 파일 이름 설정");
	}
	
	@Override
	public void output(String message) throws IOException {
		// TODO Auto-generated method stub
		FileWriter out = new FileWriter(filePath);
		out.write(message);
		out.close();
		System.out.println("5. 파일 전송 성공");
	}

}
