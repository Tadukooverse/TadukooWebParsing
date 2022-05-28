package com.github.tadukoo.parsing.web.html.tag;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class HTMLTagTest extends BaseHTMLTagTest{
	
	public HTMLTagTest(){
		super(TEST_TAG_NAME, true, HTMLTag.tagBuilder().tagName(TEST_TAG_NAME));
	}
	
	@Test
	public void testMissingTagName(){
		try{
			HTMLTag.tagBuilder().build();
			fail();
		}catch(IllegalArgumentException e){
			assertEquals("Errors encountered in building a HTMLTag: \n" +
					"tagName is required!", e.getMessage());
		}
	}
	
	@Test
	public void testSetClosingTagDisabled(){
		HTMLTag tag = HTMLTag.tagBuilder().tagName(TEST_TAG_NAME).disableClosingTag().build();
		assertFalse(tag.hasClosingTag());
	}
	
	@Test
	public void testSetClosingTagEnabled(){
		HTMLTag tag = HTMLTag.tagBuilder().tagName(TEST_TAG_NAME).enableClosingTag().build();
		assertTrue(tag.hasClosingTag());
	}
	
	@Test
	public void testSetClosingTag(){
		HTMLTag tag = HTMLTag.tagBuilder().tagName(TEST_TAG_NAME).closingTag(false).build();
		assertFalse(tag.hasClosingTag());
	}
	
	@Test
	public void testToClosingTagFalse(){
		HTMLTag tag = HTMLTag.tagBuilder().tagName(TEST_TAG_NAME).disableClosingTag().build();
		assertEquals("", tag.toClosingTag());
	}
	
	@Test
	public void testToStringClosingTagFalse(){
		HTMLTag tag = HTMLTag.tagBuilder().tagName(TEST_TAG_NAME).disableClosingTag().build();
		assertEquals("<" + TEST_TAG_NAME + ">", tag.toString());
	}
}
