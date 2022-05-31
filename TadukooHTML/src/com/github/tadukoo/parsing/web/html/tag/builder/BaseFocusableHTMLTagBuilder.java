package com.github.tadukoo.parsing.web.html.tag.builder;

import com.github.tadukoo.parsing.web.html.tag.HTMLTag;

import java.util.Map;

/**
 * A builder used to build focusable {@link HTMLTag HTML tags}. It includes everything from
 * {@link BaseHTMLTagBuilder BaseHTMLTagBuilder}, and also adds the following attributes
 * (along with adding them to the whitelist):
 * <table>
 *     <caption>Focusable Attributes</caption>
 *     <tr>
 *         <th>Attribute Name</th>
 *         <th>Description</th>
 *     </tr>
 *     <tr>
 *         <td>{@link #ON_BLUR_ATTRIBUTE_NAME onblur}</td>
 *         <td>Specifies a script to run when the element loses focus</td>
 *     </tr>
 *     <tr>
 *         <td>{@link #ON_FOCUS_ATTRIBUTE_NAME onfocus}</td>
 *         <td>Specifies a script to run when the element gets focus</td>
 *     </tr>
 *     <tr>
 *         <td>{@link #ON_KEY_DOWN_ATTRIBUTE_NAME onkeydown}</td>
 *         <td>Specifies a script to run when a user is pressing a key</td>
 *     </tr>
 *     <tr>
 *         <td>{@link #ON_KEY_PRESS_ATTRIBUTE_NAME onkeypress}</td>
 *         <td>Specifies a script to run when a user presses a key</td>
 *     </tr>
 *     <tr>
 *         <td>{@link #ON_KEY_UP_ATTRIBUTE_NAME onkeyup}</td>
 *         <td>Specifies a script to run when a user releases a key</td>
 *     </tr>
 *     <tr>
 *         <td>{@link #ON_CLICK_ATTRIBUTE_NAME onclick}</td>
 *         <td>Specifies a script that runs on a mouse click on the element</td>
 *     </tr>
 *     <tr>
 *         <td>{@link #ON_DBL_CLICK_ATTRIBUTE_NAME ondblclick}</td>
 *         <td>Specifies a script that runs on a mouse double-click on the element</td>
 *     </tr>
 *     <tr>
 *         <td>{@link #ON_MOUSE_DOWN_ATTRIBUTE_NAME onmousedown}</td>
 *         <td>Specifies a script that runs when a mouse button is pressed down on an element</td>
 *     </tr>
 *     <tr>
 *         <td>{@link #ON_MOUSE_MOVE_ATTRIBUTE_NAME onmousemove}</td>
 *         <td>Specifies a script that runs when the mouse pointer is moving while it is over an element</td>
 *     </tr>
 *     <tr>
 *         <td>{@link #ON_MOUSE_OUT_ATTRIBUTE_NAME onmouseout}</td>
 *         <td>Specifies a script that runs when the mouse pointer moves out of an element</td>
 *     </tr>
 *     <tr>
 *         <td>{@link #ON_MOUSE_OVER_ATTRIBUTE_NAME onmouseover}</td>
 *         <td>Specifies a script that runs when the mouse pointer moves over an element</td>
 *     </tr>
 *     <tr>
 *         <td>{@link #ON_MOUSE_UP_ATTRIBUTE_NAME onmouseup}</td>
 *         <td>Specifies a script that runs when a mouse button is released over an element</td>
 *     </tr>
 * </table>
 *
 * @author Logan Ferree (Tadukoo)
 * @version Alpha v.0.1
 */
public abstract class BaseFocusableHTMLTagBuilder extends BaseHTMLTagBuilder{
	
	/** Not allowed to instantiate outside here and extensions */
	protected BaseFocusableHTMLTagBuilder(){
		super();
		attributeWhitelist.addAll(GLOBAL_FOCUSABLE_ATTRIBUTE_WHITELIST);
	}
	
	/*
	 * Global Attributes
	 */
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableHTMLTagBuilder accesskey(String value){
		return (BaseFocusableHTMLTagBuilder) super.accesskey(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableHTMLTagBuilder classAttribute(String value){
		return (BaseFocusableHTMLTagBuilder) super.classAttribute(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableHTMLTagBuilder contenteditable(String value){
		return (BaseFocusableHTMLTagBuilder) super.contenteditable(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableHTMLTagBuilder data(String dataTagName, String value){
		return (BaseFocusableHTMLTagBuilder) super.data(dataTagName, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableHTMLTagBuilder dir(String value){
		return (BaseFocusableHTMLTagBuilder) super.dir(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableHTMLTagBuilder draggable(String value){
		return (BaseFocusableHTMLTagBuilder) super.draggable(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableHTMLTagBuilder hidden(){
		return (BaseFocusableHTMLTagBuilder) super.hidden();
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableHTMLTagBuilder id(String value){
		return (BaseFocusableHTMLTagBuilder) super.id(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableHTMLTagBuilder lang(String value){
		return (BaseFocusableHTMLTagBuilder) super.lang(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableHTMLTagBuilder spellcheck(String value){
		return (BaseFocusableHTMLTagBuilder) super.spellcheck(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableHTMLTagBuilder style(String value){
		return (BaseFocusableHTMLTagBuilder) super.style(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableHTMLTagBuilder tabindex(String value){
		return (BaseFocusableHTMLTagBuilder) super.tabindex(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableHTMLTagBuilder title(String value){
		return (BaseFocusableHTMLTagBuilder) super.title(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableHTMLTagBuilder translate(String value){
		return (BaseFocusableHTMLTagBuilder) super.translate(value);
	}
	
	/*
	 * Global Drag Event Attributes
	 */
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableHTMLTagBuilder ondrag(String value){
		return (BaseFocusableHTMLTagBuilder) super.ondrag(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableHTMLTagBuilder ondragend(String value){
		return (BaseFocusableHTMLTagBuilder) super.ondragend(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableHTMLTagBuilder ondragenter(String value){
		return (BaseFocusableHTMLTagBuilder) super.ondragenter(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableHTMLTagBuilder ondragleave(String value){
		return (BaseFocusableHTMLTagBuilder) super.ondragleave(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableHTMLTagBuilder ondragover(String value){
		return (BaseFocusableHTMLTagBuilder) super.ondragover(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableHTMLTagBuilder ondragstart(String value){
		return (BaseFocusableHTMLTagBuilder) super.ondragstart(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableHTMLTagBuilder ondrop(String value){
		return (BaseFocusableHTMLTagBuilder) super.ondrop(value);
	}
	
	/*
	 * Global Clipboard Attributes
	 */
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableHTMLTagBuilder oncopy(String value){
		return (BaseFocusableHTMLTagBuilder) super.oncopy(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableHTMLTagBuilder oncut(String value){
		return (BaseFocusableHTMLTagBuilder) super.oncut(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableHTMLTagBuilder onpaste(String value){
		return (BaseFocusableHTMLTagBuilder) super.onpaste(value);
	}
	
	/*
	 * Global Other Event Attributes
	 */
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableHTMLTagBuilder oncontextmenu(String value){
		return (BaseFocusableHTMLTagBuilder) super.oncontextmenu(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableHTMLTagBuilder onwheel(String value){
		return (BaseFocusableHTMLTagBuilder) super.onwheel(value);
	}
	
	/*
	 * Custom Attributes
	 */
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableHTMLTagBuilder attribute(String name, String value){
		return (BaseFocusableHTMLTagBuilder) super.attribute(name, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableHTMLTagBuilder attributes(Map<String, String> attributes){
		return (BaseFocusableHTMLTagBuilder) super.attributes(attributes);
	}
	
	/*
	 * Global Focus Event Attributes
	 */
	
	/**
	 * Specifies the {@link #ON_BLUR_ATTRIBUTE_NAME onblur attribute},
	 * which specifies a script to run when the element loses focus
	 *
	 * @param value The value for the {@code onblur} attribute for the {@link HTMLTag}
	 * @return this, to continue building
	 */
	public BaseFocusableHTMLTagBuilder onblur(String value){
		attributes.put(ON_BLUR_ATTRIBUTE_NAME, value);
		return this;
	}
	
	/**
	 * Specifies the {@link #ON_FOCUS_ATTRIBUTE_NAME onfocus attribute},
	 * which specifies a script to run when the element gets focus
	 *
	 * @param value The value for the {@code onfocus} attribute for the {@link HTMLTag}
	 * @return this, to continue building
	 */
	public BaseFocusableHTMLTagBuilder onfocus(String value){
		attributes.put(ON_FOCUS_ATTRIBUTE_NAME, value);
		return this;
	}
	
	/*
	 * Global Keyboard Event Attributes
	 */
	
	/**
	 * Specifies the {@link #ON_KEY_DOWN_ATTRIBUTE_NAME onkeydown attribute},
	 * which specifies a script to run when a user is pressing a key
	 *
	 * @param value The value for the {@code onkeydown} attribute for the {@link HTMLTag}
	 * @return this, to continue building
	 */
	public BaseFocusableHTMLTagBuilder onkeydown(String value){
		attributes.put(ON_KEY_DOWN_ATTRIBUTE_NAME, value);
		return this;
	}
	
	/**
	 * Specifies the {@link #ON_KEY_PRESS_ATTRIBUTE_NAME onkeypress attribute},
	 * which specifies a script to run when a user presses a key
	 *
	 * @param value The value for the {@code onkeypress} attribute for the {@link HTMLTag}
	 * @return this, to continue building
	 */
	public BaseFocusableHTMLTagBuilder onkeypress(String value){
		attributes.put(ON_KEY_PRESS_ATTRIBUTE_NAME, value);
		return this;
	}
	
	/**
	 * Specifies the {@link #ON_KEY_UP_ATTRIBUTE_NAME onkeyup attribute},
	 * which specifies a script to run when a user releases a key
	 *
	 * @param value The value for the {@code onkeyup} attribute for the {@link HTMLTag}
	 * @return this, to continue building
	 */
	public BaseFocusableHTMLTagBuilder onkeyup(String value){
		attributes.put(ON_KEY_UP_ATTRIBUTE_NAME, value);
		return this;
	}
	
	/*
	 * Global Mouse Event Attributes
	 */
	
	/**
	 * Specifies the {@link #ON_CLICK_ATTRIBUTE_NAME onclick attribute},
	 * which specifies a script that runs on a mouse click on the element
	 *
	 * @param value The value for the {@code onclick} attribute for the {@link HTMLTag}
	 * @return this, to continue building
	 */
	public BaseFocusableHTMLTagBuilder onclick(String value){
		attributes.put(ON_CLICK_ATTRIBUTE_NAME, value);
		return this;
	}
	
	/**
	 * Specifies the {@link #ON_DBL_CLICK_ATTRIBUTE_NAME ondblclick attribute},
	 * which specifies a script that runs on a mouse double-click on the element
	 *
	 * @param value The value for the {@code ondblclick} attribute for the {@link HTMLTag}
	 * @return this, to continue building
	 */
	public BaseFocusableHTMLTagBuilder ondblclick(String value){
		attributes.put(ON_DBL_CLICK_ATTRIBUTE_NAME, value);
		return this;
	}
	
	/**
	 * Specifies the {@link #ON_MOUSE_DOWN_ATTRIBUTE_NAME onmousedown attribute},
	 * which specifies a script that runs when a mouse button is pressed down on an element
	 *
	 * @param value The value for the {@code onmousedown} attribute for the {@link HTMLTag}
	 * @return this, to continue building
	 */
	public BaseFocusableHTMLTagBuilder onmousedown(String value){
		attributes.put(ON_MOUSE_DOWN_ATTRIBUTE_NAME, value);
		return this;
	}
	
	/**
	 * Specifies the {@link #ON_MOUSE_MOVE_ATTRIBUTE_NAME onmousemove attribute},
	 * which specifies a script that runs when the mouse pointer is moving while it is over an element
	 *
	 * @param value The value for the {@code onmousemove} attribute for the {@link HTMLTag}
	 * @return this, to continue building
	 */
	public BaseFocusableHTMLTagBuilder onmousemove(String value){
		attributes.put(ON_MOUSE_MOVE_ATTRIBUTE_NAME, value);
		return this;
	}
	
	/**
	 * Specifies the {@link #ON_MOUSE_OUT_ATTRIBUTE_NAME onmouseout attribute},
	 * which specifies a script that runs when the mouse pointer moves out of an element
	 *
	 * @param value The value for the {@code onmouseout} attribute for the {@link HTMLTag}
	 * @return this, to continue building
	 */
	public BaseFocusableHTMLTagBuilder onmouseout(String value){
		attributes.put(ON_MOUSE_OUT_ATTRIBUTE_NAME, value);
		return this;
	}
	
	/**
	 * Specifies the {@link #ON_MOUSE_OVER_ATTRIBUTE_NAME onmouseover attribute},
	 * which specifies a script that runs when the mouse pointer moves over an element
	 *
	 * @param value The value for the {@code onmouseover} attribute for the {@link HTMLTag}
	 * @return this, to continue building
	 */
	public BaseFocusableHTMLTagBuilder onmouseover(String value){
		attributes.put(ON_MOUSE_OVER_ATTRIBUTE_NAME, value);
		return this;
	}
	
	/**
	 * Specifies the {@link #ON_MOUSE_UP_ATTRIBUTE_NAME onmouseup attribute},
	 * which specifies a script that runs when a mouse button is released over an element
	 *
	 * @param value The value for the {@code onmouseup} attribute for the {@link HTMLTag}
	 * @return this, to continue building
	 */
	public BaseFocusableHTMLTagBuilder onmouseup(String value){
		attributes.put(ON_MOUSE_UP_ATTRIBUTE_NAME, value);
		return this;
	}
}
