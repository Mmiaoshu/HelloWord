package com.common.baseAction;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JsonUtil;

public class baseAction {

	protected void write(HttpServletResponse response, String html) {
		response.setContentType("text/html; charset=UTF-8");
		try {
			response.getWriter().print(html);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected void writeJSON(HttpServletResponse response, Object object) {
		response.setContentType("text/html; charset=UTF-8");
		write(response, JsonUtil.fromObject(object));
	}

}
