package cookieutil;

import javax.servlet.http.Cookie;

public class cookieutil {
	
	public static Cookie findcookie(Cookie[] cookies,String name) {
		if (cookies!=null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals(name)) {
					return cookie;
				}
			}
		}
		return null;
		
	}

}
