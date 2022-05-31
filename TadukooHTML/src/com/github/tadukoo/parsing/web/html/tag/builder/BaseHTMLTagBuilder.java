package com.github.tadukoo.parsing.web.html.tag.builder;

import com.github.tadukoo.parsing.web.html.tag.HTMLTag;
import com.github.tadukoo.parsing.web.html.tag.HTMLTagConstants;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * A base class to be used for building {@link HTMLTag HTMLTags}. It contains methods for specifying
 * attributes, including methods for the global attributes in HTML.
 *
 * It provides methods for the following global attributes, along with a few methods for custom attributes.
 * Note that there are no default or required attributes
 * <table>
 *     <caption>HTML Attribute Options</caption>
 *     <tr>
 *         <th>Attribute Name</th>
 *         <th>Description</th>
 *     </tr>
 *     <tr>
 *         <td>{@link #ACCESS_KEY_ATTRIBUTE_NAME accesskey}</td>
 *         <td>Specifies a shortcut key to activate/focus an element</td>
 *     </tr>
 *     <tr>
 *         <td>{@link #CLASS_ATTRIBUTE_NAME class}</td>
 *         <td>Specifies one or more classnames for an element (refers to a class in a style sheet)</td>
 *     </tr>
 *     <tr>
 *         <td>{@link #CONTENT_EDITABLE_ATTRIBUTE_NAME contenteditable}</td>
 *         <td>Specifies whether the content of an element is editable or not</td>
 *     </tr>
 *     <tr>
 *         <td>{@link #DATA_ATTRIBUTE_NAME_PREFIX data}</td>
 *         <td>Used to store custom data private to the page or application</td>
 *     </tr>
 *     <tr>
 *         <td>{@link #DIR_ATTRIBUTE_NAME dir}</td>
 *         <td>Specifies the text direction for the content in an element</td>
 *     </tr>
 *     <tr>
 *         <td>{@link #DRAGGABLE_ATTRIBUTE_NAME draggable}</td>
 *         <td>Specifies whether an element is draggable or not</td>
 *     </tr>
 *     <tr>
 *         <td>{@link #HIDDEN_ATTRIBUTE_NAME hidden}</td>
 *         <td>Specifies that an element is not yet, or is no longer, relevant</td>
 *     </tr>
 *     <tr>
 *         <td>{@link #ID_ATTRIBUTE_NAME id}</td>
 *         <td>Specifies a unique id for an element</td>
 *     </tr>
 *     <tr>
 *         <td>{@link #LANG_ATTRIBUTE_NAME lang}</td>
 *         <td>Specifies the language of the element's content</td>
 *     </tr>
 *     <tr>
 *         <td>{@link #SPELLCHECK_ATTRIBUTE_NAME spellcheck}</td>
 *         <td>Specifies whether the element is to have its spelling and grammar checked or not</td>
 *     </tr>
 *     <tr>
 *         <td>{@link #STYLE_ATTRIBUTE_NAME style}</td>
 *         <td>Specifies an inline CSS style for an element</td>
 *     </tr>
 *     <tr>
 *         <td>{@link #TAB_INDEX_ATTRIBUTE_NAME tabindex}</td>
 *         <td>Specifies the tabbing order of an element</td>
 *     </tr>
 *     <tr>
 *         <td>{@link #TITLE_ATTRIBUTE_NAME title}</td>
 *         <td>Specifies extra information about an element</td>
 *     </tr>
 *     <tr>
 *         <td>{@link #TRANSLATE_ATTRIBUTE_NAME translate}</td>
 *         <td>Specifies whether the content of an element should be translated or not</td>
 *     </tr>
 * </table>
 * This also then provides the global drag event attributes as well:
 * <table>
 *     <caption>Global Drag Event Attributes</caption>
 *     <tr>
 *         <th>Attribute Name</th>
 *         <th>Description</th>
 *     </tr>
 *     <tr>
 *         <td>{@link #ON_DRAG_ATTRIBUTE_NAME ondrag}</td>
 *         <td>Specifies a script to be run when an element is dragged</td>
 *     </tr>
 *     <tr>
 *         <td>{@link #ON_DRAG_END_ATTRIBUTE_NAME ondragend}</td>
 *         <td>Specifies a script to be run at the end of a drag operation</td>
 *     </tr>
 *     <tr>
 *         <td>{@link #ON_DRAG_ENTER_ATTRIBUTE_NAME ondragenter}</td>
 *         <td>Specifies a script to be run when an element has been dragged to a valid drop target</td>
 *     </tr>
 *     <tr>
 *         <td>{@link #ON_DRAG_LEAVE_ATTRIBUTE_NAME ondragleave}</td>
 *         <td>Specifies a script to be run when an element leaves a valid drop target</td>
 *     </tr>
 *     <tr>
 *         <td>{@link #ON_DRAG_OVER_ATTRIBUTE_NAME ondragover}</td>
 *         <td>Specifies a script to be run when an element is being dragged over a valid drop target</td>
 *     </tr>
 *     <tr>
 *         <td>{@link #ON_DRAG_START_ATTRIBUTE_NAME ondragstart}</td>
 *         <td>Specifies a script to be run at the start of a drag operation</td>
 *     </tr>
 *     <tr>
 *         <td>{@link #ON_DROP_ATTRIBUTE_NAME ondrop}</td>
 *         <td>Specifies a script to be run when dragged element is being dropped</td>
 *     </tr>
 *     <tr>
 *         <td>{@link #ON_SCROLL_ATTRIBUTE_NAME onscroll}</td>
 *         <td>Specifies a script to be run when an element's scrollbar is being scrolled</td>
 *     </tr>
 * </table>
 *
 * @author Logan Ferree (Tadukoo)
 * @version Alpha v.0.1
 */
public abstract class BaseHTMLTagBuilder implements HTMLTagConstants{
	/** The List of attributes in the {@link HTMLTag} */
	protected Map<String, String> attributes = new HashMap<>();
	/** The Set of valid attributes in the {@link HTMLTag} */
	protected Set<String> attributeWhitelist = new HashSet<>();
	/** The Set of valid tags under the {@link HTMLTag} */
	protected Set<String> subTagWhitelist = new HashSet<>();
	/** The Set of invalid tags under the {@link HTMLTag} */
	protected Set<String> subTagBlacklist = new HashSet<>();
	
	/** Not allowed to instantiate outside here and extensions */
	protected BaseHTMLTagBuilder(){
		attributeWhitelist.addAll(ALL_GLOBAL_ATTRIBUTE_WHITELIST);
	}
	
	/*
	 * Global Attributes
	 */
	
	/**
	 * Specifies the value for the {@link #ACCESS_KEY_ATTRIBUTE_NAME accesskey attribute},
	 * which specifies a shortcut key to activate/focus an element
	 *
	 * @param value The value for the {@code accesskey} attribute for the {@link HTMLTag}
	 * @return this, to continue building
	 */
	public BaseHTMLTagBuilder accesskey(String value){
		attributes.put(ACCESS_KEY_ATTRIBUTE_NAME, value);
		return this;
	}
	
	/**
	 * Specifies the value for the {@link #CLASS_ATTRIBUTE_NAME class attribute},
	 * which specifies one or more classnames for an element (refers to a class in a style sheet)
	 *
	 * @param value The value for the {@code class} attribute for the {@link HTMLTag}
	 * @return this, to continue building
	 */
	public BaseHTMLTagBuilder classAttribute(String value){
		attributes.put(CLASS_ATTRIBUTE_NAME, value);
		return this;
	}
	
	/**
	 * Specifies the value for the {@link #CONTENT_EDITABLE_ATTRIBUTE_NAME contenteditable attribute},
	 * which specifies whether the content of an element is editable or not
	 *
	 * @param value The value for the {@code contenteditable} attribute for the {@link HTMLTag}
	 * @return this, to continue building
	 */
	public BaseHTMLTagBuilder contenteditable(String value){
		attributes.put(CONTENT_EDITABLE_ATTRIBUTE_NAME, value);
		return this;
	}
	
	/**
	 * Specifies a {@link #DATA_ATTRIBUTE_NAME_PREFIX data attribute},
	 * which is used to store custom data private to the page or application
	 *
	 * @param dataTagName The rest of the tag name (to add to {@code data-} to form the full attribute name)
	 * @param value The value for the {@code data} attribute for the {@link HTMLTag}
	 * @return this, to continue building
	 */
	public BaseHTMLTagBuilder data(String dataTagName, String value){
		attributes.put(DATA_ATTRIBUTE_NAME_PREFIX + dataTagName, value);
		return this;
	}
	
	/**
	 * Specifies a {@link #DIR_ATTRIBUTE_NAME dir attribute},
	 * which specifies the text direction for the content in an element
	 *
	 * @param value The value for the {@code dir} attribute for the {@link HTMLTag}
	 * @return this, to continue building
	 */
	public BaseHTMLTagBuilder dir(String value){
		attributes.put(DIR_ATTRIBUTE_NAME, value);
		return this;
	}
	
	/**
	 * Specifies a {@link #DRAGGABLE_ATTRIBUTE_NAME draggable attribute},
	 * which specifies whether an element is draggable or not
	 *
	 * @param value The value for the {@code draggable} attribute for the {@link HTMLTag}
	 * @return this, to continue building
	 */
	public BaseHTMLTagBuilder draggable(String value){
		attributes.put(DRAGGABLE_ATTRIBUTE_NAME, value);
		return this;
	}
	
	/**
	 * Specifies a {@link #HIDDEN_ATTRIBUTE_NAME hidden attribute},
	 * which specifies that an element is not yet, or is no longer, relevant
	 *
	 * @return this, to continue building
	 */
	public BaseHTMLTagBuilder hidden(){
		attributes.put(HIDDEN_ATTRIBUTE_NAME, null);
		return this;
	}
	
	/**
	 * Specifies a {@link #ID_ATTRIBUTE_NAME id attribute},
	 * which specifies a unique id for an element
	 *
	 * @param value The value for the {@code id} attribute for the {@link HTMLTag}
	 * @return this, to continue building
	 */
	public BaseHTMLTagBuilder id(String value){
		attributes.put(ID_ATTRIBUTE_NAME, value);
		return this;
	}
	
	/**
	 * Specifies a {@link #LANG_ATTRIBUTE_NAME lang attribute},
	 * which specifies the language of the element's content
	 *
	 * @param value The value of the {@code lang} attribute for the {@link HTMLTag}
	 * @return this, to continue building
	 */
	public BaseHTMLTagBuilder lang(String value){
		attributes.put(LANG_ATTRIBUTE_NAME, value);
		return this;
	}
	
	/**
	 * Specifies a {@link #SPELLCHECK_ATTRIBUTE_NAME spellcheck attribute},
	 * which specifies whether the element is to have its spelling and grammar checked or not
	 *
	 * @param value The value of the {@code spellcheck} attribute for the {@link HTMLTag}
	 * @return this, to continue building
	 */
	public BaseHTMLTagBuilder spellcheck(String value){
		attributes.put(SPELLCHECK_ATTRIBUTE_NAME, value);
		return this;
	}
	
	/**
	 * Specifies a {@link #STYLE_ATTRIBUTE_NAME style attribute},
	 * which specifies an inline CSS style for an element
	 *
	 * @param value The value of the {@code style} attribute for the {@link HTMLTag}
	 * @return this, to continue building
	 */
	public BaseHTMLTagBuilder style(String value){
		attributes.put(STYLE_ATTRIBUTE_NAME, value);
		return this;
	}
	
	/**
	 * Specifies a {@link #TAB_INDEX_ATTRIBUTE_NAME tabindex attribute},
	 * which specifies the tabbing order of an element
	 *
	 * @param value The value of the {@code tabindex} attribute for the {@link HTMLTag}
	 * @return this, to continue building
	 */
	public BaseHTMLTagBuilder tabindex(String value){
		attributes.put(TAB_INDEX_ATTRIBUTE_NAME, value);
		return this;
	}
	
	/**
	 * Specifies a {@link #TITLE_ATTRIBUTE_NAME title attribute},
	 * which specifies extra information about an element
	 *
	 * @param value The value of the {@code title} attribute for the {@link HTMLTag}
	 * @return this, to continue building
	 */
	public BaseHTMLTagBuilder title(String value){
		attributes.put(TITLE_ATTRIBUTE_NAME, value);
		return this;
	}
	
	/**
	 * Specifies a {@link #TRANSLATE_ATTRIBUTE_NAME translate attribute},
	 * which specifies whether the content of an element should be translated or not
	 *
	 * @param value The value of the {@code translate} attribute for the {@link HTMLTag}
	 * @return this, to continue building
	 */
	public BaseHTMLTagBuilder translate(String value){
		attributes.put(TRANSLATE_ATTRIBUTE_NAME, value);
		return this;
	}
	
	/*
	 * Global Drag Event Attributes
	 */
	
	/**
	 * Specifies a {@link #ON_DRAG_ATTRIBUTE_NAME ondrag attribute},
	 * which specifies a script to be run when an element is dragged
	 *
	 * @param value The value of the {@code ondrag} attribute for the {@link HTMLTag}
	 * @return this, to continue building
	 */
	public BaseHTMLTagBuilder ondrag(String value){
		attributes.put(ON_DRAG_ATTRIBUTE_NAME, value);
		return this;
	}
	
	/**
	 * Specifies a {@link #ON_DRAG_END_ATTRIBUTE_NAME ondragend attribute},
	 * which specifies a script to be run at the end of a drag operation
	 *
	 * @param value The value of the {@code ondragend} attribute for the {@link HTMLTag}
	 * @return this, to continue building
	 */
	public BaseHTMLTagBuilder ondragend(String value){
		attributes.put(ON_DRAG_END_ATTRIBUTE_NAME, value);
		return this;
	}
	
	/**
	 * Specifies a {@link #ON_DRAG_ENTER_ATTRIBUTE_NAME ondragenter attribute},
	 * which specifies a script to be run when an element has been dragged to a valid drop target
	 *
	 * @param value The value of the {@code ondragenter} attribute for the {@link HTMLTag}
	 * @return this, to continue building
	 */
	public BaseHTMLTagBuilder ondragenter(String value){
		attributes.put(ON_DRAG_ENTER_ATTRIBUTE_NAME, value);
		return this;
	}
	
	/**
	 * Specifies a {@link #ON_DRAG_LEAVE_ATTRIBUTE_NAME ondragleave attribute},
	 * which specifies a script to be run when an element leaves a valid drop target
	 *
	 * @param value The value of the {@code ondragleave} attribute for the {@link HTMLTag}
	 * @return this, to continue building
	 */
	public BaseHTMLTagBuilder ondragleave(String value){
		attributes.put(ON_DRAG_LEAVE_ATTRIBUTE_NAME, value);
		return this;
	}
	
	/**
	 * Specifies a {@link #ON_DRAG_OVER_ATTRIBUTE_NAME ondragover attribute},
	 * which specifies a script to be run when an element is being dragged over a valid drop target
	 *
	 * @param value The value of the {@code ondragover} attribute for the {@link HTMLTag}
	 * @return this, to continue building
	 */
	public BaseHTMLTagBuilder ondragover(String value){
		attributes.put(ON_DRAG_OVER_ATTRIBUTE_NAME, value);
		return this;
	}
	
	/**
	 * Specifies a {@link #ON_DRAG_START_ATTRIBUTE_NAME ondragstart attribute},
	 * which specifies a script to be run at the start of a drag operation
	 *
	 * @param value The value of the {@code ondragstart} attribute for the {@link HTMLTag}
	 * @return this, to continue building
	 */
	public BaseHTMLTagBuilder ondragstart(String value){
		attributes.put(ON_DRAG_START_ATTRIBUTE_NAME, value);
		return this;
	}
	
	/**
	 * Specifies a {@link #ON_DROP_ATTRIBUTE_NAME ondrop attribute},
	 * which specifies a script to be run when dragged element is being dropped
	 *
	 * @param value The value of the {@code ondrop} attribute for the {@link HTMLTag}
	 * @return this, to continue building
	 */
	public BaseHTMLTagBuilder ondrop(String value){
		attributes.put(ON_DROP_ATTRIBUTE_NAME, value);
		return this;
	}
	
	/*
	 * Global Clipboard Attributes
	 */
	
	/**
	 * Specifies a {@link #ON_COPY_ATTRIBUTE_NAME oncopy attribute},
	 * which specifies a script to be run when the user copies the content of an element
	 *
	 * @param value The value of the {@code oncopy} attribute for the {@link HTMLTag}
	 * @return this, to continue building
	 */
	public BaseHTMLTagBuilder oncopy(String value){
		attributes.put(ON_COPY_ATTRIBUTE_NAME, value);
		return this;
	}
	
	/**
	 * Specifies a {@link #ON_CUT_ATTRIBUTE_NAME oncut attribute},
	 * which specifies a script to be run when the user cuts the content of an element
	 *
	 * @param value The value of the {@code oncut} attribute for the {@link HTMLTag}
	 * @return this, to continue building
	 */
	public BaseHTMLTagBuilder oncut(String value){
		attributes.put(ON_CUT_ATTRIBUTE_NAME, value);
		return this;
	}
	
	/**
	 * Specifies a {@link #ON_PASTE_ATTRIBUTE_NAME onpaste attribute},
	 * which specifies a script to be run when the user pastes some content in an element
	 *
	 * @param value The value of the {@code onpaste} attribute for the {@link HTMLTag}
	 * @return this, to continue building
	 */
	public BaseHTMLTagBuilder onpaste(String value){
		attributes.put(ON_PASTE_ATTRIBUTE_NAME, value);
		return this;
	}
	
	/*
	 * Other Global Event Attributes
	 */
	
	/**
	 * Specifies a {@link #ON_CONTEXT_MENU_ATTRIBUTE_NAME oncontextmenu attribute},
	 * which specifies a script to be run when the context menu is triggered
	 *
	 * @param value The value of the {@code oncontextmenu} attribute for the {@link HTMLTag}
	 * @return this, to continue building
	 */
	public BaseHTMLTagBuilder oncontextmenu(String value){
		attributes.put(ON_CONTEXT_MENU_ATTRIBUTE_NAME, value);
		return this;
	}
	
	/**
	 * Specifies a {@link #ON_WHEEL_ATTRIBUTE_NAME onwheel attribute},
	 * which specifies a script to be run when the mouse wheel rolls up or down over an element
	 *
	 * @param value The value of the {@code onwheel} attribute for the {@link HTMLTag}
	 * @return this, to continue building
	 */
	public BaseHTMLTagBuilder onwheel(String value){
		attributes.put(ON_WHEEL_ATTRIBUTE_NAME, value);
		return this;
	}
	
	/*
	 * Custom Attributes
	 */
	
	/**
	 * Used to add an attribute for the {@link HTMLTag}
	 *
	 * @param name The name of the attribute
	 * @param value The value for the attribute
	 * @return this, to continue building
	 */
	public BaseHTMLTagBuilder attribute(String name, String value){
		this.attributes.put(name, value);
		return this;
	}
	
	/**
	 * Used to set the attributes for the {@link HTMLTag}
	 *
	 * @param attributes The {@link Map} of attributes
	 * @return this, to continue building
	 */
	public BaseHTMLTagBuilder attributes(Map<String, String> attributes){
		this.attributes = attributes;
		return this;
	}
	
	/**
	 * Builds a new {@link HTMLTag} after checking for any errors in the set parameters
	 *
	 * @return The newly built {@link HTMLTag}
	 */
	public abstract HTMLTag build();
}
