package com.github.tadukoo.parsing.web.html.tag;

import com.github.tadukoo.util.SetUtil;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

public class HTMLBodyTagTest extends BaseFocusableAndLoadableHTMLTagTest<HTMLBodyTag.HTMLBodyTagBuilder>{
	
	public HTMLBodyTagTest(){
		super(HTML_BODY_TAG_NAME, BODY_TAG_ATTRIBUTE_WHITELIST, true,
				VALID_HTML_BODY_SUB_TAGS, SetUtil.createSet(), HTMLBodyTag.builder());
	}
	
	/*
	 * Override All Attributes logic for extra attributes
	 */
	
	/** {@inheritDoc} */
	@Override
	protected HTMLBodyTag.HTMLBodyTagBuilder setAllAttributes(){
		return super.setAllAttributes()
				.onafterprint(SCRIPT_TEST_VALUE)
				.onbeforeprint(SCRIPT_TEST_VALUE)
				.onbeforeunload(SCRIPT_TEST_VALUE)
				.onhashchange(SCRIPT_TEST_VALUE)
				.onmessage(SCRIPT_TEST_VALUE)
				.onoffline(SCRIPT_TEST_VALUE)
				.ononline(SCRIPT_TEST_VALUE)
				.onpagehide(SCRIPT_TEST_VALUE)
				.onpageshow(SCRIPT_TEST_VALUE)
				.onpopstate(SCRIPT_TEST_VALUE)
				.onresize(SCRIPT_TEST_VALUE)
				.onstorage(SCRIPT_TEST_VALUE);
	}
	
	/** {@inheritDoc} */
	@Override
	protected Map<String, String> makeAllAttributesMap(){
		Map<String, String> attributes = super.makeAllAttributesMap();
		attributes.put(ON_AFTER_PRINT_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
		attributes.put(ON_BEFORE_PRINT_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
		attributes.put(ON_BEFORE_UNLOAD_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
		attributes.put(ON_HASH_CHANGE_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
		attributes.put(ON_MESSAGE_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
		attributes.put(ON_OFFLINE_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
		attributes.put(ON_ONLINE_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
		attributes.put(ON_PAGE_HIDE_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
		attributes.put(ON_PAGE_SHOW_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
		attributes.put(ON_POP_STATE_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
		attributes.put(ON_RESIZE_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
		attributes.put(ON_STORAGE_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
		return attributes;
	}
	
	/** {@inheritDoc} */
	@Override
	protected List<String> getAllAttributeStrings(){
		List<String> list = super.getAllAttributeStrings();
		list.add(makeSingleAttributeString(ON_AFTER_PRINT_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE));
		list.add(makeSingleAttributeString(ON_BEFORE_PRINT_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE));
		list.add(makeSingleAttributeString(ON_BEFORE_UNLOAD_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE));
		list.add(makeSingleAttributeString(ON_HASH_CHANGE_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE));
		list.add(makeSingleAttributeString(ON_MESSAGE_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE));
		list.add(makeSingleAttributeString(ON_OFFLINE_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE));
		list.add(makeSingleAttributeString(ON_ONLINE_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE));
		list.add(makeSingleAttributeString(ON_PAGE_HIDE_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE));
		list.add(makeSingleAttributeString(ON_PAGE_SHOW_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE));
		list.add(makeSingleAttributeString(ON_POP_STATE_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE));
		list.add(makeSingleAttributeString(ON_RESIZE_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE));
		list.add(makeSingleAttributeString(ON_STORAGE_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE));
		return list;
	}
	
	/*
	 * Global Window Event Attribute Names
	 */
	
	@Test
	public void testSetOnAfterPrintAttribute(){
		testSingleSetAttribute(defaultBuilder.onafterprint(SCRIPT_TEST_VALUE).build(),
				ON_AFTER_PRINT_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
	}
	
	@Test
	public void testSetOnBeforePrintAttribute(){
		testSingleSetAttribute(defaultBuilder.onbeforeprint(SCRIPT_TEST_VALUE).build(),
				ON_BEFORE_PRINT_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
	}
	
	@Test
	public void testSetOnBeforeUnloadAttribute(){
		testSingleSetAttribute(defaultBuilder.onbeforeunload(SCRIPT_TEST_VALUE).build(),
				ON_BEFORE_UNLOAD_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
	}
	
	@Test
	public void testSetOnHashChangeAttribute(){
		testSingleSetAttribute(defaultBuilder.onhashchange(SCRIPT_TEST_VALUE).build(),
				ON_HASH_CHANGE_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
	}
	
	@Test
	public void testSetOnMessageAttribute(){
		testSingleSetAttribute(defaultBuilder.onmessage(SCRIPT_TEST_VALUE).build(),
				ON_MESSAGE_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
	}
	
	@Test
	public void testSetOnOfflineAttribute(){
		testSingleSetAttribute(defaultBuilder.onoffline(SCRIPT_TEST_VALUE).build(),
				ON_OFFLINE_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
	}
	
	@Test
	public void testSetOnOnlineAttribute(){
		testSingleSetAttribute(defaultBuilder.ononline(SCRIPT_TEST_VALUE).build(),
				ON_ONLINE_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
	}
	
	@Test
	public void testSetOnPageHideAttribute(){
		testSingleSetAttribute(defaultBuilder.onpagehide(SCRIPT_TEST_VALUE).build(),
				ON_PAGE_HIDE_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
	}
	
	@Test
	public void testSetOnPageShowAttribute(){
		testSingleSetAttribute(defaultBuilder.onpageshow(SCRIPT_TEST_VALUE).build(),
				ON_PAGE_SHOW_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
	}
	
	@Test
	public void testSetOnPopStateAttribute(){
		testSingleSetAttribute(defaultBuilder.onpopstate(SCRIPT_TEST_VALUE).build(),
				ON_POP_STATE_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
	}
	
	@Test
	public void testSetOnResizeAttribute(){
		testSingleSetAttribute(defaultBuilder.onresize(SCRIPT_TEST_VALUE).build(),
				ON_RESIZE_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
	}
	
	@Test
	public void testSetOnStorageAttribute(){
		testSingleSetAttribute(defaultBuilder.onstorage(SCRIPT_TEST_VALUE).build(),
				ON_STORAGE_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
	}
}
