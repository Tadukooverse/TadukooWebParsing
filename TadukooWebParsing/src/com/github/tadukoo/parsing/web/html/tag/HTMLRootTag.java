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
			subTagWhitelist.add(HTML_HEAD_TAG_NAME);
			subTagBlacklist.add(HTML_ROOT_TAG_NAME);
		}
		
		/*
		 * Global Attributes
		 */
		
		/** {@inheritDoc} */
		public HTMLRootTagBuilder accesskey(String value){
			return (HTMLRootTagBuilder) super.accesskey(value);
		}
		
		/** {@inheritDoc} */
		public HTMLRootTagBuilder classAttribute(String value){
			return (HTMLRootTagBuilder) super.classAttribute(value);
		}
		
		/** {@inheritDoc} */
		public HTMLRootTagBuilder contenteditable(String value){
			return (HTMLRootTagBuilder) super.contenteditable(value);
		}
		
		/** {@inheritDoc} */
		public HTMLRootTagBuilder data(String dataTagName, String value){
			return (HTMLRootTagBuilder) super.data(dataTagName, value);
		}
		
		/** {@inheritDoc} */
		public HTMLRootTagBuilder dir(String value){
			return (HTMLRootTagBuilder) super.dir(value);
		}
		
		/** {@inheritDoc} */
		public HTMLRootTagBuilder draggable(String value){
			return (HTMLRootTagBuilder) super.draggable(value);
		}
		
		/** {@inheritDoc} */
		public HTMLRootTagBuilder hidden(){
			return (HTMLRootTagBuilder) super.hidden();
		}
		
		/** {@inheritDoc} */
		public HTMLRootTagBuilder id(String value){
			return (HTMLRootTagBuilder) super.id(value);
		}
		
		/** {@inheritDoc} */
		public HTMLRootTagBuilder lang(String value){
			return (HTMLRootTagBuilder) super.lang(value);
		}
		
		/** {@inheritDoc} */
		public HTMLRootTagBuilder spellcheck(String value){
			return (HTMLRootTagBuilder) super.spellcheck(value);
		}
		
		/** {@inheritDoc} */
		public HTMLRootTagBuilder style(String value){
			return (HTMLRootTagBuilder) super.style(value);
		}
		
		/** {@inheritDoc} */
		public HTMLRootTagBuilder tabindex(String value){
			return (HTMLRootTagBuilder) super.tabindex(value);
		}
		
		/** {@inheritDoc} */
		public HTMLRootTagBuilder title(String value){
			return (HTMLRootTagBuilder) super.title(value);
		}
		
		/** {@inheritDoc} */
		public HTMLRootTagBuilder translate(String value){
			return (HTMLRootTagBuilder) super.translate(value);
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
