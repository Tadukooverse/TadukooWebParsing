package com.github.tadukoo.parsing.web.html.tag;

import com.github.tadukoo.util.SetUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HTMLTagConstantsTest implements HTMLTagConstants{
	
	/*
	 * Basic Tag Names
	 */
	
	@Test
	public void testHTML_ROOT_TAG_NAME(){
		assertEquals("html", HTML_ROOT_TAG_NAME);
	}
	
	@Test
	public void testHTML_HEAD_TAG_NAME(){
		assertEquals("head", HTML_HEAD_TAG_NAME);
	}
	
	@Test
	public void testHTML_BODY_TAG_NAME(){
		assertEquals("body", HTML_BODY_TAG_NAME);
	}
	
	/*
	 * Head Tag Names
	 */
	
	@Test
	public void testHTML_TITLE_TAG_NAME(){
		assertEquals("title", HTML_TITLE_TAG_NAME);
	}
	
	@Test
	public void testHTML_STYLE_TAG_NAME(){
		assertEquals("style", HTML_STYLE_TAG_NAME);
	}
	
	@Test
	public void testHTML_BASE_TAG_NAME(){
		assertEquals("base", HTML_BASE_TAG_NAME);
	}
	
	@Test
	public void testHTML_LINK_TAG_NAME(){
		assertEquals("link", HTML_LINK_TAG_NAME);
	}
	
	@Test
	public void testHTML_META_TAG_NAME(){
		assertEquals("meta", HTML_META_TAG_NAME);
	}
	
	@Test
	public void testHTML_SCRIPT_TAG_NAME(){
		assertEquals("script", HTML_SCRIPT_TAG_NAME);
	}
	
	@Test
	public void testHTML_NOSCRIPT_TAG_NAME(){
		assertEquals("noscript", HTML_NOSCRIPT_TAG_NAME);
	}
	
	@Test
	public void testVALID_HTML_HEAD_SUB_TAGS(){
		assertEquals(SetUtil.createSet(HTML_TITLE_TAG_NAME, HTML_STYLE_TAG_NAME,
				HTML_BASE_TAG_NAME, HTML_LINK_TAG_NAME, HTML_META_TAG_NAME,
				HTML_SCRIPT_TAG_NAME, HTML_NOSCRIPT_TAG_NAME), VALID_HTML_HEAD_SUB_TAGS);
	}
	
	/*
	 * Body Tag Names
	 */
	
	@Test
	public void testHTML_HEADING_1_TAG_NAME(){
		assertEquals("h1", HTML_HEADING_1_TAG_NAME);
	}
	
	@Test
	public void testHTML_HEADING_2_TAG_NAME(){
		assertEquals("h2", HTML_HEADING_2_TAG_NAME);
	}
	
	@Test
	public void testHTML_HEADING_3_TAG_NAME(){
		assertEquals("h3", HTML_HEADING_3_TAG_NAME);
	}
	
	@Test
	public void testHTML_HEADING_4_TAG_NAME(){
		assertEquals("h4", HTML_HEADING_4_TAG_NAME);
	}
	
	@Test
	public void testHTML_HEADING_5_TAG_NAME(){
		assertEquals("h5", HTML_HEADING_5_TAG_NAME);
	}
	
	@Test
	public void testHTML_HEADING_6_TAG_NAME(){
		assertEquals("h6", HTML_HEADING_6_TAG_NAME);
	}
	
	@Test
	public void testHTML_PARAGRAPH_TAG_NAME(){
		assertEquals("p", HTML_PARAGRAPH_TAG_NAME);
	}
	
	@Test
	public void testHTML_IMAGE_TAG_NAME(){
		assertEquals("img", HTML_IMAGE_TAG_NAME);
	}
	
	@Test
	public void testHTML_HYPERLINK_TAG_NAME(){
		assertEquals("a", HTML_HYPERLINK_TAG_NAME);
	}
	
	@Test
	public void testHTML_TABLE_TAG_NAME(){
		assertEquals("table", HTML_TABLE_TAG_NAME);
	}
	
	@Test
	public void testHTML_UNORDERED_LIST_TAG_NAME(){
		assertEquals("ul", HTML_UNORDERED_LIST_TAG_NAME);
	}
	
	@Test
	public void testHTML_ORDERED_LIST_TAG_NAME(){
		assertEquals("ol", HTML_ORDERED_LIST_TAG_NAME);
	}
	
	@Test
	public void testVALID_HTML_BODY_SUB_TAGS(){
		assertEquals(SetUtil.createSet(HTML_HEADING_1_TAG_NAME, HTML_HEADING_2_TAG_NAME,
				HTML_HEADING_3_TAG_NAME, HTML_HEADING_4_TAG_NAME, HTML_HEADING_5_TAG_NAME, HTML_HEADING_6_TAG_NAME,
				HTML_PARAGRAPH_TAG_NAME, HTML_IMAGE_TAG_NAME, HTML_HYPERLINK_TAG_NAME, HTML_TABLE_TAG_NAME,
				HTML_UNORDERED_LIST_TAG_NAME, HTML_ORDERED_LIST_TAG_NAME), VALID_HTML_BODY_SUB_TAGS);
	}
	
	/*
	 * Special Names
	 */
	
	@Test
	public void testHTML_CONTENT_NAME(){
		assertEquals("{CONTENT}", HTML_CONTENT_NAME);
	}
	
	/*
	 * Global Attribute Names
	 */
	
	@Test
	public void testACCESS_KEY_ATTRIBUTE_NAME(){
		assertEquals("accesskey", ACCESS_KEY_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testCLASS_ATTRIBUTE_NAME(){
		assertEquals("class", CLASS_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testCONTENT_EDITABLE_ATTRIBUTE_NAME(){
		assertEquals("contenteditable", CONTENT_EDITABLE_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testDATA_ATTRIBUTE_NAME_PREFIX(){
		assertEquals("data-", DATA_ATTRIBUTE_NAME_PREFIX);
	}
	
	@Test
	public void testDIR_ATTRIBUTE_NAME(){
		assertEquals("dir", DIR_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testDRAGGABLE_ATTRIBUTE_NAME(){
		assertEquals("draggable", DRAGGABLE_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testHIDDEN_ATTRIBUTE_NAME(){
		assertEquals("hidden", HIDDEN_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testID_ATTRIBUTE_NAME(){
		assertEquals("id", ID_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testLANG_ATTRIBUTE_NAME(){
		assertEquals("lang", LANG_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testSPELLCHECK_ATTRIBUTE_NAME(){
		assertEquals("spellcheck", SPELLCHECK_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testSTYLE_ATTRIBUTE_NAME(){
		assertEquals("style", STYLE_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testTAB_INDEX_ATTRIBUTE_NAME(){
		assertEquals("tabindex", TAB_INDEX_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testTITLE_ATTRIBUTE_NAME(){
		assertEquals("title", TITLE_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testTRANSLATE_ATTRIBUTE_NAME(){
		assertEquals("translate", TRANSLATE_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testGLOBAL_ATTRIBUTE_WHITELIST(){
		assertEquals(SetUtil.createSet(ACCESS_KEY_ATTRIBUTE_NAME, CLASS_ATTRIBUTE_NAME,
						CONTENT_EDITABLE_ATTRIBUTE_NAME, DIR_ATTRIBUTE_NAME, DRAGGABLE_ATTRIBUTE_NAME, HIDDEN_ATTRIBUTE_NAME,
						ID_ATTRIBUTE_NAME, LANG_ATTRIBUTE_NAME, SPELLCHECK_ATTRIBUTE_NAME, STYLE_ATTRIBUTE_NAME,
						TAB_INDEX_ATTRIBUTE_NAME, TITLE_ATTRIBUTE_NAME, TRANSLATE_ATTRIBUTE_NAME),
				GLOBAL_ATTRIBUTE_WHITELIST);
	}
	
	/*
	 * Global Drag Event Attribute Names
	 */
	
	@Test
	public void testON_DRAG_ATTRIBUTE_NAME(){
		assertEquals("ondrag", ON_DRAG_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testON_DRAG_END_ATTRIBUTE_NAME(){
		assertEquals("ondragend", ON_DRAG_END_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testON_DRAG_ENTER_ATTRIBUTE_NAME(){
		assertEquals("ondragenter", ON_DRAG_ENTER_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testON_DRAG_LEAVE_ATTRIBUTE_NAME(){
		assertEquals("ondragleave", ON_DRAG_LEAVE_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testON_DRAG_OVER_ATTRIBUTE_NAME(){
		assertEquals("ondragover", ON_DRAG_OVER_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testON_DRAG_START_ATTRIBUTE_NAME(){
		assertEquals("ondragstart", ON_DRAG_START_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testON_DROP_ATTRIBUTE_NAME(){
		assertEquals("ondrop", ON_DROP_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testGLOBAL_DRAG_EVENT_ATTRIBUTE_WHITELIST(){
		assertEquals(SetUtil.createSet(ON_DRAG_ATTRIBUTE_NAME,
						ON_DRAG_END_ATTRIBUTE_NAME, ON_DRAG_ENTER_ATTRIBUTE_NAME, ON_DRAG_LEAVE_ATTRIBUTE_NAME,
						ON_DRAG_OVER_ATTRIBUTE_NAME, ON_DRAG_START_ATTRIBUTE_NAME, ON_DROP_ATTRIBUTE_NAME),
				GLOBAL_DRAG_EVENT_ATTRIBUTE_WHITELIST);
	}
	
	/*
	 * Global Clipboard Event Attributes
	 */
	
	@Test
	public void testON_COPY_ATTRIBUTE_NAME(){
		assertEquals("oncopy", ON_COPY_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testON_CUT_ATTRIBUTE_NAME(){
		assertEquals("oncut", ON_CUT_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testON_PASTE_ATTRIBUTE_NAME(){
		assertEquals("onpaste", ON_PASTE_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testGLOBAL_CLIPBOARD_EVENT_ATTRIBUTE_WHITELIST(){
		assertEquals(SetUtil.createSet(ON_COPY_ATTRIBUTE_NAME, ON_CUT_ATTRIBUTE_NAME, ON_PASTE_ATTRIBUTE_NAME),
				GLOBAL_CLIPBOARD_EVENT_ATTRIBUTE_WHITELIST);
	}
	
	/*
	 * Other Global Event Attributes
	 */
	
	@Test
	public void testON_CONTEXT_MENU_ATTRIBUTE_NAME(){
		assertEquals("oncontextmenu", ON_CONTEXT_MENU_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testON_WHEEL_ATTRIBUTE_NAME(){
		assertEquals("onwheel", ON_WHEEL_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testOTHER_GLOBAL_EVENT_ATTRIBUTE_WHITELIST(){
		assertEquals(SetUtil.createSet(ON_CONTEXT_MENU_ATTRIBUTE_NAME, ON_WHEEL_ATTRIBUTE_NAME), OTHER_GLOBAL_EVENT_ATTRIBUTE_WHITELIST);
	}
	
	@Test
	public void testALL_GLOBAL_ATTRIBUTE_WHITELIST(){
		assertEquals(SetUtil.mergeSets(GLOBAL_ATTRIBUTE_WHITELIST, GLOBAL_DRAG_EVENT_ATTRIBUTE_WHITELIST,
						GLOBAL_CLIPBOARD_EVENT_ATTRIBUTE_WHITELIST, OTHER_GLOBAL_EVENT_ATTRIBUTE_WHITELIST),
				ALL_GLOBAL_ATTRIBUTE_WHITELIST);
	}
	
	/*
	 * Global Focus Event Attributes
	 */
	
	@Test
	public void testON_BLUR_ATTRIBUTE_NAME(){
		assertEquals("onblur", ON_BLUR_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testON_FOCUS_ATTRIBUTE_NAME(){
		assertEquals("onfocus", ON_FOCUS_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testGLOBAL_FOCUS_ATTRIBUTE_WHITELIST(){
		assertEquals(SetUtil.createSet(ON_BLUR_ATTRIBUTE_NAME, ON_FOCUS_ATTRIBUTE_NAME),
				GLOBAL_FOCUS_EVENT_ATTRIBUTE_WHITELIST);
	}
	
	/*
	 * Global Keyboard Event Attributes
	 */
	
	@Test
	public void testON_KEY_DOWN_ATTRIBUTE_NAME(){
		assertEquals("onkeydown", ON_KEY_DOWN_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testON_KEY_PRESS_ATTRIBUTE_NAME(){
		assertEquals("onkeypress", ON_KEY_PRESS_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testON_KEY_UP_ATTRIBUTE_NAME(){
		assertEquals("onkeyup", ON_KEY_UP_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testGLOBAL_KEYBOARD_EVENT_ATTRIBUTE_WHITELIST(){
		assertEquals(SetUtil.createSet(ON_KEY_DOWN_ATTRIBUTE_NAME, ON_KEY_PRESS_ATTRIBUTE_NAME,
				ON_KEY_UP_ATTRIBUTE_NAME), GLOBAL_KEYBOARD_EVENT_ATTRIBUTE_WHITELIST);
	}
	
	/*
	 * Global Mouse Event Attributes
	 */
	
	@Test
	public void testON_CLICK_ATTRIBUTE_NAME(){
		assertEquals("onclick", ON_CLICK_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testON_DBL_CLICK_ATTRIBUTE_NAME(){
		assertEquals("ondblclick", ON_DBL_CLICK_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testON_MOUSE_DOWN_ATTRIBUTE_NAME(){
		assertEquals("onmousedown", ON_MOUSE_DOWN_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testON_MOUSE_MOVE_ATTRIBUTE_NAME(){
		assertEquals("onmousemove", ON_MOUSE_MOVE_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testON_MOUSE_OUT_ATTRIBUTE_NAME(){
		assertEquals("onmouseout", ON_MOUSE_OUT_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testON_MOUSE_OVER_ATTRIBUTE_NAME(){
		assertEquals("onmouseover", ON_MOUSE_OVER_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testON_MOUSE_UP_ATTRIBUTE_NAME(){
		assertEquals("onmouseup", ON_MOUSE_UP_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testGLOBAL_MOUSE_EVENT_ATTRIBUTE_WHITELIST(){
		assertEquals(SetUtil.createSet(ON_CLICK_ATTRIBUTE_NAME, ON_DBL_CLICK_ATTRIBUTE_NAME,
				ON_MOUSE_DOWN_ATTRIBUTE_NAME, ON_MOUSE_MOVE_ATTRIBUTE_NAME, ON_MOUSE_OUT_ATTRIBUTE_NAME,
				ON_MOUSE_OVER_ATTRIBUTE_NAME, ON_MOUSE_UP_ATTRIBUTE_NAME), GLOBAL_MOUSE_EVENT_ATTRIBUTE_WHITELIST);
	}
	
	@Test
	public void testGLOBAL_FOCUSABLE_ATTRIBUTE_WHITELIST(){
		assertEquals(SetUtil.mergeSets(ALL_GLOBAL_ATTRIBUTE_WHITELIST, GLOBAL_FOCUS_EVENT_ATTRIBUTE_WHITELIST,
				GLOBAL_KEYBOARD_EVENT_ATTRIBUTE_WHITELIST, GLOBAL_MOUSE_EVENT_ATTRIBUTE_WHITELIST),
				GLOBAL_FOCUSABLE_ATTRIBUTE_WHITELIST);
	}
	
	/*
	 * Global Load Event Attributes
	 */
	
	@Test
	public void testON_LOAD_ATTRIBUTE_NAME(){
		assertEquals("onload", ON_LOAD_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testON_UNLOAD_ATTRIBUTE_NAME(){
		assertEquals("onunload", ON_UNLOAD_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testGLOBAL_LOAD_EVENT_ATTRIBUTE_WHITELIST(){
		assertEquals(SetUtil.createSet(ON_LOAD_ATTRIBUTE_NAME, ON_UNLOAD_ATTRIBUTE_NAME),
				GLOBAL_LOAD_EVENT_ATTRIBUTE_WHITELIST);
	}
	
	@Test
	public void testGLOBAL_LOADABLE_ATTRIBUTE_WHITELIST(){
		assertEquals(SetUtil.mergeSets(ALL_GLOBAL_ATTRIBUTE_WHITELIST, GLOBAL_LOAD_EVENT_ATTRIBUTE_WHITELIST),
				GLOBAL_LOADABLE_ATTRIBUTE_WHITELIST);
	}
	
	@Test
	public void testGLOBAL_FOCUSABLE_AND_LOADABLE_ATTRIBUTE_WHITELIST(){
		assertEquals(SetUtil.mergeSets(GLOBAL_FOCUSABLE_ATTRIBUTE_WHITELIST, GLOBAL_LOADABLE_ATTRIBUTE_WHITELIST),
				GLOBAL_FOCUSABLE_AND_LOADABLE_ATTRIBUTE_WHITELIST);
	}
	
	/*
	 * Global Window Event Attribute Names
	 */
	
	@Test
	public void testON_AFTER_PRINT_ATTRIBUTE_NAME(){
		assertEquals("onafterprint", ON_AFTER_PRINT_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testON_BEFORE_PRINT_ATTRIBUTE_NAME(){
		assertEquals("onbeforeprint", ON_BEFORE_PRINT_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testON_BEFORE_UNLOAD_ATTRIBUTE_NAME(){
		assertEquals("onbeforeunload", ON_BEFORE_UNLOAD_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testON_HASH_CHANGE_ATTRIBUTE_NAME(){
		assertEquals("onhashchange", ON_HASH_CHANGE_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testON_MESSAGE_ATTRIBUTE_NAME(){
		assertEquals("onmessage", ON_MESSAGE_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testON_OFFLINE_ATTRIBUTE_NAME(){
		assertEquals("onoffline", ON_OFFLINE_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testON_ONLINE_ATTRIBUTE_NAME(){
		assertEquals("ononline", ON_ONLINE_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testON_PAGE_HIDE_ATTRIBUTE_NAME(){
		assertEquals("onpagehide", ON_PAGE_HIDE_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testON_PAGE_SHOW_ATTRIBUTE_NAME(){
		assertEquals("onpageshow", ON_PAGE_SHOW_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testON_POP_STATE_ATTRIBUTE_NAME(){
		assertEquals("onpopstate", ON_POP_STATE_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testON_RESIZE_ATTRIBUTE_NAME(){
		assertEquals("onresize", ON_RESIZE_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testON_STORAGE_ATTRIBUTE_NAME(){
		assertEquals("onstorage", ON_STORAGE_ATTRIBUTE_NAME);
	}
	
	@Test
	public void testGLOBAL_WINDOW_EVENT_ATTRIBUTE_WHITELIST(){
		assertEquals(SetUtil.createSet(ON_AFTER_PRINT_ATTRIBUTE_NAME,
				ON_BEFORE_PRINT_ATTRIBUTE_NAME, ON_BEFORE_UNLOAD_ATTRIBUTE_NAME, ON_HASH_CHANGE_ATTRIBUTE_NAME,
				ON_MESSAGE_ATTRIBUTE_NAME, ON_OFFLINE_ATTRIBUTE_NAME, ON_ONLINE_ATTRIBUTE_NAME,
				ON_PAGE_HIDE_ATTRIBUTE_NAME, ON_PAGE_SHOW_ATTRIBUTE_NAME, ON_POP_STATE_ATTRIBUTE_NAME,
				ON_RESIZE_ATTRIBUTE_NAME, ON_STORAGE_ATTRIBUTE_NAME), GLOBAL_WINDOW_EVENT_ATTRIBUTE_WHITELIST);
	}
	
	@Test
	public void testBODY_TAG_ATTRIBUTE_WHITELIST(){
		assertEquals(SetUtil.mergeSets(GLOBAL_FOCUSABLE_AND_LOADABLE_ATTRIBUTE_WHITELIST,
				GLOBAL_WINDOW_EVENT_ATTRIBUTE_WHITELIST), BODY_TAG_ATTRIBUTE_WHITELIST);
	}
	
	/*
	 * Other Attributes
	 */
	
	@Test
	public void test_ON_SCROLL_ATTRIBUTE_NAME(){
		assertEquals("onscroll", ON_SCROLL_ATTRIBUTE_NAME);
	}
	
	/*
	 * Default Values
	 */
	
	@Test
	public void testDEFAULT_LANG_VALUE(){
		assertEquals("en-US", DEFAULT_LANG_VALUE);
	}
}
