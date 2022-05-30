package com.github.tadukoo.parsing.web.html.tag;

import java.util.Map;
import java.util.Set;

/**
 * An {@link HTMLTag} representing the root {@code &lt;html>} tag of an HTML Document
 *
 * @author Logan Ferree (Tadukoo)
 * @version Alpha v.0.1
 */
public class HTMLRootTag extends HTMLTag{
	
	/**
	 * A builder to use to build a {@link HTMLRootTag}. It sets the {@link #LANG_ATTRIBUTE_NAME lang attribute}
	 * to {@link #DEFAULT_LANG_VALUE}, and otherwise provides the methods that {@link BaseHTMLTagBuilder} provides
	 * for building the tag.
	 * <br><br>
	 * It also sets the following as valid sub tags:
	 * <ul>
	 *     <li>{@link #HTML_HEAD_TAG_NAME}</li>
	 *     <li>{@link #HTML_BODY_TAG_NAME}</li>
	 * </ul>
	 * <br><br>
	 * It also sets the following as invalid sub tags:
	 * <ul>
	 *     <li>{@link #HTML_ROOT_TAG_NAME}</li>
	 * </ul>
	 *
	 * @author Logan Ferree (Tadukoo)
	 * @version Alpha v.0.1
	 */
	public static class HTMLRootTagBuilder extends BaseHTMLTagBuilder{
		
		/**
		 * Not allowed to instantiate outside {@link HTMLRootTag} - sets
		 * {@link #LANG_ATTRIBUTE_NAME lang attribute} to {@link #DEFAULT_LANG_VALUE}
		 */
		private HTMLRootTagBuilder(){
			super();
			attributes.put(LANG_ATTRIBUTE_NAME, DEFAULT_LANG_VALUE);
			attributeWhitelist.add(ON_SCROLL_ATTRIBUTE_NAME);
			subTagWhitelist.add(HTML_HEAD_TAG_NAME);
			subTagWhitelist.add(HTML_BODY_TAG_NAME);
			subTagBlacklist.add(HTML_ROOT_TAG_NAME);
		}
		
		/*
		 * Global Attributes
		 */
		
		/** {@inheritDoc} */
		@Override
		public HTMLRootTagBuilder accesskey(String value){
			return (HTMLRootTagBuilder) super.accesskey(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLRootTagBuilder classAttribute(String value){
			return (HTMLRootTagBuilder) super.classAttribute(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLRootTagBuilder contenteditable(String value){
			return (HTMLRootTagBuilder) super.contenteditable(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLRootTagBuilder data(String dataTagName, String value){
			return (HTMLRootTagBuilder) super.data(dataTagName, value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLRootTagBuilder dir(String value){
			return (HTMLRootTagBuilder) super.dir(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLRootTagBuilder draggable(String value){
			return (HTMLRootTagBuilder) super.draggable(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLRootTagBuilder hidden(){
			return (HTMLRootTagBuilder) super.hidden();
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLRootTagBuilder id(String value){
			return (HTMLRootTagBuilder) super.id(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLRootTagBuilder lang(String value){
			return (HTMLRootTagBuilder) super.lang(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLRootTagBuilder spellcheck(String value){
			return (HTMLRootTagBuilder) super.spellcheck(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLRootTagBuilder style(String value){
			return (HTMLRootTagBuilder) super.style(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLRootTagBuilder tabindex(String value){
			return (HTMLRootTagBuilder) super.tabindex(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLRootTagBuilder title(String value){
			return (HTMLRootTagBuilder) super.title(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLRootTagBuilder translate(String value){
			return (HTMLRootTagBuilder) super.translate(value);
		}
		
		/*
		 * Global Drag Event Attributes
		 */
		
		/** {@inheritDoc} */
		@Override
		public HTMLRootTagBuilder ondrag(String value){
			return (HTMLRootTagBuilder) super.ondrag(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLRootTagBuilder ondragend(String value){
			return (HTMLRootTagBuilder) super.ondragend(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLRootTagBuilder ondragenter(String value){
			return (HTMLRootTagBuilder) super.ondragenter(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLRootTagBuilder ondragleave(String value){
			return (HTMLRootTagBuilder) super.ondragleave(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLRootTagBuilder ondragover(String value){
			return (HTMLRootTagBuilder) super.ondragover(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLRootTagBuilder ondragstart(String value){
			return (HTMLRootTagBuilder) super.ondragstart(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLRootTagBuilder ondrop(String value){
			return (HTMLRootTagBuilder) super.ondrop(value);
		}
		
		/*
		 * Global Clipboard Attributes
		 */
		
		/** {@inheritDoc} */
		@Override
		public HTMLRootTagBuilder oncopy(String value){
			return (HTMLRootTagBuilder) super.oncopy(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLRootTagBuilder oncut(String value){
			return (HTMLRootTagBuilder) super.oncut(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLRootTagBuilder onpaste(String value){
			return (HTMLRootTagBuilder) super.onpaste(value);
		}
		
		/*
		 * Custom Attributes
		 */
		
		/** {@inheritDoc} */
		@Override
		public HTMLRootTagBuilder attribute(String name, String value){
			return (HTMLRootTagBuilder) super.attribute(name, value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLRootTagBuilder attributes(Map<String, String> attributes){
			return (HTMLRootTagBuilder) super.attributes(attributes);
		}
		
		/*
		 * Other Attributes
		 */
		
		/**
		 * Specifies a {@link #ON_SCROLL_ATTRIBUTE_NAME onscroll attribute},
		 * which specifies a script to be run when an element's scrollbar is being scrolled
		 *
		 * @param value The value of the {@code onscroll} attribute for the {@link HTMLTag}
		 * @return this, to continue building
		 */
		public HTMLRootTagBuilder onscroll(String value){
			attributes.put(ON_SCROLL_ATTRIBUTE_NAME, value);
			return this;
		}
		
		
		/** {@inheritDoc} */
		@Override
		public HTMLRootTag build(){
			return new HTMLRootTag(attributes, attributeWhitelist, subTagWhitelist, subTagBlacklist);
		}
	}
	
	/**
	 * Constructs a new {@link HTMLRootTag} using the given parameters
	 *
	 * @param attributes The attributes for the {@link HTMLRootTag}
	 * @param attributeWhitelist The Set of valid attributes for the {@link HTMLRootTag}
	 * @param subTagWhitelist The Set of valid sub tags for the {@link HTMLRootTag}
	 * @param subTagBlacklist The Set of invalid sub tags for the {@link HTMLRootTag}
	 */
	private HTMLRootTag(
			Map<String, String> attributes, Set<String> attributeWhitelist,
			Set<String> subTagWhitelist, Set<String> subTagBlacklist){
		super(HTML_ROOT_TAG_NAME, attributes, attributeWhitelist, true, subTagWhitelist, subTagBlacklist);
	}
	
	/**
	 * @return A {@link HTMLRootTagBuilder builder} to use to build a {@link HTMLRootTag}
	 */
	public static HTMLRootTagBuilder builder(){
		return new HTMLRootTagBuilder();
	}
}
