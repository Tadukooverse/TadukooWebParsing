package com.github.tadukoo.parsing.web.html.tag;

import com.github.tadukoo.parsing.web.html.tag.builder.BaseLoadableHTMLTagBuilder;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("unchecked")
public abstract class BaseLoadableHTMLTagTest<Builder extends BaseLoadableHTMLTagBuilder>
		extends BaseHTMLTagTest<Builder>{
	
	/**
	 * Constructs a new {@link BaseHTMLTagTest} using the given parameters
	 *
	 * @param tagName The name to use for the {@link HTMLTag}
	 * @param attributeWhitelist The Set of valid attributes for the {@link HTMLTag}
	 * @param closingTag Whether to include a closing tag for the {@link HTMLTag} or not
	 * @param subTagWhitelist The Set of valid sub tags for the {@link HTMLTag}
	 * @param subTagBlacklist The Set of invalid sub tags for the {@link HTMLTag}
	 * @param defaultBuilder A {@link BaseLoadableHTMLTagBuilder builder} to use to make a default version of the {@link HTMLTag}
	 */
	protected BaseLoadableHTMLTagTest(
			String tagName, Set<String> attributeWhitelist, boolean closingTag,
			Set<String> subTagWhitelist, Set<String> subTagBlacklist, Builder defaultBuilder){
		super(tagName, attributeWhitelist, closingTag, subTagWhitelist, subTagBlacklist, defaultBuilder);
	}
	
	/** {@inheritDoc} */
	@Override
	protected Builder setAllAttributes(){
		return (Builder) super.setAllAttributes()
				.onload(SCRIPT_TEST_VALUE)
				.onunload(SCRIPT_TEST_VALUE);
	}
	
	/** {@inheritDoc} */
	@Override
	protected Map<String, String> makeAllAttributesMap(){
		Map<String, String> map = super.makeAllAttributesMap();
		map.put(ON_LOAD_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
		map.put(ON_UNLOAD_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
		return map;
	}
	
	/** {@inheritDoc} */
	@Override
	protected List<String> getAllAttributeStrings(){
		List<String> list = super.getAllAttributeStrings();
		list.add(makeSingleAttributeString(ON_LOAD_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE));
		list.add(makeSingleAttributeString(ON_UNLOAD_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE));
		return list;
	}
	
	/*
	 * Global Load Event Attributes
	 */
	
	/**
	 * Test that the {@code onload} attribute can be set
	 */
	@Test
	public void testSetOnLoad(){
		testSingleSetAttribute(wipeAttributes().onload(SCRIPT_TEST_VALUE).build(),
				ON_LOAD_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
	}
	
	/**
	 * Test that the {@code onunload} attribute can be set
	 */
	@Test
	public void testSetOnUnload(){
		testSingleSetAttribute(wipeAttributes().onunload(SCRIPT_TEST_VALUE).build(),
				ON_UNLOAD_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
	}
}
