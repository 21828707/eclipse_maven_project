package message;

import java.util.Locale;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] configLocation = new String[] {"message/message.xml"};
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		
		Locale locale = Locale.getDefault();
		Locale enLocale = Locale.ENGLISH;
		
		System.out.println(context.getMessage("testMessage", new Object[0], locale));
		System.out.println(context.getMessage("testMessage", new Object[] {"aaa", "bbb"}, enLocale));
		// getMessage(String code, Object[] args, Locale locale);
		// code: 메시지의 식별자로, 일반적으로 메시지 소스에 등록된 메시지의 키(key)와 관련이 있습니다.
		// args: 메시지에 포함될 인자들을 나타내는 배열입니다. 메시지 텍스트 내에서 {0}, {1}, 등과 같은 플레이스홀더에 인자가 대체됩니다.
		// locale: 원하는 지역을 나타내는 객체로, 메시지가 현재 언어 설정과 일치하는지 확인하는 데 사용됩니다.
	}

}
