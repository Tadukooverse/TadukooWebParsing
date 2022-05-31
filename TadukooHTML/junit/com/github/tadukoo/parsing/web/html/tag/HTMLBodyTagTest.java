package com.github.tadukoo.parsing.web.html.tag;

import com.github.tadukoo.util.SetUtil;

public class HTMLBodyTagTest extends BaseFocusableAndLoadableHTMLTagTest<HTMLBodyTag.HTMLBodyTagBuilder>{
	
	public HTMLBodyTagTest(){
		super(HTML_BODY_TAG_NAME, GLOBAL_FOCUSABLE_AND_LOADABLE_ATTRIBUTE_WHITELIST, true,
				SetUtil.createSet(), SetUtil.createSet(), HTMLBodyTag.builder());
	}
}
