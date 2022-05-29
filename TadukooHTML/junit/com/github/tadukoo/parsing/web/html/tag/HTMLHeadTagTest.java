package com.github.tadukoo.parsing.web.html.tag;

import com.github.tadukoo.util.SetUtil;

public class HTMLHeadTagTest extends BaseHTMLTagTest{
	
	public HTMLHeadTagTest(){
		super(HTML_HEAD_TAG_NAME, GLOBAL_ATTRIBUTE_WHITELIST, true,
				VALID_HTML_HEAD_SUB_TAGS, SetUtil.createSet(HTML_ROOT_TAG_NAME), HTMLHeadTag.builder());
	}
}
