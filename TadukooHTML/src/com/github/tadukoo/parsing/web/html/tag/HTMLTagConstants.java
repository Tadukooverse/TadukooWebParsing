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
	 * Body Tag Names (tags that go inside &lt;body> tag)
	 */
	String HTML_HEADING_1_TAG_NAME = "h1";
	String HTML_HEADING_2_TAG_NAME = "h2";
	String HTML_HEADING_3_TAG_NAME = "h3";
	String HTML_HEADING_4_TAG_NAME = "h4";
	String HTML_HEADING_5_TAG_NAME = "h5";
	String HTML_HEADING_6_TAG_NAME = "h6";
	String HTML_PARAGRAPH_TAG_NAME = "p";
	String HTML_IMAGE_TAG_NAME = "img";
	String HTML_HYPERLINK_TAG_NAME = "a";
	String HTML_TABLE_TAG_NAME = "table";
	String HTML_UNORDERED_LIST_TAG_NAME = "ul";
	String HTML_ORDERED_LIST_TAG_NAME = "ol";
	/** The Set of valid sub tags of the &lt;body> tag */
	Set<String> VALID_HTML_BODY_SUB_TAGS = SetUtil.createSet(HTML_HEADING_1_TAG_NAME, HTML_HEADING_2_TAG_NAME,
			HTML_HEADING_3_TAG_NAME, HTML_HEADING_4_TAG_NAME, HTML_HEADING_5_TAG_NAME, HTML_HEADING_6_TAG_NAME,
			HTML_PARAGRAPH_TAG_NAME, HTML_IMAGE_TAG_NAME, HTML_HYPERLINK_TAG_NAME, HTML_TABLE_TAG_NAME,
			HTML_UNORDERED_LIST_TAG_NAME, HTML_ORDERED_LIST_TAG_NAME);
	
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
	
	/*
	 * Other Global Event Attribute Names - apply to all HTML tags
	 */
	/** oncontextmenu - Specifies a script to be run when the context menu is triggered */
	String ON_CONTEXT_MENU_ATTRIBUTE_NAME = "oncontextmenu";
	/** onwheel - Specifies a script to be run when the mouse wheel rolls up or down over an element */
	String ON_WHEEL_ATTRIBUTE_NAME = "onwheel";
	Set<String> OTHER_GLOBAL_EVENT_ATTRIBUTE_WHITELIST = SetUtil.createSet(ON_CONTEXT_MENU_ATTRIBUTE_NAME,
			ON_WHEEL_ATTRIBUTE_NAME);
	
	/** The Set of all global attributes that apply for all HTML tags */
	Set<String> ALL_GLOBAL_ATTRIBUTE_WHITELIST = SetUtil.mergeSets(GLOBAL_ATTRIBUTE_WHITELIST,
			GLOBAL_DRAG_EVENT_ATTRIBUTE_WHITELIST, GLOBAL_CLIPBOARD_EVENT_ATTRIBUTE_WHITELIST,
			OTHER_GLOBAL_EVENT_ATTRIBUTE_WHITELIST);
	
	/*
	 * Global Focus Event Attribute Names - apply to most HTML tags
	 * - all except <base>, <bdo>, <br>, <head>, <html>, <iframe>, <meta>, <param>, <script>, <style>, and <title>
	 */
	/** onblur - Specifies a script to run when the element loses focus */
	String ON_BLUR_ATTRIBUTE_NAME = "onblur";
	/** onfocus - Specifies a script to run when the element gets focus */
	String ON_FOCUS_ATTRIBUTE_NAME = "onfocus";
	/** The Set of all global focus event attributes */
	Set<String> GLOBAL_FOCUS_EVENT_ATTRIBUTE_WHITELIST = SetUtil.createSet(ON_BLUR_ATTRIBUTE_NAME,
			ON_FOCUS_ATTRIBUTE_NAME);
	
	/*
	 * Global Keyboard Event Attribute Names - apply to most HTML tags
	 * - all except <base>, <bdo>, <br>, <head>, <html>, <iframe>, <meta>, <param>, <script>, <style>, and <title>
	 */
	/** onkeydown - Specifies a script to run when a user is pressing a key */
	String ON_KEY_DOWN_ATTRIBUTE_NAME = "onkeydown";
	/** onkeypress - Specifies a script to run when a user presses a key */
	String ON_KEY_PRESS_ATTRIBUTE_NAME = "onkeypress";
	/** onkeyup - Specifies a script to run when a user releases a key */
	String ON_KEY_UP_ATTRIBUTE_NAME = "onkeyup";
	/** The Set of all global keyboard event attributes */
	Set<String> GLOBAL_KEYBOARD_EVENT_ATTRIBUTE_WHITELIST = SetUtil.createSet(ON_KEY_DOWN_ATTRIBUTE_NAME,
			ON_KEY_PRESS_ATTRIBUTE_NAME, ON_KEY_UP_ATTRIBUTE_NAME);
	
	/*
	 * Global Mouse Event Attribute Names - apply to most HTML tags
	 * - all except <base>, <bdo>, <br>, <head>, <html>, <iframe>, <meta>, <param>, <script>, <style>, and <title>
	 */
	/** onclick - Specifies a script that runs on a mouse click on the element */
	String ON_CLICK_ATTRIBUTE_NAME = "onclick";
	/** ondblclick - Specifies a script that runs on a mouse double-click on the element */
	String ON_DBL_CLICK_ATTRIBUTE_NAME = "ondblclick";
	/** onmousedown - Specifies a script that runs when a mouse button is pressed down on an element */
	String ON_MOUSE_DOWN_ATTRIBUTE_NAME = "onmousedown";
	/** onmousemove - Specifies a script that runs when the mouse pointer is moving while it is over an element */
	String ON_MOUSE_MOVE_ATTRIBUTE_NAME = "onmousemove";
	/** onmouseout - Specifies a script that runs when the mouse pointer moves out of an element */
	String ON_MOUSE_OUT_ATTRIBUTE_NAME = "onmouseout";
	/** onmouseover - Specifies a script that runs when the mouse pointer moves over an element */
	String ON_MOUSE_OVER_ATTRIBUTE_NAME = "onmouseover";
	/** onmouseup - Specifies a script that runs when a mouse button is released over an element */
	String ON_MOUSE_UP_ATTRIBUTE_NAME = "onmouseup";
	/** The Set of all global mouse event attributes */
	Set<String> GLOBAL_MOUSE_EVENT_ATTRIBUTE_WHITELIST = SetUtil.createSet(ON_CLICK_ATTRIBUTE_NAME,
			ON_DBL_CLICK_ATTRIBUTE_NAME, ON_MOUSE_DOWN_ATTRIBUTE_NAME, ON_MOUSE_MOVE_ATTRIBUTE_NAME,
			ON_MOUSE_OUT_ATTRIBUTE_NAME, ON_MOUSE_OVER_ATTRIBUTE_NAME, ON_MOUSE_UP_ATTRIBUTE_NAME);
	
	/** The Set of all global attributes that apply to focusable elements as a whitelist */
	Set<String> GLOBAL_FOCUSABLE_ATTRIBUTE_WHITELIST = SetUtil.mergeSets(ALL_GLOBAL_ATTRIBUTE_WHITELIST,
			GLOBAL_FOCUS_EVENT_ATTRIBUTE_WHITELIST, GLOBAL_KEYBOARD_EVENT_ATTRIBUTE_WHITELIST,
			GLOBAL_MOUSE_EVENT_ATTRIBUTE_WHITELIST);
	
	/*
	 * Global Load Event Attribute Names - apply to some html tags
	 * - only to <body>, <frame>, <frameset>, <iframe>, <img>, <input type="image">, <link>, <script> and <style>
	 */
	/** onload - Specifies the script to run after the page is finished loading */
	String ON_LOAD_ATTRIBUTE_NAME = "onload";
	/** onunload - Specifies the script to run once a page has unloaded (or the browser window has been closed) */
	String ON_UNLOAD_ATTRIBUTE_NAME = "onunload";
	/** The Set of all global load event attributes */
	Set<String> GLOBAL_LOAD_EVENT_ATTRIBUTE_WHITELIST = SetUtil.createSet(ON_LOAD_ATTRIBUTE_NAME,
			ON_UNLOAD_ATTRIBUTE_NAME);
	
	/** The Set of all global attributes that apply to loadable elements as a whitelist */
	Set<String> GLOBAL_LOADABLE_ATTRIBUTE_WHITELIST = SetUtil.mergeSets(ALL_GLOBAL_ATTRIBUTE_WHITELIST,
			GLOBAL_LOAD_EVENT_ATTRIBUTE_WHITELIST);
	/** The Set of all global attributes that apply to elements that are focusable and loadable as a whitelist */
	Set<String> GLOBAL_FOCUSABLE_AND_LOADABLE_ATTRIBUTE_WHITELIST = SetUtil.mergeSets(
			GLOBAL_FOCUSABLE_ATTRIBUTE_WHITELIST, GLOBAL_LOADABLE_ATTRIBUTE_WHITELIST);
	
	/*
	 * Global Window Event Attribute Names - apply to body tag
	 */
	/** onafterprint - Specifies the script to be run after the document is printed */
	String ON_AFTER_PRINT_ATTRIBUTE_NAME = "onafterprint";
	/** onbeforeprint - Specifies the script to be run before the document is printed */
	String ON_BEFORE_PRINT_ATTRIBUTE_NAME = "onbeforeprint";
	/** onbeforeunload - Specifies the script to be run when the document is about to be unloaded */
	String ON_BEFORE_UNLOAD_ATTRIBUTE_NAME = "onbeforeunload";
	/** onhashchange - Specifies the script to be run when there has been changes to the anchor part of the URL */
	String ON_HASH_CHANGE_ATTRIBUTE_NAME = "onhashchange";
	/** onmessage - Specifies the script to be run when the message is triggered */
	String ON_MESSAGE_ATTRIBUTE_NAME = "onmessage";
	/** onoffline - Specifies the script to be run when the browser starts to work offline */
	String ON_OFFLINE_ATTRIBUTE_NAME = "onoffline";
	/** ononline - Specifies the script to be run when the browser starts to work online */
	String ON_ONLINE_ATTRIBUTE_NAME = "ononline";
	/** onpagehide - Specifies the script to be run when a user navigates away from a page */
	String ON_PAGE_HIDE_ATTRIBUTE_NAME = "onpagehide";
	/** onpageshow - Specifies the script to be run when a user navigates to a page */
	String ON_PAGE_SHOW_ATTRIBUTE_NAME = "onpageshow";
	/** onpopstate - Specifies the script to be run when the window's history changes */
	String ON_POP_STATE_ATTRIBUTE_NAME = "onpopstate";
	/** onresize - Specifies the script to run when the browser window is resized */
	String ON_RESIZE_ATTRIBUTE_NAME = "onresize";
	/** onstorage - Specifies the script to be run when a Web Storage area is updated */
	String ON_STORAGE_ATTRIBUTE_NAME = "onstorage";
	/** The Set of all global attributes for window events as a whitelist */
	Set<String> GLOBAL_WINDOW_EVENT_ATTRIBUTE_WHITELIST = SetUtil.createSet(ON_AFTER_PRINT_ATTRIBUTE_NAME,
			ON_BEFORE_PRINT_ATTRIBUTE_NAME, ON_BEFORE_UNLOAD_ATTRIBUTE_NAME, ON_HASH_CHANGE_ATTRIBUTE_NAME,
			ON_MESSAGE_ATTRIBUTE_NAME, ON_OFFLINE_ATTRIBUTE_NAME, ON_ONLINE_ATTRIBUTE_NAME,
			ON_PAGE_HIDE_ATTRIBUTE_NAME, ON_PAGE_SHOW_ATTRIBUTE_NAME, ON_POP_STATE_ATTRIBUTE_NAME,
			ON_RESIZE_ATTRIBUTE_NAME, ON_STORAGE_ATTRIBUTE_NAME);
	/** The Set of all body tag attributes as a whitelist */
	Set<String> BODY_TAG_ATTRIBUTE_WHITELIST = SetUtil.mergeSets(
			GLOBAL_FOCUSABLE_AND_LOADABLE_ATTRIBUTE_WHITELIST, GLOBAL_WINDOW_EVENT_ATTRIBUTE_WHITELIST);
	
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
	 * Global Input Event Attribute Names - apply mainly to input tag
	 */
	/*
	 * onchange
	 * oninput
	 * oninvalid
	 * onsearch
	 * onselect
	 */
	
	/*
	 * Other Attribute Names
	 */
	/** onscroll - Specifies a script to be run when an element's scrollbar is being scrolled
	 * - Supported on &lt;address>, &lt;blockquote>, &lt;body>, &lt;caption>, &lt;center>, &lt;dd>,
	 * &lt;dir>, &lt;div>, &lt;dl>, &lt;dt>, &lt;fieldset>, &lt;form>, &lt;h1> to &lt;h6>, &lt;html>,
	 * &lt;li>, &lt;menu>, &lt;object>, &lt;ol>, &lt;p>, &lt;pre>, &lt;select>, &lt;tbody>,
	 * &lt;textarea>, &lt;tfoot>, &lt;thead>, and &lt;ul> */
	String ON_SCROLL_ATTRIBUTE_NAME = "onscroll";
	/*
	 * ontoggle - used in details tag
	 */
	/*
	 * These 2 used in form tag
	 * onreset
	 * onsubmit
	 */
	
	/*
	 * Default Values
	 */
	String DEFAULT_LANG_VALUE = "en-US";
}
