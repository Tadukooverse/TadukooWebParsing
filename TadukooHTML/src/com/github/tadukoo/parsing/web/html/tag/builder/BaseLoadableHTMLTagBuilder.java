package com.github.tadukoo.parsing.web.html.tag.builder;

import com.github.tadukoo.parsing.web.html.tag.HTMLTag;

import java.util.Map;

/**
 * A builder used to build loadable {@link HTMLTag HTML tags}. It includes everything from
 * {@link BaseHTMLTagBuilder BaseHTMLTagBuilder}, and also adds the following attributes
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
public abstract class BaseLoadableHTMLTagBuilder extends BaseHTMLTagBuilder{
	
	/** Not allowed to instantiate outside here and extensions */
	protected BaseLoadableHTMLTagBuilder(){
		super();
		attributeWhitelist.addAll(GLOBAL_LOADABLE_ATTRIBUTE_WHITELIST);
	}
	
	/*
	 * Global Attributes
	 */
	
	/** {@inheritDoc} */
	@Override
	public BaseLoadableHTMLTagBuilder accesskey(String value){
		return (BaseLoadableHTMLTagBuilder) super.accesskey(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseLoadableHTMLTagBuilder classAttribute(String value){
		return (BaseLoadableHTMLTagBuilder) super.classAttribute(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseLoadableHTMLTagBuilder contenteditable(String value){
		return (BaseLoadableHTMLTagBuilder) super.contenteditable(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseLoadableHTMLTagBuilder data(String dataTagName, String value){
		return (BaseLoadableHTMLTagBuilder) super.data(dataTagName, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseLoadableHTMLTagBuilder dir(String value){
		return (BaseLoadableHTMLTagBuilder) super.dir(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseLoadableHTMLTagBuilder draggable(String value){
		return (BaseLoadableHTMLTagBuilder) super.draggable(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseLoadableHTMLTagBuilder hidden(){
		return (BaseLoadableHTMLTagBuilder) super.hidden();
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseLoadableHTMLTagBuilder id(String value){
		return (BaseLoadableHTMLTagBuilder) super.id(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseLoadableHTMLTagBuilder lang(String value){
		return (BaseLoadableHTMLTagBuilder) super.lang(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseLoadableHTMLTagBuilder spellcheck(String value){
		return (BaseLoadableHTMLTagBuilder) super.spellcheck(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseLoadableHTMLTagBuilder style(String value){
		return (BaseLoadableHTMLTagBuilder) super.style(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseLoadableHTMLTagBuilder tabindex(String value){
		return (BaseLoadableHTMLTagBuilder) super.tabindex(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseLoadableHTMLTagBuilder title(String value){
		return (BaseLoadableHTMLTagBuilder) super.title(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseLoadableHTMLTagBuilder translate(String value){
		return (BaseLoadableHTMLTagBuilder) super.translate(value);
	}
	
	/*
	 * Global Drag Event Attributes
	 */
	
	/** {@inheritDoc} */
	@Override
	public BaseLoadableHTMLTagBuilder ondrag(String value){
		return (BaseLoadableHTMLTagBuilder) super.ondrag(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseLoadableHTMLTagBuilder ondragend(String value){
		return (BaseLoadableHTMLTagBuilder) super.ondragend(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseLoadableHTMLTagBuilder ondragenter(String value){
		return (BaseLoadableHTMLTagBuilder) super.ondragenter(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseLoadableHTMLTagBuilder ondragleave(String value){
		return (BaseLoadableHTMLTagBuilder) super.ondragleave(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseLoadableHTMLTagBuilder ondragover(String value){
		return (BaseLoadableHTMLTagBuilder) super.ondragover(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseLoadableHTMLTagBuilder ondragstart(String value){
		return (BaseLoadableHTMLTagBuilder) super.ondragstart(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseLoadableHTMLTagBuilder ondrop(String value){
		return (BaseLoadableHTMLTagBuilder) super.ondrop(value);
	}
	
	/*
	 * Global Clipboard Attributes
	 */
	
	/** {@inheritDoc} */
	@Override
	public BaseLoadableHTMLTagBuilder oncopy(String value){
		return (BaseLoadableHTMLTagBuilder) super.oncopy(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseLoadableHTMLTagBuilder oncut(String value){
		return (BaseLoadableHTMLTagBuilder) super.oncut(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseLoadableHTMLTagBuilder onpaste(String value){
		return (BaseLoadableHTMLTagBuilder) super.onpaste(value);
	}
	
	/*
	 * Global Other Event Attributes
	 */
	
	/** {@inheritDoc} */
	@Override
	public BaseLoadableHTMLTagBuilder oncontextmenu(String value){
		return (BaseLoadableHTMLTagBuilder) super.oncontextmenu(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseLoadableHTMLTagBuilder onwheel(String value){
		return (BaseLoadableHTMLTagBuilder) super.onwheel(value);
	}
	
	/*
	 * Custom Attributes
	 */
	
	/** {@inheritDoc} */
	@Override
	public BaseLoadableHTMLTagBuilder attribute(String name, String value){
		return (BaseLoadableHTMLTagBuilder) super.attribute(name, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public BaseLoadableHTMLTagBuilder attributes(Map<String, String> attributes){
		return (BaseLoadableHTMLTagBuilder) super.attributes(attributes);
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
	public BaseLoadableHTMLTagBuilder onload(String value){
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
	public BaseLoadableHTMLTagBuilder onunload(String value){
		attributes.put(ON_UNLOAD_ATTRIBUTE_NAME, value);
		return this;
	}
}
