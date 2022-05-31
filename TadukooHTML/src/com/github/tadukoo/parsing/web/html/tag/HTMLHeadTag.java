package com.github.tadukoo.parsing.web.html.tag;

import com.github.tadukoo.parsing.web.html.tag.builder.BaseHTMLTagBuilder;

import java.util.Map;
import java.util.Set;

/**
 * An {@link HTMLTag} representing the {@code &lt;head>} tag of an HTML Document
 *
 * @author Logan Ferree (Tadukoo)
 * @version Alpha v.0.1
 */
public class HTMLHeadTag extends HTMLTag{
	
	/**
	 * A builder to use to build a {@link HTMLHeadTag}. It provides the methods that {@link BaseHTMLTagBuilder}
	 * provides for building the tag.
	 * <br><br>
	 * It also sets the tags from {@link #VALID_HTML_HEAD_SUB_TAGS} as valid sub tags
	 * <br><br>
	 * It also sets the following as invalid sub tags:
	 * <ul>
	 *     <li>{@link #HTML_ROOT_TAG_NAME}</li>
	 * </ul>
	 *
	 * @author Logan Ferree (Tadukoo)
	 * @version Alpha v.0.1
	 */
	public static class HTMLHeadTagBuilder extends BaseHTMLTagBuilder{
		
		/** Not allowed to instantiate outside {@link HTMLHeadTag} */
		private HTMLHeadTagBuilder(){
			super();
			subTagWhitelist.addAll(VALID_HTML_HEAD_SUB_TAGS);
			subTagBlacklist.add(HTML_ROOT_TAG_NAME);
		}
		
		/*
		 * Global Attributes
		 */
		
		/** {@inheritDoc} */
		public HTMLHeadTagBuilder accesskey(String value){
			return (HTMLHeadTagBuilder) super.accesskey(value);
		}
		
		/** {@inheritDoc} */
		public HTMLHeadTagBuilder classAttribute(String value){
			return (HTMLHeadTagBuilder) super.classAttribute(value);
		}
		
		/** {@inheritDoc} */
		public HTMLHeadTagBuilder contenteditable(String value){
			return (HTMLHeadTagBuilder) super.contenteditable(value);
		}
		
		/** {@inheritDoc} */
		public HTMLHeadTagBuilder data(String dataTagName, String value){
			return (HTMLHeadTagBuilder) super.data(dataTagName, value);
		}
		
		/** {@inheritDoc} */
		public HTMLHeadTagBuilder dir(String value){
			return (HTMLHeadTagBuilder) super.dir(value);
		}
		
		/** {@inheritDoc} */
		public HTMLHeadTagBuilder draggable(String value){
			return (HTMLHeadTagBuilder) super.draggable(value);
		}
		
		/** {@inheritDoc} */
		public HTMLHeadTagBuilder hidden(){
			return (HTMLHeadTagBuilder) super.hidden();
		}
		
		/** {@inheritDoc} */
		public HTMLHeadTagBuilder id(String value){
			return (HTMLHeadTagBuilder) super.id(value);
		}
		
		/** {@inheritDoc} */
		public HTMLHeadTagBuilder lang(String value){
			return (HTMLHeadTagBuilder) super.lang(value);
		}
		
		/** {@inheritDoc} */
		public HTMLHeadTagBuilder spellcheck(String value){
			return (HTMLHeadTagBuilder) super.spellcheck(value);
		}
		
		/** {@inheritDoc} */
		public HTMLHeadTagBuilder style(String value){
			return (HTMLHeadTagBuilder) super.style(value);
		}
		
		/** {@inheritDoc} */
		public HTMLHeadTagBuilder tabindex(String value){
			return (HTMLHeadTagBuilder) super.tabindex(value);
		}
		
		/** {@inheritDoc} */
		public HTMLHeadTagBuilder title(String value){
			return (HTMLHeadTagBuilder) super.title(value);
		}
		
		/** {@inheritDoc} */
		public HTMLHeadTagBuilder translate(String value){
			return (HTMLHeadTagBuilder) super.translate(value);
		}
		
		/*
		 * Global Drag Event Attributes
		 */
		
		/** {@inheritDoc} */
		@Override
		public HTMLHeadTagBuilder ondrag(String value){
			return (HTMLHeadTagBuilder) super.ondrag(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLHeadTagBuilder ondragend(String value){
			return (HTMLHeadTagBuilder) super.ondragend(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLHeadTagBuilder ondragenter(String value){
			return (HTMLHeadTagBuilder) super.ondragenter(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLHeadTagBuilder ondragleave(String value){
			return (HTMLHeadTagBuilder) super.ondragleave(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLHeadTagBuilder ondragover(String value){
			return (HTMLHeadTagBuilder) super.ondragover(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLHeadTagBuilder ondragstart(String value){
			return (HTMLHeadTagBuilder) super.ondragstart(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLHeadTagBuilder ondrop(String value){
			return (HTMLHeadTagBuilder) super.ondrop(value);
		}
		
		/*
		 * Global Clipboard Attributes
		 */
		
		/** {@inheritDoc} */
		@Override
		public HTMLHeadTagBuilder oncopy(String value){
			return (HTMLHeadTagBuilder) super.oncopy(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLHeadTagBuilder oncut(String value){
			return (HTMLHeadTagBuilder) super.oncut(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLHeadTagBuilder onpaste(String value){
			return (HTMLHeadTagBuilder) super.onpaste(value);
		}
		
		/*
		 * Global Other Event Attributes
		 */
		
		/** {@inheritDoc} */
		@Override
		public HTMLHeadTagBuilder oncontextmenu(String value){
			return (HTMLHeadTagBuilder) super.oncontextmenu(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLHeadTagBuilder onwheel(String value){
			return (HTMLHeadTagBuilder) super.onwheel(value);
		}
		
		/*
		 * Custom Attributes
		 */
		
		/** {@inheritDoc} */
		@Override
		public HTMLHeadTagBuilder attribute(String name, String value){
			return (HTMLHeadTagBuilder) super.attribute(name, value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLHeadTagBuilder attributes(Map<String, String> attributes){
			return (HTMLHeadTagBuilder) super.attributes(attributes);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLHeadTag build(){
			return new HTMLHeadTag(attributes, attributeWhitelist, subTagWhitelist, subTagBlacklist);
		}
	}
	
	/**
	 * Constructs a new {@link HTMLHeadTag} using the given parameters
	 *
	 * @param attributes The attributes for the {@link HTMLHeadTag}
	 * @param attributeWhitelist The Set of valid attributes for the {@link HTMLHeadTag}
	 * @param subTagWhitelist The Set of valid sub tags for the {@link HTMLHeadTag}
	 * @param subTagBlacklist The Set of invalid sub tags for the {@link HTMLHeadTag}
	 */
	private HTMLHeadTag(
			Map<String, String> attributes, Set<String> attributeWhitelist,
			Set<String> subTagWhitelist, Set<String> subTagBlacklist){
		super(HTML_HEAD_TAG_NAME, attributes, attributeWhitelist, true, subTagWhitelist, subTagBlacklist);
	}
	
	/**
	 * @return A {@link HTMLHeadTagBuilder builder} to use to build a {@link HTMLHeadTag}
	 */
	public static HTMLHeadTagBuilder builder(){
		return new HTMLHeadTagBuilder();
	}
}
