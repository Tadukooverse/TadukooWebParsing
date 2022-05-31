package com.github.tadukoo.parsing.web.html.tag;

import com.github.tadukoo.util.SetUtil;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HTMLRootTagTest extends BaseHTMLTagTest<HTMLRootTag.HTMLRootTagBuilder>{
	
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
	
	/** {@inheritDoc} */
	@Override
	protected HTMLRootTag.HTMLRootTagBuilder setAllAttributes(){
		return super.setAllAttributes().onscroll(SCRIPT_TEST_VALUE);
	}
	
	/** {@inheritDoc} */
	@Override
	protected Map<String, String> makeAllAttributesMap(){
		Map<String, String> attributes = super.makeAllAttributesMap();
		attributes.put(ON_SCROLL_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
		return attributes;
	}
	
	/** {@inheritDoc} */
	@Override
	protected List<String> getAllAttributeStrings(){
		List<String> list = super.getAllAttributeStrings();
		list.add(makeSingleAttributeString(ON_SCROLL_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE));
		return list;
	}
	
	/*
	 * Override Defaults for lang value default
	 */
	
	/** {@inheritDoc} */
	@Test
	@Override
	public void testDefaultAttributes(){
		HTMLTag tag = defaultBuilder.build();
		Map<String, String> attributes = tag.getAttributes();
		assertEquals(1, attributes.size());
		assertTrue(attributes.containsKey(LANG_ATTRIBUTE_NAME));
		assertEquals(DEFAULT_LANG_VALUE, attributes.get(LANG_ATTRIBUTE_NAME));
	}
	
	/** {@inheritDoc} */
	@Test
	@Override
	public void testDefaultOpeningTag(){
		HTMLTag tag = defaultBuilder.build();
		assertEquals("<" + tagName + " " +  LANG_ATTRIBUTE_NAME + "=\"" + DEFAULT_LANG_VALUE + "\">",
				tag.toOpeningTag());
	}
	
	/** {@inheritDoc} */
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
