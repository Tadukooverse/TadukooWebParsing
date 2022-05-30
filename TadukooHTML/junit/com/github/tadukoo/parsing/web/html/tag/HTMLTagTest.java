package com.github.tadukoo.parsing.web.html.tag;

import com.github.tadukoo.util.SetUtil;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class HTMLTagTest extends BaseHTMLTagTest{
	
	public HTMLTagTest(){
		super(TEST_TAG_NAME, ALL_GLOBAL_ATTRIBUTE_WHITELIST, true,
				SetUtil.createSet(), SetUtil.createSet(), HTMLTag.tagBuilder().tagName(TEST_TAG_NAME));
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
	public void testSetValidAttribute(){
		HTMLTag tag = HTMLTag.tagBuilder().tagName(TEST_TAG_NAME)
				.attributeWhitelist(new HashSet<>())
				.validAttribute(TEST_CUSTOM_ATTR_NAME)
				.build();
		assertEquals(SetUtil.createSet(TEST_CUSTOM_ATTR_NAME), tag.getAttributeWhitelist());
	}
	
	@Test
	public void testSetAttributesWhitelist(){
		HTMLTag tag = HTMLTag.tagBuilder().tagName(TEST_TAG_NAME).attributeWhitelist(new HashSet<>()).build();
		assertEquals(new HashSet<>(), tag.getAttributeWhitelist());
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
	public void testSetValidSubTag(){
		HTMLTag tag = HTMLTag.tagBuilder().tagName(TEST_TAG_NAME).validSubTag(HTML_ROOT_TAG_NAME).build();
		assertEquals(SetUtil.createSet(HTML_ROOT_TAG_NAME), tag.getSubTagWhitelist());
	}
	
	@Test
	public void testSetSubTagWhitelist(){
		Set<String> whitelist = SetUtil.createSet(HTML_ROOT_TAG_NAME, HTML_HEAD_TAG_NAME);
		HTMLTag tag = HTMLTag.tagBuilder().tagName(TEST_TAG_NAME).subTagWhitelist(whitelist).build();
		assertEquals(whitelist, tag.getSubTagWhitelist());
	}
	
	@Test
	public void testSetInvalidSubTag(){
		HTMLTag tag = HTMLTag.tagBuilder().tagName(TEST_TAG_NAME).invalidSubTag(HTML_HEAD_TAG_NAME).build();
		assertEquals(SetUtil.createSet(HTML_HEAD_TAG_NAME), tag.getSubTagBlacklist());
	}
	
	@Test
	public void testSetSubTagBlacklist(){
		Set<String> blacklist = SetUtil.createSet(HTML_ROOT_TAG_NAME, HTML_HEAD_TAG_NAME);
		HTMLTag tag = HTMLTag.tagBuilder().tagName(TEST_TAG_NAME).subTagBlacklist(blacklist).build();
		assertEquals(blacklist, tag.getSubTagBlacklist());
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
