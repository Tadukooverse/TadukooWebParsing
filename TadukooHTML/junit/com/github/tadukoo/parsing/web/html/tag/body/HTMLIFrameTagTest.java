package com.github.tadukoo.parsing.web.html.tag.body;

import com.github.tadukoo.parsing.web.html.tag.BaseLoadableHTMLTagTest;
import com.github.tadukoo.util.SetUtil;

public class HTMLIFrameTagTest extends BaseLoadableHTMLTagTest<HTMLIFrameTag.HTMLIFrameTagBuilder>{
	
	public HTMLIFrameTagTest(){
		super(HTML_INLINE_FRAME_TAG_NAME, GLOBAL_LOADABLE_ATTRIBUTE_WHITELIST, true,
				SetUtil.createSet(HTML_CONTENT_NAME), SetUtil.createSet(), HTMLIFrameTag.builder());
	}
}
