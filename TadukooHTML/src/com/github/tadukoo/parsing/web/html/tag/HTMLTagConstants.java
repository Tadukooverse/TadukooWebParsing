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
	/** The body HTML tag name - body */
	String HTML_BODY_TAG_NAME = "body";
	
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
	 * Special Names
	 */
	/** This is used to specify that content is valid to hold within an HTML tag */
	String HTML_CONTENT_NAME = "{CONTENT}";
	
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
	 * Global Drag Event Attribute Names - apply to all HTML tags
	 */
	/** ondrag - Specifies a script to be run when an element is dragged */
	String ON_DRAG_ATTRIBUTE_NAME = "ondrag";
	/** ondragend - Specifies a script to be run at the end of a drag operation */
	String ON_DRAG_END_ATTRIBUTE_NAME = "ondragend";
	/** ondragenter - Specifies a script to be run when an element has been dragged to a valid drop target */
	String ON_DRAG_ENTER_ATTRIBUTE_NAME = "ondragenter";
	/** ondragleave - Specifies a script to be run when an element leaves a valid drop target */
	String ON_DRAG_LEAVE_ATTRIBUTE_NAME = "ondragleave";
	/** ondragover - Specifies a script to be run when an element is being dragged over a valid drop target */
	String ON_DRAG_OVER_ATTRIBUTE_NAME = "ondragover";
	/** ondragstart - Specifies a script to be run at the start of a drag operation */
	String ON_DRAG_START_ATTRIBUTE_NAME = "ondragstart";
	/** ondrop - Specifies a script to be run when dragged element is being dropped */
	String ON_DROP_ATTRIBUTE_NAME = "ondrop";
	/** The Set of global drag event attributes as a whitelist */
	Set<String> GLOBAL_DRAG_EVENT_ATTRIBUTE_WHITELIST = SetUtil.createSet(ON_DRAG_ATTRIBUTE_NAME,
			ON_DRAG_END_ATTRIBUTE_NAME, ON_DRAG_ENTER_ATTRIBUTE_NAME, ON_DRAG_LEAVE_ATTRIBUTE_NAME,
			ON_DRAG_OVER_ATTRIBUTE_NAME, ON_DRAG_START_ATTRIBUTE_NAME, ON_DROP_ATTRIBUTE_NAME);
	
	/*
	 * Global Clipboard Event Attribute Names - apply to all HTML tags
	 */
	/** oncopy - Specifies a script to be run when the user copies the content of an element */
	String ON_COPY_ATTRIBUTE_NAME = "oncopy";
	/** oncut - Specifies a script to be run when the user cuts the content of an element */
	String ON_CUT_ATTRIBUTE_NAME = "oncut";
	/** onpaste - Specifies a script to be run when the user pastes some content in an element */
	String ON_PASTE_ATTRIBUTE_NAME = "onpaste";
	/** The Set of all global clipboard event attributes as a whitelist */
	Set<String> GLOBAL_CLIPBOARD_EVENT_ATTRIBUTE_WHITELIST = SetUtil.createSet(ON_COPY_ATTRIBUTE_NAME,
			ON_CUT_ATTRIBUTE_NAME, ON_PASTE_ATTRIBUTE_NAME);
	
	/** The Set of all global attributes that apply for all HTML tags */
	Set<String> ALL_GLOBAL_ATTRIBUTE_WHITELIST = SetUtil.createSet(ACCESS_KEY_ATTRIBUTE_NAME, CLASS_ATTRIBUTE_NAME,
			CONTENT_EDITABLE_ATTRIBUTE_NAME, DIR_ATTRIBUTE_NAME, DRAGGABLE_ATTRIBUTE_NAME, HIDDEN_ATTRIBUTE_NAME,
			ID_ATTRIBUTE_NAME, LANG_ATTRIBUTE_NAME, SPELLCHECK_ATTRIBUTE_NAME, STYLE_ATTRIBUTE_NAME,
			TAB_INDEX_ATTRIBUTE_NAME, TITLE_ATTRIBUTE_NAME, TRANSLATE_ATTRIBUTE_NAME,
			ON_DRAG_ATTRIBUTE_NAME,
			ON_DRAG_END_ATTRIBUTE_NAME, ON_DRAG_ENTER_ATTRIBUTE_NAME, ON_DRAG_LEAVE_ATTRIBUTE_NAME,
			ON_DRAG_OVER_ATTRIBUTE_NAME, ON_DRAG_START_ATTRIBUTE_NAME, ON_DROP_ATTRIBUTE_NAME,
			ON_COPY_ATTRIBUTE_NAME, ON_CUT_ATTRIBUTE_NAME, ON_PASTE_ATTRIBUTE_NAME);
	
	/*
	 * Global Form Event Attribute Names - apply to most HTML tags
	 */
	/*
	 * onblur
	 * onchange
	 * oncontextmenu
	 * onfocus
	 * oninput
	 * oninvalid
	 * onreset
	 * onsearch
	 * onselect
	 * onsubmit
	 */
	
	/*
	 * Global Keyboard Event Attribute Names - apply to most HTML tags
	 */
	/*
	 * onkeydown
	 * onkeypress
	 * onkeyup
	 */
	
	/*
	 * Global Mouse Event Attribute Names - apply to most HTML tags
	 */
	/*
	 * onclick
	 * ondblclick
	 * onmousedown
	 * onmousemove
	 * onmouseout
	 * onmouseover
	 * onmouseup
	 * onwheel
	 */
	
	/*
	 * Global Window Event Attribute Names - apply to body tag
	 */
	/*
	 * onafterprint
	 * onbeforeprint
	 * onbeforeunload
	 * onerror
	 * onhashchange
	 * onload
	 * onmessage
	 * onoffline
	 * ononline
	 * onpagehide
	 * onpageshow
	 * onpopstate
	 * onresize
	 * onstorage
	 * onunload
	 */
	
	/*
	 * Global Media Event Attribute Names - apply to media HTML tags
	 */
	/*
	 * onabort
	 * oncanplay
	 * oncanplaythrough
	 * oncuechange
	 * ondurationchange
	 * onemptied
	 * onended
	 * onerror
	 * onloadeddata
	 * onloadedmetadata
	 * onloadstart
	 * onpause
	 * onplay
	 * onplaying
	 * onprogress
	 * onratechange
	 * onseeked
	 * onseeking
	 * onstalled
	 * onsuspend
	 * ontimeupdate
	 * onvolumechange
	 * onwaiting
	 */
	
	/*
	 * Other Attribute Names
	 */
	/** onscroll - Specifies a script to be run when an element's scrollbar is being scrolled */
	String ON_SCROLL_ATTRIBUTE_NAME = "onscroll";
	/*
	 * ontoggle - used in details tag
	 */
	
	/*
	 * Default Values
	 */
	String DEFAULT_LANG_VALUE = "en-US";
}
