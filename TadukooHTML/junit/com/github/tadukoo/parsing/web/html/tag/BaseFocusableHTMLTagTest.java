package com.github.tadukoo.parsing.web.html.tag;

import com.github.tadukoo.parsing.web.html.tag.builder.BaseFocusableHTMLTagBuilder;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("unchecked")
public abstract class BaseFocusableHTMLTagTest<Builder extends BaseFocusableHTMLTagBuilder>
		extends BaseHTMLTagTest<Builder>{
	
	/**
	 * Constructs a new {@link BaseFocusableHTMLTagTest} using the given parameters
	 *
	 * @param tagName The name to use for the {@link HTMLTag}
	 * @param attributeWhitelist The Set of valid attributes for the {@link HTMLTag}
	 * @param closingTag Whether to include a closing tag for the {@link HTMLTag} or not
	 * @param subTagWhitelist The Set of valid sub tags for the {@link HTMLTag}
	 * @param subTagBlacklist The Set of invalid sub tags for the {@link HTMLTag}
	 * @param defaultBuilder A {@link BaseFocusableHTMLTagBuilder builder} to use to make a default version of the {@link HTMLTag}
	 */
	protected BaseFocusableHTMLTagTest(
			String tagName, Set<String> attributeWhitelist, boolean closingTag,
			Set<String> subTagWhitelist, Set<String> subTagBlacklist,
			Builder defaultBuilder){
		super(tagName, attributeWhitelist, closingTag, subTagWhitelist, subTagBlacklist, defaultBuilder);
	}
	
	/** {@inheritDoc} */
	@Override
	protected Builder setAllAttributes(){
		return (Builder) super.setAllAttributes()
				.onblur(SCRIPT_TEST_VALUE)
				.onfocus(SCRIPT_TEST_VALUE)
				.onkeydown(SCRIPT_TEST_VALUE)
				.onkeypress(SCRIPT_TEST_VALUE)
				.onkeyup(SCRIPT_TEST_VALUE)
				.onclick(SCRIPT_TEST_VALUE)
				.ondblclick(SCRIPT_TEST_VALUE)
				.onmousedown(SCRIPT_TEST_VALUE)
				.onmousemove(SCRIPT_TEST_VALUE)
				.onmouseout(SCRIPT_TEST_VALUE)
				.onmouseover(SCRIPT_TEST_VALUE)
				.onmouseup(SCRIPT_TEST_VALUE);
	}
	
	/** {@inheritDoc} */
	@Override
	protected Map<String, String> makeAllAttributesMap(){
		Map<String, String> map = super.makeAllAttributesMap();
		map.put(ON_BLUR_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
		map.put(ON_FOCUS_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
		map.put(ON_KEY_DOWN_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
		map.put(ON_KEY_PRESS_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
		map.put(ON_KEY_UP_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
		map.put(ON_CLICK_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
		map.put(ON_DBL_CLICK_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
		map.put(ON_MOUSE_DOWN_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
		map.put(ON_MOUSE_MOVE_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
		map.put(ON_MOUSE_OUT_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
		map.put(ON_MOUSE_OVER_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
		map.put(ON_MOUSE_UP_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
		return map;
	}
	
	/** {@inheritDoc} */
	@Override
	protected List<String> getAllAttributeStrings(){
		List<String> list = super.getAllAttributeStrings();
		list.add(makeSingleAttributeString(ON_BLUR_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE));
		list.add(makeSingleAttributeString(ON_FOCUS_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE));
		list.add(makeSingleAttributeString(ON_KEY_DOWN_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE));
		list.add(makeSingleAttributeString(ON_KEY_PRESS_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE));
		list.add(makeSingleAttributeString(ON_KEY_UP_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE));
		list.add(makeSingleAttributeString(ON_CLICK_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE));
		list.add(makeSingleAttributeString(ON_DBL_CLICK_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE));
		list.add(makeSingleAttributeString(ON_MOUSE_DOWN_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE));
		list.add(makeSingleAttributeString(ON_MOUSE_MOVE_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE));
		list.add(makeSingleAttributeString(ON_MOUSE_OUT_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE));
		list.add(makeSingleAttributeString(ON_MOUSE_OVER_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE));
		list.add(makeSingleAttributeString(ON_MOUSE_UP_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE));
		return list;
	}
	
	/*
	 * Global Focus Event Attributes
	 */
	
	/**
	 * Test that the {@code onblur} attribute can be set
	 */
	@Test
	public void testSetOnBlurAttribute(){
		testSingleSetAttribute(wipeAttributes().onblur(SCRIPT_TEST_VALUE).build(),
				ON_BLUR_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
	}
	
	/**
	 * Test that the {@code onfocus} attribute can be set
	 */
	@Test
	public void testSetOnFocusAttribute(){
		testSingleSetAttribute(wipeAttributes().onfocus(SCRIPT_TEST_VALUE).build(),
				ON_FOCUS_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
	}
	
	/*
	 * Global Keyboard Event Attributes
	 */
	
	/**
	 * Test that the {@code onkeydown} attribute can be set
	 */
	@Test
	public void testSetOnKeyDownAttribute(){
		testSingleSetAttribute(wipeAttributes().onkeydown(SCRIPT_TEST_VALUE).build(),
				ON_KEY_DOWN_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
	}
	
	/**
	 * Test that the {@code onkeypress} attribute can be set
	 */
	@Test
	public void testSetOnKeyPressAttribute(){
		testSingleSetAttribute(wipeAttributes().onkeypress(SCRIPT_TEST_VALUE).build(),
				ON_KEY_PRESS_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
	}
	
	/**
	 * Test that the {@code onkeyup} attribute can be set
	 */
	@Test
	public void testSetOnKeyUpAttribute(){
		testSingleSetAttribute(wipeAttributes().onkeyup(SCRIPT_TEST_VALUE).build(),
				ON_KEY_UP_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
	}
	
	/*
	 * Global Mouse Event Attributes
	 */
	
	/**
	 * Test that the {@code onclick} attribute can be set
	 */
	@Test
	public void testSetOnClickAttribute(){
		testSingleSetAttribute(wipeAttributes().onclick(SCRIPT_TEST_VALUE).build(),
				ON_CLICK_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
	}
	
	/**
	 * Test that the {@code ondblclick} attribute can be set
	 */
	@Test
	public void testSetOnDblClickAttribute(){
		testSingleSetAttribute(wipeAttributes().ondblclick(SCRIPT_TEST_VALUE).build(),
				ON_DBL_CLICK_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
	}
	
	/**
	 * Test that the {@code onmousedown} attribute can be set
	 */
	@Test
	public void testSetOnMouseDownAttribute(){
		testSingleSetAttribute(wipeAttributes().onmousedown(SCRIPT_TEST_VALUE).build(),
				ON_MOUSE_DOWN_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
	}
	
	/**
	 * Test that the {@code onmousemove} attribute can be set
	 */
	@Test
	public void testSetOnMouseMoveAttribute(){
		testSingleSetAttribute(wipeAttributes().onmousemove(SCRIPT_TEST_VALUE).build(),
				ON_MOUSE_MOVE_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
	}
	
	/**
	 * Test that the {@code onmouseout} attribute can be set
	 */
	@Test
	public void testSetOnMouseOutAttribute(){
		testSingleSetAttribute(wipeAttributes().onmouseout(SCRIPT_TEST_VALUE).build(),
				ON_MOUSE_OUT_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
	}
	
	/**
	 * Test that the {@code onmouseover} attribute can be set
	 */
	@Test
	public void testSetOnMouseOverAttribute(){
		testSingleSetAttribute(wipeAttributes().onmouseover(SCRIPT_TEST_VALUE).build(),
				ON_MOUSE_OVER_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
	}
	
	/**
	 * Test that the {@code onmouseup} attribute can be set
	 */
	@Test
	public void testSetOnMouseUpAttribute(){
		testSingleSetAttribute(wipeAttributes().onmouseup(SCRIPT_TEST_VALUE).build(),
				ON_MOUSE_UP_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
	}
}
