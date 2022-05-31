package com.github.tadukoo.parsing.web.html.tag;

import com.github.tadukoo.parsing.web.html.tag.builder.BaseFocusableAndLoadableHTMLTagBuilder;

import java.util.Map;
import java.util.Set;

public class HTMLBodyTag extends HTMLTag{
	
	public static class HTMLBodyTagBuilder extends BaseFocusableAndLoadableHTMLTagBuilder{
		
		/** Not allowed to instantiate outside {@link HTMLBodyTag} */
		private HTMLBodyTagBuilder(){
			super();
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
