package com.github.tadukoo.parsing.web.html.tag;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
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
	 * Test that the {@code accesskey} attribute can be set
	 */
	@Test
	public void testSetAccessKeyAttribute(){
		HTMLTag tag = wipeAttributes().accesskey(ACCESS_KEY_TEST_VALUE).build();
		Map<String, String> attributes = tag.getAttributes();
		assertEquals(1, attributes.size());
		assertTrue(attributes.containsKey(ACCESS_KEY_ATTRIBUTE_NAME));
		assertEquals(ACCESS_KEY_TEST_VALUE, attributes.get(ACCESS_KEY_ATTRIBUTE_NAME));
	}
	
	/**
	 * Test that the {@code class} attribute can be set
	 */
	@Test
	public void testSetClassAttribute(){
		HTMLTag tag = wipeAttributes().classAttribute(CLASS_TEST_VALUE).build();
		Map<String, String> attributes = tag.getAttributes();
		assertEquals(1, attributes.size());
		assertTrue(attributes.containsKey(CLASS_ATTRIBUTE_NAME));
		assertEquals(CLASS_TEST_VALUE, attributes.get(CLASS_ATTRIBUTE_NAME));
	}
	
	/**
	 * Test that the {@code contenteditable} attribute can be set
	 */
	@Test
	public void testSetContentEditableAttribute(){
		HTMLTag tag = wipeAttributes().contenteditable(CONTENT_EDITABLE_TEST_VALUE).build();
		Map<String, String> attributes = tag.getAttributes();
		assertEquals(1, attributes.size());
		assertTrue(attributes.containsKey(CONTENT_EDITABLE_ATTRIBUTE_NAME));
		assertEquals(CONTENT_EDITABLE_TEST_VALUE, attributes.get(CONTENT_EDITABLE_ATTRIBUTE_NAME));
	}
	
	/**
	 * Test that the {@code data} attribute can be set
	 */
	@Test
	public void testSetDataAttribute(){
		HTMLTag tag = wipeAttributes().data(DATA_TEST_KEY_NAME, DATA_TEST_VALUE).build();
		Map<String, String> attributes = tag.getAttributes();
		assertEquals(1, attributes.size());
		assertTrue(attributes.containsKey(DATA_ATTRIBUTE_NAME_PREFIX + DATA_TEST_KEY_NAME));
		assertEquals(DATA_TEST_VALUE, attributes.get(DATA_ATTRIBUTE_NAME_PREFIX + DATA_TEST_KEY_NAME));
	}
	
	/**
	 * Test that the {@code dir} attribute can be set
	 */
	@Test
	public void testSetDirAttribute(){
		HTMLTag tag = wipeAttributes().dir(DIR_TEST_VALUE).build();
		Map<String, String> attributes = tag.getAttributes();
		assertEquals(1, attributes.size());
		assertTrue(attributes.containsKey(DIR_ATTRIBUTE_NAME));
		assertEquals(DIR_TEST_VALUE, attributes.get(DIR_ATTRIBUTE_NAME));
	}
	
	/**
	 * Test that the {@code draggable} attribute can be set
	 */
	@Test
	public void testSetDraggableAttribute(){
		HTMLTag tag = wipeAttributes().draggable(DRAGGABLE_TEST_VALUE).build();
		Map<String, String> attributes = tag.getAttributes();
		assertEquals(1, attributes.size());
		assertTrue(attributes.containsKey(DRAGGABLE_ATTRIBUTE_NAME));
		assertEquals(DRAGGABLE_TEST_VALUE, attributes.get(DRAGGABLE_ATTRIBUTE_NAME));
	}
	
	/**
	 * Test that the {@code hidden} attribute can be set
	 */
	@Test
	public void testSetHiddenAttribute(){
		HTMLTag tag = wipeAttributes().hidden().build();
		Map<String, String> attributes = tag.getAttributes();
		assertEquals(1, attributes.size());
		assertTrue(attributes.containsKey(HIDDEN_ATTRIBUTE_NAME));
		assertNull(attributes.get(HIDDEN_ATTRIBUTE_NAME));
	}
	
	/**
	 * Test that the {@code id} attribute can be set
	 */
	@Test
	public void testSetIDAttribute(){
		HTMLTag tag = wipeAttributes().id(ID_TEST_VALUE).build();
		Map<String, String> attributes = tag.getAttributes();
		assertEquals(1, attributes.size());
		assertTrue(attributes.containsKey(ID_ATTRIBUTE_NAME));
		assertEquals(ID_TEST_VALUE, attributes.get(ID_ATTRIBUTE_NAME));
	}
	
	/**
	 * Test that the {@code lang} attribute can be set
	 */
	@Test
	public void testSetLangAttribute(){
		HTMLTag tag = wipeAttributes().lang(LANG_TEST_VALUE).build();
		Map<String, String> attributes = tag.getAttributes();
		assertEquals(1, attributes.size());
		assertTrue(attributes.containsKey(LANG_ATTRIBUTE_NAME));
		assertEquals(LANG_TEST_VALUE, attributes.get(LANG_ATTRIBUTE_NAME));
	}
	
	/**
	 * Test that the {@code spellcheck} attribute can be set
	 */
	@Test
	public void testSetSpellcheckAttribute(){
		HTMLTag tag = wipeAttributes().spellcheck(SPELLCHECK_TEST_VALUE).build();
		Map<String, String> attributes = tag.getAttributes();
		assertEquals(1, attributes.size());
		assertTrue(attributes.containsKey(SPELLCHECK_ATTRIBUTE_NAME));
		assertEquals(SPELLCHECK_TEST_VALUE, attributes.get(SPELLCHECK_ATTRIBUTE_NAME));
	}
	
	/**
	 * Test that the {@code style} attribute can be set
	 */
	@Test
	public void testSetStyleAttribute(){
		HTMLTag tag = wipeAttributes().style(STYLE_TEST_VALUE).build();
		Map<String, String> attributes = tag.getAttributes();
		assertEquals(1, attributes.size());
		assertTrue(attributes.containsKey(STYLE_ATTRIBUTE_NAME));
		assertEquals(STYLE_TEST_VALUE, attributes.get(STYLE_ATTRIBUTE_NAME));
	}
	
	/**
	 * Test that the {@code tabindex} attribute can be set
	 */
	@Test
	public void testSetTabIndexAttribute(){
		HTMLTag tag = wipeAttributes().tabindex(TAB_INDEX_TEST_VALUE).build();
		Map<String, String> attributes = tag.getAttributes();
		assertEquals(1, attributes.size());
		assertTrue(attributes.containsKey(TAB_INDEX_ATTRIBUTE_NAME));
		assertEquals(TAB_INDEX_TEST_VALUE, attributes.get(TAB_INDEX_ATTRIBUTE_NAME));
	}
	
	/**
	 * Test that the {@code title} attribute can be set
	 */
	@Test
	public void testSetTitleAttribute(){
		HTMLTag tag = wipeAttributes().title(TITLE_TEST_VALUE).build();
		Map<String, String> attributes = tag.getAttributes();
		assertEquals(1, attributes.size());
		assertTrue(attributes.containsKey(TITLE_ATTRIBUTE_NAME));
		assertEquals(TITLE_TEST_VALUE, attributes.get(TITLE_ATTRIBUTE_NAME));
	}
	
	/**
	 * Test that the {@code translate} attribute can be set
	 */
	@Test
	public void testSetTranslateAttribute(){
		HTMLTag tag = wipeAttributes().translate(TRANSLATE_TEST_VALUE).build();
		Map<String, String> attributes = tag.getAttributes();
		assertEquals(1, attributes.size());
		assertTrue(attributes.containsKey(TRANSLATE_ATTRIBUTE_NAME));
		assertEquals(TRANSLATE_TEST_VALUE, attributes.get(TRANSLATE_ATTRIBUTE_NAME));
	}
	
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
		HTMLTag tag = wipeAttributes()
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
				.attribute(TEST_CUSTOM_ATTR_NAME, TEST_CUSTOM_ATTR_VALUE)
				.build();
		Map<String, String> attributes = tag.getAttributes();
		assertEquals(15, attributes.size());
		assertTrue(attributes.containsKey(ACCESS_KEY_ATTRIBUTE_NAME));
		assertEquals(ACCESS_KEY_TEST_VALUE, attributes.get(ACCESS_KEY_ATTRIBUTE_NAME));
		assertTrue(attributes.containsKey(CLASS_ATTRIBUTE_NAME));
		assertEquals(CLASS_TEST_VALUE, attributes.get(CLASS_ATTRIBUTE_NAME));
		assertTrue(attributes.containsKey(CONTENT_EDITABLE_ATTRIBUTE_NAME));
		assertEquals(CONTENT_EDITABLE_TEST_VALUE, attributes.get(CONTENT_EDITABLE_ATTRIBUTE_NAME));
		assertTrue(attributes.containsKey(DATA_ATTRIBUTE_NAME_PREFIX + DATA_TEST_KEY_NAME));
		assertEquals(DATA_TEST_VALUE, attributes.get(DATA_ATTRIBUTE_NAME_PREFIX + DATA_TEST_KEY_NAME));
		assertTrue(attributes.containsKey(DIR_ATTRIBUTE_NAME));
		assertEquals(DIR_TEST_VALUE, attributes.get(DIR_ATTRIBUTE_NAME));
		assertTrue(attributes.containsKey(DRAGGABLE_ATTRIBUTE_NAME));
		assertEquals(DRAGGABLE_TEST_VALUE, attributes.get(DRAGGABLE_ATTRIBUTE_NAME));
		assertTrue(attributes.containsKey(HIDDEN_ATTRIBUTE_NAME));
		assertNull(attributes.get(HIDDEN_ATTRIBUTE_NAME));
		assertTrue(attributes.containsKey(ID_ATTRIBUTE_NAME));
		assertEquals(ID_TEST_VALUE, attributes.get(ID_ATTRIBUTE_NAME));
		assertTrue(attributes.containsKey(LANG_ATTRIBUTE_NAME));
		assertEquals(LANG_TEST_VALUE, attributes.get(LANG_ATTRIBUTE_NAME));
		assertTrue(attributes.containsKey(SPELLCHECK_ATTRIBUTE_NAME));
		assertEquals(SPELLCHECK_TEST_VALUE, attributes.get(SPELLCHECK_ATTRIBUTE_NAME));
		assertTrue(attributes.containsKey(STYLE_ATTRIBUTE_NAME));
		assertEquals(STYLE_TEST_VALUE, attributes.get(STYLE_ATTRIBUTE_NAME));
		assertTrue(attributes.containsKey(TAB_INDEX_ATTRIBUTE_NAME));
		assertEquals(TAB_INDEX_TEST_VALUE, attributes.get(TAB_INDEX_ATTRIBUTE_NAME));
		assertTrue(attributes.containsKey(TITLE_ATTRIBUTE_NAME));
		assertEquals(TITLE_TEST_VALUE, attributes.get(TITLE_ATTRIBUTE_NAME));
		assertTrue(attributes.containsKey(TRANSLATE_ATTRIBUTE_NAME));
		assertEquals(TRANSLATE_TEST_VALUE, attributes.get(TRANSLATE_ATTRIBUTE_NAME));
		assertTrue(attributes.containsKey(TEST_CUSTOM_ATTR_NAME));
		assertEquals(TEST_CUSTOM_ATTR_VALUE, attributes.get(TEST_CUSTOM_ATTR_NAME));
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
		HTMLTag tag = wipeAttributes()
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
				.attribute(TEST_CUSTOM_ATTR_NAME, TEST_CUSTOM_ATTR_VALUE)
				.build();
		assertEquals("<" + tagName + " " +
				ACCESS_KEY_ATTRIBUTE_NAME + "=\"" + ACCESS_KEY_TEST_VALUE + "\" " +
				CLASS_ATTRIBUTE_NAME + "=\"" + CLASS_TEST_VALUE + "\" " +
				CONTENT_EDITABLE_ATTRIBUTE_NAME + "=\"" + CONTENT_EDITABLE_TEST_VALUE + "\" " +
				DATA_ATTRIBUTE_NAME_PREFIX + DATA_TEST_KEY_NAME + "=\"" + DATA_TEST_VALUE + "\" " +
				DIR_ATTRIBUTE_NAME + "=\"" + DIR_TEST_VALUE + "\" " +
				DRAGGABLE_ATTRIBUTE_NAME + "=\"" + DRAGGABLE_TEST_VALUE + "\" " +
				HIDDEN_ATTRIBUTE_NAME + " " +
				ID_ATTRIBUTE_NAME + "=\"" + ID_TEST_VALUE + "\" " +
				LANG_ATTRIBUTE_NAME + "=\"" + LANG_TEST_VALUE + "\" " +
				SPELLCHECK_ATTRIBUTE_NAME + "=\"" + SPELLCHECK_TEST_VALUE + "\" " +
				STYLE_ATTRIBUTE_NAME + "=\"" + STYLE_TEST_VALUE + "\" " +
				TAB_INDEX_ATTRIBUTE_NAME + "=\"" + TAB_INDEX_TEST_VALUE + "\" " +
				TEST_CUSTOM_ATTR_NAME + "=\"" + TEST_CUSTOM_ATTR_VALUE + "\" " +
				TITLE_ATTRIBUTE_NAME + "=\"" + TITLE_TEST_VALUE + "\" " +
				TRANSLATE_ATTRIBUTE_NAME + "=\"" + TRANSLATE_TEST_VALUE + "\"" +
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
		HTMLTag tag = wipeAttributes()
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
				.attribute(TEST_CUSTOM_ATTR_NAME, TEST_CUSTOM_ATTR_VALUE)
				.build();
		assertEquals("<" + tagName + " " +
				ACCESS_KEY_ATTRIBUTE_NAME + "=\"" + ACCESS_KEY_TEST_VALUE + "\" " +
				CLASS_ATTRIBUTE_NAME + "=\"" + CLASS_TEST_VALUE + "\" " +
				CONTENT_EDITABLE_ATTRIBUTE_NAME + "=\"" + CONTENT_EDITABLE_TEST_VALUE + "\" " +
				DATA_ATTRIBUTE_NAME_PREFIX + DATA_TEST_KEY_NAME + "=\"" + DATA_TEST_VALUE + "\" " +
				DIR_ATTRIBUTE_NAME + "=\"" + DIR_TEST_VALUE + "\" " +
				DRAGGABLE_ATTRIBUTE_NAME + "=\"" + DRAGGABLE_TEST_VALUE + "\" " +
				HIDDEN_ATTRIBUTE_NAME + " " +
				ID_ATTRIBUTE_NAME + "=\"" + ID_TEST_VALUE + "\" " +
				LANG_ATTRIBUTE_NAME + "=\"" + LANG_TEST_VALUE + "\" " +
				SPELLCHECK_ATTRIBUTE_NAME + "=\"" + SPELLCHECK_TEST_VALUE + "\" " +
				STYLE_ATTRIBUTE_NAME + "=\"" + STYLE_TEST_VALUE + "\" " +
				TAB_INDEX_ATTRIBUTE_NAME + "=\"" + TAB_INDEX_TEST_VALUE + "\" " +
				TEST_CUSTOM_ATTR_NAME + "=\"" + TEST_CUSTOM_ATTR_VALUE + "\" " +
				TITLE_ATTRIBUTE_NAME + "=\"" + TITLE_TEST_VALUE + "\" " +
				TRANSLATE_ATTRIBUTE_NAME + "=\"" + TRANSLATE_TEST_VALUE + "\"" +
				">"  + (closingTag?"</" + tagName + ">":""), tag.toString());
	}
}
