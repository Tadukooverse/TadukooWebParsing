package com.github.tadukoo.parsing.web.html.tag;

import com.github.tadukoo.util.SetUtil;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HTMLRootTagTest extends BaseHTMLTagTest{
	
	public HTMLRootTagTest(){
		super(HTML_ROOT_TAG_NAME,
				SetUtil.mergeSets(ALL_GLOBAL_ATTRIBUTE_WHITELIST, SetUtil.createSet(ON_SCROLL_ATTRIBUTE_NAME)),
				true,
				SetUtil.createSet(HTML_HEAD_TAG_NAME, HTML_BODY_TAG_NAME), SetUtil.createSet(HTML_ROOT_TAG_NAME),
				HTMLRootTag.builder());
	}
	
	/*
	 * Override All Attributes logic for extra attribute - onscroll
	 */
	
	@Override
	protected HTMLTag.BaseHTMLTagBuilder setAllAttributes(){
		return ((HTMLRootTag.HTMLRootTagBuilder) super.setAllAttributes()).onscroll(SCRIPT_TEST_VALUE);
	}
	
	@Override
	protected Map<String, String> makeAllAttributesMap(){
		Map<String, String> attributes = super.makeAllAttributesMap();
		attributes.put(ON_SCROLL_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
		return attributes;
	}
	
	@Override
	protected String makeAllAttributesString(){
		return super.makeAllAttributesString().replace(SPELLCHECK_ATTRIBUTE_NAME,
				ON_SCROLL_ATTRIBUTE_NAME + "=\"" + SCRIPT_TEST_VALUE + "\" " + SPELLCHECK_ATTRIBUTE_NAME);
	}
	
	/*
	 * Override Defaults for lang value default
	 */
	
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
	
	/*
	 * Additional Methods
	 */
	
	@Test
	public void testSetOnScrollAttribute(){
		testSingleSetAttribute(HTMLRootTag.builder().attributes(new HashMap<>()).onscroll(SCRIPT_TEST_VALUE).build(),
				ON_SCROLL_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
	}
}
