package com.github.tadukoo.parsing.web.html.tag;

import com.github.tadukoo.util.SetUtil;

import java.util.Set;

/**
 * An interface containing standard tag names, attribute names/prefixes, and default values for use in
 * {@link HTMLTag HTMLTags}
 *
 * @author Logan Ferree (Tadukoo)
 * @version Alpha v.0.1
 */
public interface HTMLTagConstants{
	/*
	 * Basic Tag Names
	 */
	/** The root HTML tag name - html */
	String HTML_ROOT_TAG_NAME = "html";
	/** The head HTML tag name - head */
	String HTML_HEAD_TAG_NAME = "head";
	
	/*
	 * Head Tag Names (tags that go inside &lt;head> tag)
	 */
	String HTML_TITLE_TAG_NAME = "title";
	String HTML_STYLE_TAG_NAME = "style";
	String HTML_BASE_TAG_NAME = "base";
	String HTML_LINK_TAG_NAME = "link";
	String HTML_META_TAG_NAME = "meta";
	String HTML_SCRIPT_TAG_NAME = "script";
	String HTML_NOSCRIPT_TAG_NAME = "noscript";
	/** The Set of valid sub tags of the &lt;head> tag */
	Set<String> VALID_HTML_HEAD_SUB_TAGS = SetUtil.createSet(HTML_TITLE_TAG_NAME, HTML_STYLE_TAG_NAME,
			HTML_BASE_TAG_NAME, HTML_LINK_TAG_NAME, HTML_META_TAG_NAME, HTML_SCRIPT_TAG_NAME, HTML_NOSCRIPT_TAG_NAME);
	
	/*
	 * Global Attribute Names
	 */
	/** accesskey - Specifies a shortcut key to activate/focus an element */
	String ACCESS_KEY_ATTRIBUTE_NAME = "accesskey";
	/** class - Specifies one or more classnames for an element (refers to a class in a style sheet) */
	String CLASS_ATTRIBUTE_NAME = "class";
	/** contenteditable - Specifies whether the content of an element is editable or not */
	String CONTENT_EDITABLE_ATTRIBUTE_NAME = "contenteditable";
	/** data - Used to store custom data private to the page or application */
	String DATA_ATTRIBUTE_NAME_PREFIX = "data-";
	/** dir - Specifies the text direction for the content in an element */
	String DIR_ATTRIBUTE_NAME = "dir";
	/** draggable - Specifies whether an element is draggable or not */
	String DRAGGABLE_ATTRIBUTE_NAME = "draggable";
	/** hidden - Specifies that an element is not yet, or is no longer, relevant */
	String HIDDEN_ATTRIBUTE_NAME = "hidden";
	/** id - Specifies a unique id for an element */
	String ID_ATTRIBUTE_NAME = "id";
	/** lang - Specifies the language of the element's content */
	String LANG_ATTRIBUTE_NAME = "lang";
	/** spellcheck - Specifies whether the element is to have its spelling and grammar checked or not */
	String SPELLCHECK_ATTRIBUTE_NAME = "spellcheck";
	/** style - Specifies an inline CSS style for an element */
	String STYLE_ATTRIBUTE_NAME = "style";
	/** tabindex - Specifies the tabbing order of an element */
	String TAB_INDEX_ATTRIBUTE_NAME = "tabindex";
	/** title - Specifies extra information about an element */
	String TITLE_ATTRIBUTE_NAME = "title";
	/** translate - Specifies whether the content of an element should be translated or not */
	String TRANSLATE_ATTRIBUTE_NAME = "translate";
	/** The Set of global attributes as a whitelist */
	Set<String> GLOBAL_ATTRIBUTE_WHITELIST = SetUtil.createSet(ACCESS_KEY_ATTRIBUTE_NAME, CLASS_ATTRIBUTE_NAME,
			CONTENT_EDITABLE_ATTRIBUTE_NAME, DIR_ATTRIBUTE_NAME, DRAGGABLE_ATTRIBUTE_NAME, HIDDEN_ATTRIBUTE_NAME,
			ID_ATTRIBUTE_NAME, LANG_ATTRIBUTE_NAME, SPELLCHECK_ATTRIBUTE_NAME, STYLE_ATTRIBUTE_NAME,
			TAB_INDEX_ATTRIBUTE_NAME, TITLE_ATTRIBUTE_NAME, TRANSLATE_ATTRIBUTE_NAME);
	
	/*
	 * Default Values
	 */
	String DEFAULT_LANG_VALUE = "en-US";
}
