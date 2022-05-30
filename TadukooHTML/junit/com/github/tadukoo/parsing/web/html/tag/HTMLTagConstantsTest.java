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
	
	@Test
	public void testALL_GLOBAL_ATTRIBUTE_WHITELIST(){
		assertEquals(SetUtil.createSet(ACCESS_KEY_ATTRIBUTE_NAME, CLASS_ATTRIBUTE_NAME,
						CONTENT_EDITABLE_ATTRIBUTE_NAME, DIR_ATTRIBUTE_NAME, DRAGGABLE_ATTRIBUTE_NAME,
						HIDDEN_ATTRIBUTE_NAME, ID_ATTRIBUTE_NAME, LANG_ATTRIBUTE_NAME, SPELLCHECK_ATTRIBUTE_NAME,
						STYLE_ATTRIBUTE_NAME, TAB_INDEX_ATTRIBUTE_NAME, TITLE_ATTRIBUTE_NAME, TRANSLATE_ATTRIBUTE_NAME,
						ON_DRAG_ATTRIBUTE_NAME, ON_DRAG_END_ATTRIBUTE_NAME, ON_DRAG_ENTER_ATTRIBUTE_NAME,
						ON_DRAG_LEAVE_ATTRIBUTE_NAME, ON_DRAG_OVER_ATTRIBUTE_NAME, ON_DRAG_START_ATTRIBUTE_NAME,
						ON_DROP_ATTRIBUTE_NAME,
						ON_COPY_ATTRIBUTE_NAME, ON_CUT_ATTRIBUTE_NAME, ON_PASTE_ATTRIBUTE_NAME),
				ALL_GLOBAL_ATTRIBUTE_WHITELIST);
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
