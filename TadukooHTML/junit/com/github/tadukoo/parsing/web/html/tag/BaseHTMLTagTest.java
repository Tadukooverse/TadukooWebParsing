package com.github.tadukoo.parsing.web.html.tag;

import com.github.tadukoo.util.map.MapUtil;
import com.github.tadukoo.util.tuple.Pair;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public abstract class BaseHTMLTagTest implements HTMLTagConstants, DefaultTagTestValues{
	/** The name to use for the {@link HTMLTag} */
	protected String tagName;
	/** The Set of valid attributes for the {@link HTMLTag} */
	protected Set<String> attributeWhitelist;
	/** Whether to include a closing tag for the {@link HTMLTag} or not */
	protected boolean closingTag;
	/** The Set of valid sub tags for the {@link HTMLTag} */
	protected Set<String> subTagWhitelist;
	/** The Set of invalid sub tags for the {@link HTMLTag} */
	protected Set<String> subTagBlacklist;
	/** A {@link HTMLTag.BaseHTMLTagBuilder builder} to use to make a default version of the {@link HTMLTag} */
	protected HTMLTag.BaseHTMLTagBuilder defaultBuilder;
	
	/**
	 * Constructs a new {@link BaseHTMLTagTest} using the given parameters
	 *
	 * @param tagName The name to use for the {@link HTMLTag}
	 * @param attributeWhitelist The Set of valid attributes for the {@link HTMLTag}
	 * @param closingTag Whether to include a closing tag for the {@link HTMLTag} or not
	 * @param subTagWhitelist The Set of valid sub tags for the {@link HTMLTag}
	 * @param subTagBlacklist The Set of invalid sub tags for the {@link HTMLTag}
	 * @param defaultBuilder A {@link HTMLTag.BaseHTMLTagBuilder builder} to use to make a default version of the {@link HTMLTag}
	 */
	protected BaseHTMLTagTest(
			String tagName, Set<String> attributeWhitelist, boolean closingTag,
			Set<String> subTagWhitelist, Set<String> subTagBlacklist,
			HTMLTag.BaseHTMLTagBuilder defaultBuilder){
		this.tagName = tagName;
		this.attributeWhitelist = attributeWhitelist;
		this.closingTag = closingTag;
		this.subTagWhitelist = subTagWhitelist;
		this.subTagBlacklist = subTagBlacklist;
		this.defaultBuilder = defaultBuilder;
	}
	
	/**
	 * @return The {@link #defaultBuilder} with the attributes wiped (useful for dealing with default attributes)
	 */
	protected HTMLTag.BaseHTMLTagBuilder wipeAttributes(){
		return defaultBuilder.attributes(new HashMap<>());
	}
	
	/**
	 * @return The {@link #defaultBuilder} with all the attributes set
	 */
	protected HTMLTag.BaseHTMLTagBuilder setAllAttributes(){
		return wipeAttributes()
				.accesskey(ACCESS_KEY_TEST_VALUE)
				.classAttribute(CLASS_TEST_VALUE)
				.contenteditable(CONTENT_EDITABLE_TEST_VALUE)
				.data(DATA_TEST_KEY_NAME, DATA_TEST_VALUE)
				.dir(DIR_TEST_VALUE)
				.draggable(DRAGGABLE_TEST_VALUE)
				.hidden()
				.id(ID_TEST_VALUE)
				.lang(LANG_TEST_VALUE)
				.spellcheck(SPELLCHECK_TEST_VALUE)
				.style(STYLE_TEST_VALUE)
				.tabindex(TAB_INDEX_TEST_VALUE)
				.title(TITLE_TEST_VALUE)
				.translate(TRANSLATE_TEST_VALUE)
				.ondrag(SCRIPT_TEST_VALUE)
				.ondragend(SCRIPT_TEST_VALUE)
				.ondragenter(SCRIPT_TEST_VALUE)
				.ondragleave(SCRIPT_TEST_VALUE)
				.ondragover(SCRIPT_TEST_VALUE)
				.ondragstart(SCRIPT_TEST_VALUE)
				.ondrop(SCRIPT_TEST_VALUE)
				.oncopy(SCRIPT_TEST_VALUE)
				.oncut(SCRIPT_TEST_VALUE)
				.onpaste(SCRIPT_TEST_VALUE)
				.attribute(TEST_CUSTOM_ATTR_NAME, TEST_CUSTOM_ATTR_VALUE);
	}
	
	/**
	 * @return A Map of all the attributes that should be set on the {@link HTMLTag}
	 */
	protected Map<String, String> makeAllAttributesMap(){
		return MapUtil.createMap(Pair.of(ACCESS_KEY_ATTRIBUTE_NAME, ACCESS_KEY_TEST_VALUE),
				Pair.of(CLASS_ATTRIBUTE_NAME, CLASS_TEST_VALUE),
				Pair.of(CONTENT_EDITABLE_ATTRIBUTE_NAME, CONTENT_EDITABLE_TEST_VALUE),
				Pair.of(DATA_ATTRIBUTE_NAME_PREFIX + DATA_TEST_KEY_NAME, DATA_TEST_VALUE),
				Pair.of(DIR_ATTRIBUTE_NAME, DIR_TEST_VALUE),
				Pair.of(DRAGGABLE_ATTRIBUTE_NAME, DRAGGABLE_TEST_VALUE),
				Pair.of(HIDDEN_ATTRIBUTE_NAME, null),
				Pair.of(ID_ATTRIBUTE_NAME, ID_TEST_VALUE),
				Pair.of(LANG_ATTRIBUTE_NAME, LANG_TEST_VALUE),
				Pair.of(SPELLCHECK_ATTRIBUTE_NAME, SPELLCHECK_TEST_VALUE),
				Pair.of(STYLE_ATTRIBUTE_NAME, STYLE_TEST_VALUE),
				Pair.of(TAB_INDEX_ATTRIBUTE_NAME, TAB_INDEX_TEST_VALUE),
				Pair.of(TITLE_ATTRIBUTE_NAME, TITLE_TEST_VALUE),
				Pair.of(TRANSLATE_ATTRIBUTE_NAME, TRANSLATE_TEST_VALUE),
				Pair.of(TEST_CUSTOM_ATTR_NAME, TEST_CUSTOM_ATTR_VALUE),
				Pair.of(ON_DRAG_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE),
				Pair.of(ON_DRAG_END_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE),
				Pair.of(ON_DRAG_ENTER_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE),
				Pair.of(ON_DRAG_LEAVE_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE),
				Pair.of(ON_DRAG_OVER_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE),
				Pair.of(ON_DRAG_START_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE),
				Pair.of(ON_DROP_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE),
				Pair.of(ON_COPY_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE),
				Pair.of(ON_CUT_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE),
				Pair.of(ON_PASTE_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE));
	}
	
	/**
	 * @return A String containing all the attributes with their set values
	 */
	protected String makeAllAttributesString(){
		return ACCESS_KEY_ATTRIBUTE_NAME + "=\"" + ACCESS_KEY_TEST_VALUE + "\" " +
				CLASS_ATTRIBUTE_NAME + "=\"" + CLASS_TEST_VALUE + "\" " +
				CONTENT_EDITABLE_ATTRIBUTE_NAME + "=\"" + CONTENT_EDITABLE_TEST_VALUE + "\" " +
				DATA_ATTRIBUTE_NAME_PREFIX + DATA_TEST_KEY_NAME + "=\"" + DATA_TEST_VALUE + "\" " +
				DIR_ATTRIBUTE_NAME + "=\"" + DIR_TEST_VALUE + "\" " +
				DRAGGABLE_ATTRIBUTE_NAME + "=\"" + DRAGGABLE_TEST_VALUE + "\" " +
				HIDDEN_ATTRIBUTE_NAME + " " +
				ID_ATTRIBUTE_NAME + "=\"" + ID_TEST_VALUE + "\" " +
				LANG_ATTRIBUTE_NAME + "=\"" + LANG_TEST_VALUE + "\" " +
				ON_COPY_ATTRIBUTE_NAME + "=\"" + SCRIPT_TEST_VALUE + "\" " +
				ON_CUT_ATTRIBUTE_NAME + "=\"" + SCRIPT_TEST_VALUE + "\" " +
				ON_DRAG_ATTRIBUTE_NAME + "=\"" + SCRIPT_TEST_VALUE + "\" " +
				ON_DRAG_END_ATTRIBUTE_NAME + "=\"" + SCRIPT_TEST_VALUE + "\" " +
				ON_DRAG_ENTER_ATTRIBUTE_NAME + "=\"" + SCRIPT_TEST_VALUE + "\" " +
				ON_DRAG_LEAVE_ATTRIBUTE_NAME + "=\"" + SCRIPT_TEST_VALUE + "\" " +
				ON_DRAG_OVER_ATTRIBUTE_NAME + "=\"" + SCRIPT_TEST_VALUE + "\" " +
				ON_DRAG_START_ATTRIBUTE_NAME + "=\"" + SCRIPT_TEST_VALUE + "\" " +
				ON_DROP_ATTRIBUTE_NAME + "=\"" + SCRIPT_TEST_VALUE + "\" " +
				ON_PASTE_ATTRIBUTE_NAME + "=\"" + SCRIPT_TEST_VALUE + "\" " +
				SPELLCHECK_ATTRIBUTE_NAME + "=\"" + SPELLCHECK_TEST_VALUE + "\" " +
				STYLE_ATTRIBUTE_NAME + "=\"" + STYLE_TEST_VALUE + "\" " +
				TAB_INDEX_ATTRIBUTE_NAME + "=\"" + TAB_INDEX_TEST_VALUE + "\" " +
				TEST_CUSTOM_ATTR_NAME + "=\"" + TEST_CUSTOM_ATTR_VALUE + "\" " +
				TITLE_ATTRIBUTE_NAME + "=\"" + TITLE_TEST_VALUE + "\" " +
				TRANSLATE_ATTRIBUTE_NAME + "=\"" + TRANSLATE_TEST_VALUE + "\"";
	}
	
	/**
	 * Test that the tag name is set to the tag name specified in the constructor for this {@link BaseHTMLTagTest}
	 */
	@Test
	public void testSetTagName(){
		HTMLTag tag = defaultBuilder.build();
		assertEquals(tagName, tag.getTagName());
	}
	
	/**
	 * Test that the default attributes for the created {@link HTMLTag} are correct
	 */
	@Test
	public void testDefaultAttributes(){
		HTMLTag tag = defaultBuilder.build();
		Map<String, String> attributes = tag.getAttributes();
		assertNotNull(attributes);
		assertTrue(attributes.isEmpty());
	}
	
	/**
	 * Test that using {@link #wipeAttributes()} actually wipes the attributes
	 */
	@Test
	public void testWipeAttributes(){
		HTMLTag tag = wipeAttributes().build();
		Map<String, String> attributes = tag.getAttributes();
		assertNotNull(attributes);
		assertTrue(attributes.isEmpty());
	}
	
	/**
	 * Given an {@link HTMLTag} already built with a single attribute set, verify that
	 * the correct attribute is set and only that one is set
	 *
	 * @param tag The {@link HTMLTag} that should have the attribute set
	 * @param attributeName The name of the attribute that should be set
	 * @param value The value of the attribute that should be set
	 */
	protected void testSingleSetAttribute(HTMLTag tag, String attributeName, String value){
		Map<String, String> attributes = tag.getAttributes();
		assertEquals(1, attributes.size());
		assertTrue(attributes.containsKey(attributeName));
		assertEquals(value, attributes.get(attributeName));
	}
	
	/**
	 * Given an {@link HTMLTag} already built with many attributes set, verify that
	 * the correct attributes are set and only those are set
	 *
	 * @param tag The {@link HTMLTag} that should have the attributes set
	 * @param expectedAttributes A Map of the expected attributes and their expected values
	 */
	protected void testManySetAttributes(HTMLTag tag, Map<String, String> expectedAttributes){
		Map<String, String> attributes = tag.getAttributes();
		assertEquals(expectedAttributes.size(), attributes.size());
		for(String key: expectedAttributes.keySet()){
			assertTrue(attributes.containsKey(key));
			assertEquals(expectedAttributes.get(key), attributes.get(key));
		}
	}
	
	/*
	 * Global Attributes
	 */
	
	/**
	 * Test that the {@code accesskey} attribute can be set
	 */
	@Test
	public void testSetAccessKeyAttribute(){
		testSingleSetAttribute(wipeAttributes().accesskey(ACCESS_KEY_TEST_VALUE).build(),
				ACCESS_KEY_ATTRIBUTE_NAME, ACCESS_KEY_TEST_VALUE);
	}
	
	/**
	 * Test that the {@code class} attribute can be set
	 */
	@Test
	public void testSetClassAttribute(){
		testSingleSetAttribute(wipeAttributes().classAttribute(CLASS_TEST_VALUE).build(),
				CLASS_ATTRIBUTE_NAME, CLASS_TEST_VALUE);
	}
	
	/**
	 * Test that the {@code contenteditable} attribute can be set
	 */
	@Test
	public void testSetContentEditableAttribute(){
		testSingleSetAttribute(wipeAttributes().contenteditable(CONTENT_EDITABLE_TEST_VALUE).build(),
				CONTENT_EDITABLE_ATTRIBUTE_NAME, CONTENT_EDITABLE_TEST_VALUE);
	}
	
	/**
	 * Test that the {@code data} attribute can be set
	 */
	@Test
	public void testSetDataAttribute(){
		testSingleSetAttribute(wipeAttributes().data(DATA_TEST_KEY_NAME, DATA_TEST_VALUE).build(),
				DATA_ATTRIBUTE_NAME_PREFIX + DATA_TEST_KEY_NAME, DATA_TEST_VALUE);
	}
	
	/**
	 * Test that the {@code dir} attribute can be set
	 */
	@Test
	public void testSetDirAttribute(){
		testSingleSetAttribute(wipeAttributes().dir(DIR_TEST_VALUE).build(),
				DIR_ATTRIBUTE_NAME, DIR_TEST_VALUE);
	}
	
	/**
	 * Test that the {@code draggable} attribute can be set
	 */
	@Test
	public void testSetDraggableAttribute(){
		testSingleSetAttribute(wipeAttributes().draggable(DRAGGABLE_TEST_VALUE).build(),
				DRAGGABLE_ATTRIBUTE_NAME, DRAGGABLE_TEST_VALUE);
	}
	
	/**
	 * Test that the {@code hidden} attribute can be set
	 */
	@Test
	public void testSetHiddenAttribute(){
		testSingleSetAttribute(wipeAttributes().hidden().build(),
				HIDDEN_ATTRIBUTE_NAME, null);
	}
	
	/**
	 * Test that the {@code id} attribute can be set
	 */
	@Test
	public void testSetIDAttribute(){
		testSingleSetAttribute(wipeAttributes().id(ID_TEST_VALUE).build(),
				ID_ATTRIBUTE_NAME, ID_TEST_VALUE);
	}
	
	/**
	 * Test that the {@code lang} attribute can be set
	 */
	@Test
	public void testSetLangAttribute(){
		testSingleSetAttribute(wipeAttributes().lang(LANG_TEST_VALUE).build(),
				LANG_ATTRIBUTE_NAME, LANG_TEST_VALUE);
	}
	
	/**
	 * Test that the {@code spellcheck} attribute can be set
	 */
	@Test
	public void testSetSpellcheckAttribute(){
		testSingleSetAttribute(wipeAttributes().spellcheck(SPELLCHECK_TEST_VALUE).build(),
				SPELLCHECK_ATTRIBUTE_NAME, SPELLCHECK_TEST_VALUE);
	}
	
	/**
	 * Test that the {@code style} attribute can be set
	 */
	@Test
	public void testSetStyleAttribute(){
		testSingleSetAttribute(wipeAttributes().style(STYLE_TEST_VALUE).build(),
				STYLE_ATTRIBUTE_NAME, STYLE_TEST_VALUE);
	}
	
	/**
	 * Test that the {@code tabindex} attribute can be set
	 */
	@Test
	public void testSetTabIndexAttribute(){
		testSingleSetAttribute(wipeAttributes().tabindex(TAB_INDEX_TEST_VALUE).build(),
				TAB_INDEX_ATTRIBUTE_NAME, TAB_INDEX_TEST_VALUE);
	}
	
	/**
	 * Test that the {@code title} attribute can be set
	 */
	@Test
	public void testSetTitleAttribute(){
		testSingleSetAttribute(wipeAttributes().title(TITLE_TEST_VALUE).build(),
				TITLE_ATTRIBUTE_NAME, TITLE_TEST_VALUE);
	}
	
	/**
	 * Test that the {@code translate} attribute can be set
	 */
	@Test
	public void testSetTranslateAttribute(){
		testSingleSetAttribute(wipeAttributes().translate(TRANSLATE_TEST_VALUE).build(),
				TRANSLATE_ATTRIBUTE_NAME, TRANSLATE_TEST_VALUE);
	}
	
	/*
	 * Global Drag Event Attributes
	 */
	
	/**
	 * Test that the {@code ondrag} attribute can be set
	 */
	@Test
	public void testSetOnDragAttribute(){
		testSingleSetAttribute(wipeAttributes().ondrag(SCRIPT_TEST_VALUE).build(),
				ON_DRAG_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
	}
	
	/**
	 * Test that the {@code ondragend} attribute can be set
	 */
	@Test
	public void testSetOnDragEndAttribute(){
		testSingleSetAttribute(wipeAttributes().ondragend(SCRIPT_TEST_VALUE).build(),
				ON_DRAG_END_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
	}
	
	/**
	 * Test that the {@code ondragenter} attribute can be set
	 */
	@Test
	public void testSetOnDragEnterAttribute(){
		testSingleSetAttribute(wipeAttributes().ondragenter(SCRIPT_TEST_VALUE).build(),
				ON_DRAG_ENTER_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
	}
	
	/**
	 * Test that the {@code ondragleave} attribute can be set
	 */
	@Test
	public void testSetOnDragLeaveAttribute(){
		testSingleSetAttribute(wipeAttributes().ondragleave(SCRIPT_TEST_VALUE).build(),
				ON_DRAG_LEAVE_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
	}
	
	/**
	 * Test that the {@code ondragover} attribute can be set
	 */
	@Test
	public void testSetOnDragOverAttribute(){
		testSingleSetAttribute(wipeAttributes().ondragover(SCRIPT_TEST_VALUE).build(),
				ON_DRAG_OVER_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
	}
	
	/**
	 * Test that the {@code ondragstart} attribute can be set
	 */
	@Test
	public void testSetOnDragStartAttribute(){
		testSingleSetAttribute(wipeAttributes().ondragstart(SCRIPT_TEST_VALUE).build(),
				ON_DRAG_START_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
	}
	
	/**
	 * Test that the {@code ondrop} attribute can be set
	 */
	@Test
	public void testSetOnDropAttribute(){
		testSingleSetAttribute(wipeAttributes().ondrop(SCRIPT_TEST_VALUE).build(),
				ON_DROP_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
	}
	
	/*
	 * Global Clipboard Attributes
	 */
	
	/**
	 * Test that the {@code oncopy} attribute can be set
	 */
	@Test
	public void testSetOnCopyAttribute(){
		testSingleSetAttribute(wipeAttributes().oncopy(SCRIPT_TEST_VALUE).build(),
				ON_COPY_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
	}
	
	/**
	 * Test that the {@code oncut} attribute can be set
	 */
	@Test
	public void testSetOnCutAttribute(){
		testSingleSetAttribute(wipeAttributes().oncut(SCRIPT_TEST_VALUE).build(),
				ON_CUT_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
	}
	
	/**
	 * Test that the {@code onpaste} attribute can be set
	 */
	@Test
	public void testSetOnPasteAttribute(){
		testSingleSetAttribute(wipeAttributes().onpaste(SCRIPT_TEST_VALUE).build(),
				ON_PASTE_ATTRIBUTE_NAME, SCRIPT_TEST_VALUE);
	}
	
	/*
	 * Custom Attributes
	 */
	
	/**
	 * Test that you can set a single custom attribute
	 */
	@Test
	public void testSetCustomAttribute(){
		HTMLTag tag = wipeAttributes().attribute(TEST_CUSTOM_ATTR_NAME, TEST_CUSTOM_ATTR_VALUE).build();
		Map<String, String> attributes = tag.getAttributes();
		assertEquals(1, attributes.size());
		assertTrue(attributes.containsKey(TEST_CUSTOM_ATTR_NAME));
		assertEquals(TEST_CUSTOM_ATTR_VALUE, attributes.get(TEST_CUSTOM_ATTR_NAME));
	}
	
	/**
	 * Test that you can set all the attributes together
	 */
	@Test
	public void testSetAllAttributes(){
		testManySetAttributes(setAllAttributes().build(),
				makeAllAttributesMap());
	}
	
	/**
	 * Test that the attributes whitelist is correct
	 */
	@Test
	public void testAttributeWhitelist(){
		HTMLTag tag = defaultBuilder.build();
		assertEquals(attributeWhitelist, tag.getAttributeWhitelist());
	}
	
	/**
	 * Test that closing tag is set properly
	 */
	@Test
	public void testSetClosingTag(){
		HTMLTag tag = defaultBuilder.build();
		assertEquals(closingTag, tag.hasClosingTag());
	}
	
	/**
	 * Test that the sub tag whitelist is correct
	 */
	@Test
	public void testSubTagWhitelist(){
		HTMLTag tag = defaultBuilder.build();
		assertEquals(subTagWhitelist, tag.getSubTagWhitelist());
	}
	
	/**
	 * Test that the sub tag blacklist is correct
	 */
	@Test
	public void testSubTagBlacklist(){
		HTMLTag tag = defaultBuilder.build();
		assertEquals(subTagBlacklist, tag.getSubTagBlacklist());
	}
	
	/**
	 * Test the opening tag when attributes are wiped
	 */
	@Test
	public void testWipedOpeningTag(){
		HTMLTag tag = wipeAttributes().build();
		assertEquals("<" + tagName + ">", tag.toOpeningTag());
	}
	
	/**
	 * Test the default opening tag
	 */
	@Test
	public void testDefaultOpeningTag(){
		HTMLTag tag = defaultBuilder.build();
		assertEquals("<" + tagName + ">", tag.toOpeningTag());
	}
	
	/**
	 * Test the opening tag when all attributes are set
	 */
	@Test
	public void testOpeningTagAllAttributes(){
		HTMLTag tag = setAllAttributes().build();
		assertEquals("<" + tagName + " " +
				makeAllAttributesString() +
				">", tag.toOpeningTag());
	}
	
	/**
	 * Test that the closing tag string is correct
	 */
	@Test
	public void testToClosingTag(){
		HTMLTag tag = defaultBuilder.build();
		assertEquals(closingTag?"</" + tagName + ">":"", tag.toClosingTag());
	}
	
	/**
	 * Test toString when attributes are wiped
	 */
	@Test
	public void testWipedToString(){
		HTMLTag tag = wipeAttributes().build();
		assertEquals("<" + tagName + ">" + (closingTag?"</" + tagName + ">":""), tag.toString());
	}
	
	/**
	 * Test the default toString
	 */
	@Test
	public void testDefaultToString(){
		HTMLTag tag = defaultBuilder.build();
		assertEquals("<" + tagName + ">" + (closingTag?"</" + tagName + ">":""), tag.toString());
	}
	
	/**
	 * Test toString when all attributes are set
	 */
	@Test
	public void testToStringAllAttributes(){
		HTMLTag tag = setAllAttributes().build();
		assertEquals("<" + tagName + " " +
				makeAllAttributesString() +
				">"  + (closingTag?"</" + tagName + ">":""), tag.toString());
	}
}
