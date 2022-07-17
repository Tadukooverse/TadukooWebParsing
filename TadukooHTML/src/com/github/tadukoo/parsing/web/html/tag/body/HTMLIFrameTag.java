package com.github.tadukoo.parsing.web.html.tag.body;

import com.github.tadukoo.parsing.web.html.tag.HTMLTag;
import com.github.tadukoo.parsing.web.html.tag.builder.BaseLoadableHTMLTagBuilder;

import java.util.Map;
import java.util.Set;

/**
 * An {@link HTMLTag} representing a {@code &lt;iframe>} tag in an HTML Document
 *
 * @author Logan Ferree (Tadukoo)
 * @version Alpha v.0.1
 */
public class HTMLIFrameTag extends HTMLTag{
	
	/**
	 * A builder to use to build a {@link HTMLIFrameTag}. It contains the methods from
	 * {@link BaseLoadableHTMLTagBuilder}.
	 * <br><br>
	 * It also sets content as a valid subTag in the whitelist.
	 *
	 * @author Logan Ferree (Tadukoo)
	 * @version Alpha v.0.1
	 */
	public static class HTMLIFrameTagBuilder extends BaseLoadableHTMLTagBuilder{
		
		/** Not allowed to instantiate outside {@link HTMLIFrameTag} */
		private HTMLIFrameTagBuilder(){
			super();
			subTagWhitelist.add(HTML_CONTENT_NAME);
		}
		
		/*
		 * Global Attributes
		 */
		
		/** {@inheritDoc} */
		@Override
		public HTMLIFrameTagBuilder accesskey(String value){
			return (HTMLIFrameTagBuilder) super.accesskey(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLIFrameTagBuilder classAttribute(String value){
			return (HTMLIFrameTagBuilder) super.classAttribute(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLIFrameTagBuilder contenteditable(String value){
			return (HTMLIFrameTagBuilder) super.contenteditable(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLIFrameTagBuilder data(String dataTagName, String value){
			return (HTMLIFrameTagBuilder) super.data(dataTagName, value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLIFrameTagBuilder dir(String value){
			return (HTMLIFrameTagBuilder) super.dir(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLIFrameTagBuilder draggable(String value){
			return (HTMLIFrameTagBuilder) super.draggable(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLIFrameTagBuilder hidden(){
			return (HTMLIFrameTagBuilder) super.hidden();
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLIFrameTagBuilder id(String value){
			return (HTMLIFrameTagBuilder) super.id(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLIFrameTagBuilder lang(String value){
			return (HTMLIFrameTagBuilder) super.lang(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLIFrameTagBuilder spellcheck(String value){
			return (HTMLIFrameTagBuilder) super.spellcheck(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLIFrameTagBuilder style(String value){
			return (HTMLIFrameTagBuilder) super.style(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLIFrameTagBuilder tabindex(String value){
			return (HTMLIFrameTagBuilder) super.tabindex(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLIFrameTagBuilder title(String value){
			return (HTMLIFrameTagBuilder) super.title(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLIFrameTagBuilder translate(String value){
			return (HTMLIFrameTagBuilder) super.translate(value);
		}
		
		/*
		 * Global Drag Event Attributes
		 */
		
		/** {@inheritDoc} */
		@Override
		public HTMLIFrameTagBuilder ondrag(String value){
			return (HTMLIFrameTagBuilder) super.ondrag(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLIFrameTagBuilder ondragend(String value){
			return (HTMLIFrameTagBuilder) super.ondragend(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLIFrameTagBuilder ondragenter(String value){
			return (HTMLIFrameTagBuilder) super.ondragenter(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLIFrameTagBuilder ondragleave(String value){
			return (HTMLIFrameTagBuilder) super.ondragleave(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLIFrameTagBuilder ondragover(String value){
			return (HTMLIFrameTagBuilder) super.ondragover(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLIFrameTagBuilder ondragstart(String value){
			return (HTMLIFrameTagBuilder) super.ondragstart(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLIFrameTagBuilder ondrop(String value){
			return (HTMLIFrameTagBuilder) super.ondrop(value);
		}
		
		/*
		 * Global Clipboard Attributes
		 */
		
		/** {@inheritDoc} */
		@Override
		public HTMLIFrameTagBuilder oncopy(String value){
			return (HTMLIFrameTagBuilder) super.oncopy(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLIFrameTagBuilder oncut(String value){
			return (HTMLIFrameTagBuilder) super.oncut(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLIFrameTagBuilder onpaste(String value){
			return (HTMLIFrameTagBuilder) super.onpaste(value);
		}
		
		/*
		 * Global Other Event Attributes
		 */
		
		/** {@inheritDoc} */
		@Override
		public HTMLIFrameTagBuilder oncontextmenu(String value){
			return (HTMLIFrameTagBuilder) super.oncontextmenu(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLIFrameTagBuilder onwheel(String value){
			return (HTMLIFrameTagBuilder) super.onwheel(value);
		}
		
		/*
		 * Custom Attributes
		 */
		
		/** {@inheritDoc} */
		@Override
		public HTMLIFrameTagBuilder attribute(String name, String value){
			return (HTMLIFrameTagBuilder) super.attribute(name, value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLIFrameTagBuilder attributes(Map<String, String> attributes){
			return (HTMLIFrameTagBuilder) super.attributes(attributes);
		}
		
		/*
		 * Global Load Event Attribute Names - apply to some html tags
		 * - only to <body>, <frame>, <frameset>, <iframe>, <img>, <input type="image">, <link>, <script> and <style>
		 */
		
		/** {@inheritDoc} */
		@Override
		public HTMLIFrameTagBuilder onload(String value){
			return (HTMLIFrameTagBuilder) super.onload(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLIFrameTagBuilder onunload(String value){
			return (HTMLIFrameTagBuilder) super.onunload(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLIFrameTag build(){
			return new HTMLIFrameTag(attributes, attributeWhitelist, subTagWhitelist, subTagBlacklist);
		}
	}
	
	/**
	 * Constructs an {@link HTMLIFrameTag} with the given parameters
	 *
	 * @param attributes The Map of attributes in this {@link HTMLIFrameTag}
	 * @param attributeWhitelist The Set of valid attributes in this {@link HTMLIFrameTag}
	 * @param subTagWhitelist The Set of valid tags under this {@link HTMLIFrameTag}
	 * @param subTagBlacklist The Set of invalid tags under this {@link HTMLIFrameTag}
	 */
	private HTMLIFrameTag(
			Map<String, String> attributes, Set<String> attributeWhitelist,
			Set<String> subTagWhitelist, Set<String> subTagBlacklist){
		super(HTML_INLINE_FRAME_TAG_NAME, attributes, attributeWhitelist, true,
				subTagWhitelist, subTagBlacklist);
	}
	
	/**
	 * @return A {@link HTMLIFrameTagBuilder builder} to use to build a {@link HTMLIFrameTag}
	 */
	public static HTMLIFrameTagBuilder builder(){
		return new HTMLIFrameTagBuilder();
	}
}
