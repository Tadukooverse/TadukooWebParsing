package com.github.tadukoo.parsing.web.html.tag;

import com.github.tadukoo.parsing.web.html.tag.builder.BaseFocusableAndLoadableHTMLTagBuilder;

import java.util.Map;
import java.util.Set;

/**
 * An {@link HTMLTag} representing the {@code &lt;body>} tag of an HTML Document
 *
 * @author Logan Ferree (Tadukoo)
 * @version Alpha v.0.1
 */
public class HTMLBodyTag extends HTMLTag{
	
	/**
	 * A builder to use to build a {@link HTMLBodyTag}. It provides the methods that
	 * {@link BaseFocusableAndLoadableHTMLTagBuilder} provides for building the tag.
	 * <br><br>
	 * It also sets the tags from {@link #VALID_HTML_BODY_SUB_TAGS} as valid sub tags
	 * <br><br>
	 * It also adds the following attributes to the attribute whitelist and provides methods
	 * for setting them:
	 * <table>
	 *     <caption>HTML Body Tag Attributes</caption>
	 *     <tr>
	 *         <th>Attribute</th>
	 *         <th>Description</th>
	 *     </tr>
	 *     <tr>
	 *         <td>onafterprint</td>
	 *         <td>Specifies the script to be run after the document is printed</td>
	 *     </tr>
	 *     <tr>
	 *         <td>onbeforeprint</td>
	 *         <td>Specifies the script to be run before the document is printed</td>
	 *     </tr>
	 *     <tr>
	 *         <td>onbeforeunload</td>
	 *         <td>Specifies the script to be run when the document is about to be unloaded</td>
	 *     </tr>
	 *     <tr>
	 *         <td>onhashchange</td>
	 *         <td>Specifies the script to be run when there has been changes to the anchor part of the URL</td>
	 *     </tr>
	 *     <tr>
	 *         <td>onmessage</td>
	 *         <td>Specifies the script to be run when the message is triggered</td>
	 *     </tr>
	 *     <tr>
	 *         <td>onoffline</td>
	 *         <td>Specifies the script to be run when the browser starts to work offline</td>
	 *     </tr>
	 *     <tr>
	 *         <td>ononline</td>
	 *         <td>Specifies the script to be run when the browser starts to work online</td>
	 *     </tr>
	 *     <tr>
	 *         <td>onpagehide</td>
	 *         <td>Specifies the script to be run when a user navigates away from a page</td>
	 *     </tr>
	 *     <tr>
	 *         <td>onpageshow</td>
	 *         <td>Specifies the script to be run when a user navigates to a page</td>
	 *     </tr>
	 *     <tr>
	 *         <td>onpopstate</td>
	 *         <td>Specifies the script to be run when the window's history changes</td>
	 *     </tr>
	 *     <tr>
	 *         <td>onresize</td>
	 *         <td>Specifies the script to run when the browser window is resized</td>
	 *     </tr>
	 *     <tr>
	 *         <td>onstorage</td>
	 *         <td>Specifies the script to be run when a Web Storage area is updated</td>
	 *     </tr>
	 * </table>
	 *
	 * @author Logan Ferree (Tadukoo)
	 * @version Alpha v.0.1
	 */
	public static class HTMLBodyTagBuilder extends BaseFocusableAndLoadableHTMLTagBuilder{
		
		/** Not allowed to instantiate outside {@link HTMLBodyTag} */
		private HTMLBodyTagBuilder(){
			super();
			attributeWhitelist.addAll(BODY_TAG_ATTRIBUTE_WHITELIST);
			subTagWhitelist.addAll(VALID_HTML_BODY_SUB_TAGS);
		}
		
		/*
		 * Global Attributes
		 */
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder accesskey(String value){
			return (HTMLBodyTagBuilder) super.accesskey(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder classAttribute(String value){
			return (HTMLBodyTagBuilder) super.classAttribute(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder contenteditable(String value){
			return (HTMLBodyTagBuilder) super.contenteditable(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder data(String dataTagName, String value){
			return (HTMLBodyTagBuilder) super.data(dataTagName, value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder dir(String value){
			return (HTMLBodyTagBuilder) super.dir(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder draggable(String value){
			return (HTMLBodyTagBuilder) super.draggable(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder hidden(){
			return (HTMLBodyTagBuilder) super.hidden();
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder id(String value){
			return (HTMLBodyTagBuilder) super.id(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder lang(String value){
			return (HTMLBodyTagBuilder) super.lang(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder spellcheck(String value){
			return (HTMLBodyTagBuilder) super.spellcheck(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder style(String value){
			return (HTMLBodyTagBuilder) super.style(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder tabindex(String value){
			return (HTMLBodyTagBuilder) super.tabindex(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder title(String value){
			return (HTMLBodyTagBuilder) super.title(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder translate(String value){
			return (HTMLBodyTagBuilder) super.translate(value);
		}
		
		/*
		 * Global Drag Event Attributes
		 */
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder ondrag(String value){
			return (HTMLBodyTagBuilder) super.ondrag(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder ondragend(String value){
			return (HTMLBodyTagBuilder) super.ondragend(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder ondragenter(String value){
			return (HTMLBodyTagBuilder) super.ondragenter(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder ondragleave(String value){
			return (HTMLBodyTagBuilder) super.ondragleave(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder ondragover(String value){
			return (HTMLBodyTagBuilder) super.ondragover(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder ondragstart(String value){
			return (HTMLBodyTagBuilder) super.ondragstart(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder ondrop(String value){
			return (HTMLBodyTagBuilder) super.ondrop(value);
		}
		
		/*
		 * Global Clipboard Attributes
		 */
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder oncopy(String value){
			return (HTMLBodyTagBuilder) super.oncopy(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder oncut(String value){
			return (HTMLBodyTagBuilder) super.oncut(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder onpaste(String value){
			return (HTMLBodyTagBuilder) super.onpaste(value);
		}
		
		/*
		 * Global Other Event Attributes
		 */
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder oncontextmenu(String value){
			return (HTMLBodyTagBuilder) super.oncontextmenu(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder onwheel(String value){
			return (HTMLBodyTagBuilder) super.onwheel(value);
		}
		
		/*
		 * Custom Attributes
		 */
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder attribute(String name, String value){
			return (HTMLBodyTagBuilder) super.attribute(name, value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder attributes(Map<String, String> attributes){
			return (HTMLBodyTagBuilder) super.attributes(attributes);
		}
		
		/*
		 * Global Focus Event Attributes
		 */
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder onblur(String value){
			return (HTMLBodyTagBuilder) super.onblur(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder onfocus(String value){
			return (HTMLBodyTagBuilder) super.onfocus(value);
		}
		
		/*
		 * Global Keyboard Event Attributes
		 */
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder onkeydown(String value){
			return (HTMLBodyTagBuilder) super.onkeydown(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder onkeypress(String value){
			return (HTMLBodyTagBuilder) super.onkeypress(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder onkeyup(String value){
			return (HTMLBodyTagBuilder) super.onkeyup(value);
		}
		
		/*
		 * Global Mouse Event Attributes
		 */
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder onclick(String value){
			return (HTMLBodyTagBuilder) super.onclick(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder ondblclick(String value){
			return (HTMLBodyTagBuilder) super.ondblclick(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder onmousedown(String value){
			return (HTMLBodyTagBuilder) super.onmousedown(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder onmousemove(String value){
			return (HTMLBodyTagBuilder) super.onmousemove(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder onmouseout(String value){
			return (HTMLBodyTagBuilder) super.onmouseout(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder onmouseover(String value){
			return (HTMLBodyTagBuilder) super.onmouseover(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder onmouseup(String value){
			return (HTMLBodyTagBuilder) super.onmouseup(value);
		}
		
		/*
		 * Global Load Event Attribute Names - apply to some html tags
		 * - only to <body>, <frame>, <frameset>, <iframe>, <img>, <input type="image">, <link>, <script> and <style>
		 */
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder onload(String value){
			return (HTMLBodyTagBuilder) super.onload(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTagBuilder onunload(String value){
			return (HTMLBodyTagBuilder) super.onunload(value);
		}
		
		/*
		 * Global Window Event Attribute Names - apply to body tag
		 */
		
		/**
		 * Specifies the value for the {@link #ON_AFTER_PRINT_ATTRIBUTE_NAME onafterprint attribute},
		 * which specifies the script to be run after the document is printed
		 *
		 * @param value The value for the {@code onafterprint} attribute for the {@link HTMLBodyTag}
		 * @return this, to continue building
		 */
		public HTMLBodyTagBuilder onafterprint(String value){
			attributes.put(ON_AFTER_PRINT_ATTRIBUTE_NAME, value);
			return this;
		}
		
		/**
		 * Specifies the value for the {@link #ON_BEFORE_PRINT_ATTRIBUTE_NAME onbeforeprint attribute},
		 * which specifies the script to be run before the document is printed
		 *
		 * @param value The value for the {@code onbeforeprint} attribute for the {@link HTMLBodyTag}
		 * @return this, to continue building
		 */
		public HTMLBodyTagBuilder onbeforeprint(String value){
			attributes.put(ON_BEFORE_PRINT_ATTRIBUTE_NAME, value);
			return this;
		}
		
		/**
		 * Specifies the value for the {@link #ON_BEFORE_UNLOAD_ATTRIBUTE_NAME onbeforeunload attribute},
		 * which specifies the script to be run when the document is about to be unloaded
		 *
		 * @param value The value for the {@code onbeforeunload} attribute for the {@link HTMLBodyTag}
		 * @return this, to continue building
		 */
		public HTMLBodyTagBuilder onbeforeunload(String value){
			attributes.put(ON_BEFORE_UNLOAD_ATTRIBUTE_NAME, value);
			return this;
		}
		
		/**
		 * Specifies the value for the {@link #ON_HASH_CHANGE_ATTRIBUTE_NAME onhashchange attribute},
		 * which specifies the script to be run when there has been changes to the anchor part of the URL
		 *
		 * @param value The value for the {@code onhashchange} attribute for the {@link HTMLBodyTag}
		 * @return this, to continue building
		 */
		public HTMLBodyTagBuilder onhashchange(String value){
			attributes.put(ON_HASH_CHANGE_ATTRIBUTE_NAME, value);
			return this;
		}
		
		/**
		 * Specifies the value for the {@link #ON_MESSAGE_ATTRIBUTE_NAME onmessage attribute},
		 * which specifies the script to be run when the message is triggered
		 *
		 * @param value The value for the {@code onmessage} attribute for the {@link HTMLBodyTag}
		 * @return this, to continue building
		 */
		public HTMLBodyTagBuilder onmessage(String value){
			attributes.put(ON_MESSAGE_ATTRIBUTE_NAME, value);
			return this;
		}
		
		/**
		 * Specifies the value for the {@link #ON_OFFLINE_ATTRIBUTE_NAME onoffline attribute},
		 * which specifies the script to be run when the browser starts to work offline
		 *
		 * @param value The value for the {@code onoffline} attribute for the {@link HTMLBodyTag}
		 * @return this, to continue building
		 */
		public HTMLBodyTagBuilder onoffline(String value){
			attributes.put(ON_OFFLINE_ATTRIBUTE_NAME, value);
			return this;
		}
		
		/**
		 * Specifies the value for the {@link #ON_ONLINE_ATTRIBUTE_NAME ononline attribute},
		 * which specifies the script to be run when the browser starts to work online
		 *
		 * @param value The value for the {@code ononline} attribute for the {@link HTMLBodyTag}
		 * @return this, to continue building
		 */
		public HTMLBodyTagBuilder ononline(String value){
			attributes.put(ON_ONLINE_ATTRIBUTE_NAME, value);
			return this;
		}
		
		/**
		 * Specifies the value for the {@link #ON_PAGE_HIDE_ATTRIBUTE_NAME onpagehide attribute},
		 * which specifies the script to be run when a user navigates away from a page
		 *
		 * @param value The value for the {@code onpagehide} attribute for the {@link HTMLBodyTag}
		 * @return this, to continue building
		 */
		public HTMLBodyTagBuilder onpagehide(String value){
			attributes.put(ON_PAGE_HIDE_ATTRIBUTE_NAME, value);
			return this;
		}
		
		/**
		 * Specifies the value for the {@link #ON_PAGE_SHOW_ATTRIBUTE_NAME onpageshow attribute},
		 * which specifies the script to be run when a user navigates to a page
		 *
		 * @param value The value for the {@code onpageshow} attribute for the {@link HTMLBodyTag}
		 * @return this, to continue building
		 */
		public HTMLBodyTagBuilder onpageshow(String value){
			attributes.put(ON_PAGE_SHOW_ATTRIBUTE_NAME, value);
			return this;
		}
		
		/**
		 * Specifies the value for the {@link #ON_POP_STATE_ATTRIBUTE_NAME onpopstate attribute},
		 * which specifies the script to be run when the window's history changes
		 *
		 * @param value The value for the {@code onpopstate} attribute for the {@link HTMLBodyTag}
		 * @return this, to continue building
		 */
		public HTMLBodyTagBuilder onpopstate(String value){
			attributes.put(ON_POP_STATE_ATTRIBUTE_NAME, value);
			return this;
		}
		
		/**
		 * Specifies the value for the {@link #ON_RESIZE_ATTRIBUTE_NAME onresize attribute},
		 * which specifies the script to run when the browser window is resized
		 *
		 * @param value The value for the {@code onresize} attribute for the {@link HTMLBodyTag}
		 * @return this, to continue building
		 */
		public HTMLBodyTagBuilder onresize(String value){
			attributes.put(ON_RESIZE_ATTRIBUTE_NAME, value);
			return this;
		}
		
		/**
		 * Specifies the value for the {@link #ON_STORAGE_ATTRIBUTE_NAME onstorage attribute},
		 * which specifies the script to be run when a Web Storage area is updated
		 *
		 * @param value The value for the {@code onstorage} attribute for the {@link HTMLBodyTag}
		 * @return this, to continue building
		 */
		public HTMLBodyTagBuilder onstorage(String value){
			attributes.put(ON_STORAGE_ATTRIBUTE_NAME, value);
			return this;
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLBodyTag build(){
			return new HTMLBodyTag(attributes, attributeWhitelist, subTagWhitelist, subTagBlacklist);
		}
	}
	
	/**
	 * Constructs an {@link HTMLBodyTag} with the given parameters
	 *
	 * @param attributes The Map of attributes in this {@link HTMLBodyTag}
	 * @param attributeWhitelist The Set of valid attributes in this {@link HTMLBodyTag}
	 * @param subTagWhitelist The Set of valid tags under this {@link HTMLBodyTag}
	 * @param subTagBlacklist The Set of invalid tags under this {@link HTMLBodyTag}
	 */
	private HTMLBodyTag(
			Map<String, String> attributes, Set<String> attributeWhitelist,
			Set<String> subTagWhitelist, Set<String> subTagBlacklist){
		super(HTML_BODY_TAG_NAME, attributes, attributeWhitelist, true, subTagWhitelist, subTagBlacklist);
	}
	
	/**
	 * @return A {@link HTMLBodyTagBuilder builder} to use to build a {@link HTMLBodyTag}
	 */
	public static HTMLBodyTagBuilder builder(){
		return new HTMLBodyTagBuilder();
	}
}
