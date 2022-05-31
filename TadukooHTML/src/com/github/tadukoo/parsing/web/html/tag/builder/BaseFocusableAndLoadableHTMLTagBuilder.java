package com.github.tadukoo.parsing.web.html.tag.builder;

import com.github.tadukoo.parsing.web.html.tag.HTMLTag;

import java.util.Map;

/**
 * A builder used to build {@link HTMLTag HTML tags} that are both focusable and loadable.
 * It includes everything from {@link BaseFocusableHTMLTagBuilder}, and also adds the following attributes
 * (along with adding them to the whitelist):
 * <table>
 *     <caption>Loadable Attributes</caption>
 *     <tr>
 *         <th>Attribute Name</th>
 *         <th>Description</th>
 *     </tr>
 *     <tr>
 *         <td>{@link #ON_LOAD_ATTRIBUTE_NAME onload}</td>
 *         <td>Specifies the script to run after the page is finished loading</td>
 *     </tr>
 *     <tr>
 *         <td>{@link #ON_UNLOAD_ATTRIBUTE_NAME onunload}</td>
 *         <td>Specifies the script to run once a page has unloaded (or the browser window has been closed)</td>
 *     </tr>
 * </table>
 *
 * @author Logan Ferree (Tadukoo)
 * @version Alpha v.0.1
 */
public abstract class BaseFocusableAndLoadableHTMLTagBuilder extends BaseFocusableHTMLTagBuilder{
	
	/** Not allowed to instantiate outside here and extensions */
	protected BaseFocusableAndLoadableHTMLTagBuilder(){
		super();
		attributeWhitelist.addAll(GLOBAL_FOCUSABLE_AND_LOADABLE_ATTRIBUTE_WHITELIST);
	}
	
	/*
	 * Global Attributes
	 */
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder accesskey(String value){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.accesskey(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder classAttribute(String value){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.classAttribute(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder contenteditable(String value){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.contenteditable(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder data(String dataTagName, String value){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.data(dataTagName, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder dir(String value){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.dir(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder draggable(String value){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.draggable(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder hidden(){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.hidden();
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder id(String value){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.id(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder lang(String value){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.lang(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder spellcheck(String value){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.spellcheck(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder style(String value){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.style(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder tabindex(String value){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.tabindex(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder title(String value){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.title(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder translate(String value){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.translate(value);
	}
	
	/*
	 * Global Drag Event Attributes
	 */
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder ondrag(String value){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.ondrag(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder ondragend(String value){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.ondragend(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder ondragenter(String value){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.ondragenter(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder ondragleave(String value){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.ondragleave(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder ondragover(String value){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.ondragover(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder ondragstart(String value){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.ondragstart(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder ondrop(String value){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.ondrop(value);
	}
	
	/*
	 * Global Clipboard Attributes
	 */
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder oncopy(String value){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.oncopy(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder oncut(String value){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.oncut(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder onpaste(String value){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.onpaste(value);
	}
	
	/*
	 * Global Other Event Attributes
	 */
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder oncontextmenu(String value){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.oncontextmenu(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder onwheel(String value){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.onwheel(value);
	}
	
	/*
	 * Custom Attributes
	 */
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder attribute(String name, String value){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.attribute(name, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder attributes(Map<String, String> attributes){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.attributes(attributes);
	}
	
	/*
	 * Global Focus Event Attributes
	 */
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder onblur(String value){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.onblur(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder onfocus(String value){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.onfocus(value);
	}
	
	/*
	 * Global Keyboard Event Attributes
	 */
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder onkeydown(String value){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.onkeydown(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder onkeypress(String value){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.onkeypress(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder onkeyup(String value){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.onkeyup(value);
	}
	
	/*
	 * Global Mouse Event Attributes
	 */
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder onclick(String value){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.onclick(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder ondblclick(String value){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.ondblclick(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder onmousedown(String value){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.onmousedown(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder onmousemove(String value){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.onmousemove(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder onmouseout(String value){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.onmouseout(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder onmouseover(String value){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.onmouseover(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseFocusableAndLoadableHTMLTagBuilder onmouseup(String value){
		return (BaseFocusableAndLoadableHTMLTagBuilder) super.onmouseup(value);
	}
	
	/*
	 * Global Load Event Attributes
	 */
	
	/**
	 * Specifies the {@link #ON_LOAD_ATTRIBUTE_NAME onload attribute},
	 * which specifies the script to run after the page is finished loading
	 *
	 * @param value The value for the {@code onload} attribute for the {@link HTMLTag}
	 * @return this, to continue building
	 */
	public BaseFocusableAndLoadableHTMLTagBuilder onload(String value){
		attributes.put(ON_LOAD_ATTRIBUTE_NAME, value);
		return this;
	}
	
	/**
	 * Specifies the {@link #ON_UNLOAD_ATTRIBUTE_NAME onunload attribute},
	 * which specifies the script to run once a page has unloaded (or the browser window has been closed)
	 *
	 * @param value The value for the {@code onunload} attribute for the {@link HTMLTag}
	 * @return this, to continue building
	 */
	public BaseFocusableAndLoadableHTMLTagBuilder onunload(String value){
		attributes.put(ON_UNLOAD_ATTRIBUTE_NAME, value);
		return this;
	}
}
