package com.github.tadukoo.parsing.web.html.tag;

import com.github.tadukoo.util.SetUtil;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HTMLRootTagTest extends BaseHTMLTagTest{
	
	public HTMLRootTagTest(){
		super(HTML_ROOT_TAG_NAME, GLOBAL_ATTRIBUTE_WHITELIST, true,
				SetUtil.createSet(HTML_HEAD_TAG_NAME), SetUtil.createSet(HTML_ROOT_TAG_NAME), HTMLRootTag.builder());
	}
	
	@Test
	@Override
	public void testDefaultAttributes(){
		HTMLTag tag = defaultBuilder.build();
		Map<String, String> attributes = tag.getAttributes();
		assertEquals(1, attributes.size());
		assertTrue(attributes.containsKey(LANG_ATTRIBUTE_NAME));
		assertEquals(DEFAULT_LANG_VALUE, attributes.get(LANG_ATTRIBUTE_NAME));
	}
	
	@Test
	@Override
	public void testDefaultOpeningTag(){
		HTMLTag tag = defaultBuilder.build();
		assertEquals("<" + tagName + " " +  LANG_ATTRIBUTE_NAME + "=\"" + DEFAULT_LANG_VALUE + "\">",
				tag.toOpeningTag());
	}
	
	@Test
	@Override
	public void testDefaultToString(){
		HTMLTag tag = defaultBuilder.build();
		assertEquals("<" + tagName +  " " +  LANG_ATTRIBUTE_NAME + "=\"" + DEFAULT_LANG_VALUE + "\">" +
				"</" + tagName + ">", tag.toString());
	}
}
