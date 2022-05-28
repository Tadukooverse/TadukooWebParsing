package com.github.tadukoo.parsing.web.html.tag;

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
	/** The root HTML tag name */
	String HTML_ROOT_TAG_NAME = "html";
	
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
	
	/*
	 * Default Values
	 */
	String DEFAULT_LANG_VALUE = "en-US";
}
