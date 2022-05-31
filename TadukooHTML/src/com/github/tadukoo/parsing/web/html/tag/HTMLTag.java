package com.github.tadukoo.parsing.web.html.tag;

import com.github.tadukoo.parsing.web.html.tag.builder.BaseHTMLTagBuilder;
import com.github.tadukoo.util.StringUtil;
import com.github.tadukoo.util.map.MapUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Represents an HTML Tag (both opening and closing tag), e.g. {@code &lt;html lang="en-US">&lt;/html>}
 *
 * @author Logan Ferree (Tadukoo)
 * @version Alpha v.0.1
 */
public class HTMLTag implements HTMLTagConstants{
	
	/**
	 * {@inheritDoc}
	 *
	 * This extends the {@link BaseHTMLTagBuilder}, but adds a few more methods for configuring the {@link HTMLTag}.
	 * It adds the following parameters:
	 * <table>
	 *     <caption>HTML Tag Parameters</caption>
	 *     <tr>
	 *         <th>Parameter Name</th>
	 *         <th>Description</th>
	 *         <th>Default or Required</th>
	 *     </tr>
	 *     <tr>
	 *         <td>tagName</td>
	 *         <td>The name of the {@link HTMLTag}</td>
	 *         <td>Required</td>
	 *     </tr>
	 *     <tr>
	 *         <td>attributeWhitelist / validAttribute</td>
	 *         <td>The Set of valid attributes in the {@link HTMLTag}</td>
	 *         <td>Defaults to the default global attributes</td>
	 *     </tr>
	 *     <tr>
	 *         <td>closingTag</td>
	 *         <td>Whether or not to include a closing tag for this {@link HTMLTag}</td>
	 *         <td>Defaults to {@code true}</td>
	 *     </tr>
	 *     <tr>
	 *         <td>subTagWhitelist / validSubTag</td>
	 *         <td>The Set of valid sub tags for the {@link HTMLTag}</td>
	 *         <td>Defaults to an empty Set</td>
	 *     </tr>
	 *     <tr>
	 *         <td>subTagBlacklist / invalidSubTag</td>
	 *         <td>The Set of invalid sub tags for the {@link HTMLTag}</td>
	 *         <td>Defaults to an empty Set</td>
	 *     </tr>
	 * </table>
	 *
	 * @author Logan Ferree (Tadukoo)
	 * @version Alpha v.0.1
	 */
	public static class HTMLTagBuilder extends BaseHTMLTagBuilder{
		/** The name of the {@link HTMLTag} */
		private String tagName = null;
		/** Whether to include a closing tag for this {@link HTMLTag} or not */
		private boolean closingTag = true;
		
		/**
		 * @param tagName The name of the {@link HTMLTag}
		 * @return this, to continue building
		 */
		public HTMLTagBuilder tagName(String tagName){
			this.tagName = tagName;
			return this;
		}
		
		/*
		 * Global Attributes
		 */
		
		/** {@inheritDoc} */
		@Override
		public HTMLTagBuilder accesskey(String value){
			return (HTMLTagBuilder) super.accesskey(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLTagBuilder classAttribute(String value){
			return (HTMLTagBuilder) super.classAttribute(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLTagBuilder contenteditable(String value){
			return (HTMLTagBuilder) super.contenteditable(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLTagBuilder data(String dataTagName, String value){
			return (HTMLTagBuilder) super.data(dataTagName, value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLTagBuilder dir(String value){
			return (HTMLTagBuilder) super.dir(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLTagBuilder draggable(String value){
			return (HTMLTagBuilder) super.draggable(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLTagBuilder hidden(){
			return (HTMLTagBuilder) super.hidden();
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLTagBuilder id(String value){
			return (HTMLTagBuilder) super.id(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLTagBuilder lang(String value){
			return (HTMLTagBuilder) super.lang(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLTagBuilder spellcheck(String value){
			return (HTMLTagBuilder) super.spellcheck(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLTagBuilder style(String value){
			return (HTMLTagBuilder) super.style(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLTagBuilder tabindex(String value){
			return (HTMLTagBuilder) super.tabindex(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLTagBuilder title(String value){
			return (HTMLTagBuilder) super.title(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLTagBuilder translate(String value){
			return (HTMLTagBuilder) super.translate(value);
		}
		
		/*
		 * Global Drag Event Attributes
		 */
		
		/** {@inheritDoc} */
		@Override
		public HTMLTagBuilder ondrag(String value){
			return (HTMLTagBuilder) super.ondrag(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLTagBuilder ondragend(String value){
			return (HTMLTagBuilder) super.ondragend(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLTagBuilder ondragenter(String value){
			return (HTMLTagBuilder) super.ondragenter(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLTagBuilder ondragleave(String value){
			return (HTMLTagBuilder) super.ondragleave(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLTagBuilder ondragover(String value){
			return (HTMLTagBuilder) super.ondragover(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLTagBuilder ondragstart(String value){
			return (HTMLTagBuilder) super.ondragstart(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLTagBuilder ondrop(String value){
			return (HTMLTagBuilder) super.ondrop(value);
		}
		
		/*
		 * Global Clipboard Attributes
		 */
		
		/** {@inheritDoc} */
		@Override
		public HTMLTagBuilder oncopy(String value){
			return (HTMLTagBuilder) super.oncopy(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLTagBuilder oncut(String value){
			return (HTMLTagBuilder) super.oncut(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLTagBuilder onpaste(String value){
			return (HTMLTagBuilder) super.onpaste(value);
		}
		
		/*
		 * Other Global Event Attributes
		 */
		
		/** {@inheritDoc} */
		@Override
		public HTMLTagBuilder oncontextmenu(String value){
			return (HTMLTagBuilder) super.oncontextmenu(value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLTagBuilder onwheel(String value){
			return (HTMLTagBuilder) super.onwheel(value);
		}
		
		/*
		 * Custom Attributes
		 */
		
		/** {@inheritDoc} */
		@Override
		public HTMLTagBuilder attribute(String name, String value){
			return (HTMLTagBuilder) super.attribute(name, value);
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLTagBuilder attributes(Map<String, String> attributes){
			return (HTMLTagBuilder) super.attributes(attributes);
		}
		
		/**
		 * Adds the given attribute name to the whitelist
		 *
		 * @param attribute A valid attribute for the {@link HTMLTag}
		 * @return this, to continue building
		 */
		public HTMLTagBuilder validAttribute(String attribute){
			this.attributeWhitelist.add(attribute);
			return this;
		}
		
		/**
		 * Sets the attributes whitelist to the given Set
		 *
		 * @param attributeWhitelist The Set of valid attributes for the {@link HTMLTag}
		 * @return this, to continue building
		 */
		public HTMLTagBuilder attributeWhitelist(Set<String> attributeWhitelist){
			this.attributeWhitelist = attributeWhitelist;
			return this;
		}
		
		/**
		 * Sets it so the {@link HTMLTag} will have a closing tag
		 *
		 * @return this, to continue building
		 */
		public HTMLTagBuilder enableClosingTag(){
			closingTag = true;
			return this;
		}
		
		/**
		 * Sets it so the {@link HTMLTag} will not have a closing tag
		 *
		 * @return this, to continue building
		 */
		public HTMLTagBuilder disableClosingTag(){
			closingTag = false;
			return this;
		}
		
		/**
		 * @param closingTag Whether the {@link HTMLTag} should have a closing tag or not
		 * @return this, to continue building
		 */
		public HTMLTagBuilder closingTag(boolean closingTag){
			this.closingTag = closingTag;
			return this;
		}
		
		/**
		 * Adds the sub tag to the Set of valid sub tags for the {@link HTMLTag}
		 *
		 * @param validSubTag A valid sub tag for the {@link HTMLTag}
		 * @return this, to continue building
		 */
		public HTMLTagBuilder validSubTag(String validSubTag){
			this.subTagWhitelist.add(validSubTag);
			return this;
		}
		
		/**
		 * Sets the Set of valid sub tags for the {@link HTMLTag}
		 *
		 * @param subTagWhitelist The Set of valid sub tags for the {@link HTMLTag}
		 * @return this, to continue building
		 */
		public HTMLTagBuilder subTagWhitelist(Set<String> subTagWhitelist){
			this.subTagWhitelist = subTagWhitelist;
			return this;
		}
		
		/**
		 * Adds the sub tag to the Set of invalid sub tags for the {@link HTMLTag}
		 *
		 * @param invalidSubTag An invalid sub tag for the {@link HTMLTag}
		 * @return this, to continue building
		 */
		public HTMLTagBuilder invalidSubTag(String invalidSubTag){
			this.subTagBlacklist.add(invalidSubTag);
			return this;
		}
		
		/**
		 * Sets the Set of invalid sub tags for the {@link HTMLTag}
		 *
		 * @param subTagBlacklist The Set of invalid sub tags for the {@link HTMLTag}
		 * @return this, to continue building
		 */
		public HTMLTagBuilder subTagBlacklist(Set<String> subTagBlacklist){
			this.subTagBlacklist = subTagBlacklist;
			return this;
		}
		
		/**
		 * Checks for any errors in the set parameters and throws a {@link IllegalArgumentException} if any errors
		 * are found
		 */
		private void checkForErrors(){
			List<String> errors = new ArrayList<>();
			
			if(StringUtil.isBlank(tagName)){
				errors.add("tagName is required!");
			}
			
			// Report any errors
			if(!errors.isEmpty()){
				throw new IllegalArgumentException("Errors encountered in building a HTMLTag: \n" +
						StringUtil.buildStringWithNewLines(errors));
			}
		}
		
		/** {@inheritDoc} */
		@Override
		public HTMLTag build(){
			checkForErrors();
			
			return new HTMLTag(tagName, attributes, attributeWhitelist, closingTag, subTagWhitelist, subTagBlacklist);
		}
	}
	
	/** The name of this {@link HTMLTag} */
	private final String tagName;
	/** The Map of attributes in this {@link HTMLTag} */
	private final Map<String, String> attributes;
	/** The Set of valid attributes in this {@link HTMLTag} */
	private final Set<String> attributeWhitelist;
	/** Whether to include a closing tag for this {@link HTMLTag} or not */
	private final boolean closingTag;
	/** The Set of valid tags under this {@link HTMLTag} */
	private final Set<String> subTagWhitelist;
	/** The Set of invalid tags under this {@link HTMLTag} */
	private final Set<String> subTagBlacklist;
	
	/**
	 * Constructs an {@link HTMLTag} with the given parameters
	 *
	 * @param tagName The name of this {@link HTMLTag}
	 * @param attributes The Map of attributes in this {@link HTMLTag}
	 * @param attributeWhitelist The Set of valid attributes in this {@link HTMLTag}
	 * @param closingTag Whether to include a closing tag for this {@link HTMLTag} or not
	 * @param subTagWhitelist The Set of valid tags under this {@link HTMLTag}
	 * @param subTagBlacklist The Set of invalid tags under this {@link HTMLTag}
	 */
	protected HTMLTag(
			String tagName, Map<String, String> attributes, Set<String> attributeWhitelist, boolean closingTag,
			Set<String> subTagWhitelist, Set<String> subTagBlacklist){
		this.tagName = tagName;
		this.attributes = attributes;
		this.attributeWhitelist = attributeWhitelist;
		this.closingTag = closingTag;
		this.subTagWhitelist = subTagWhitelist;
		this.subTagBlacklist = subTagBlacklist;
	}
	
	/**
	 * @return A {@link HTMLTagBuilder builder} to use to build a custom {@link HTMLTag}
	 */
	public static HTMLTagBuilder tagBuilder(){
		return new HTMLTagBuilder();
	}
	
	/**
	 * @return The name of this {@link HTMLTag}
	 */
	public String getTagName(){
		return tagName;
	}
	
	/**
	 * @return The Map of attributes in this {@link HTMLTag}
	 */
	public Map<String, String> getAttributes(){
		return attributes;
	}
	
	/**
	 * @return The Set of valid attributes in this {@link HTMLTag}
	 */
	public Set<String> getAttributeWhitelist(){
		return attributeWhitelist;
	}
	
	/**
	 * @return Whether to include a closing tag for this {@link HTMLTag} or not
	 */
	public boolean hasClosingTag(){
		return closingTag;
	}
	
	/**
	 * @return The Set of valid tags under this {@link HTMLTag}
	 */
	public Set<String> getSubTagWhitelist(){
		return subTagWhitelist;
	}
	
	/**
	 * @return The Set of invalid tags under this {@link HTMLTag}
	 */
	public Set<String> getSubTagBlacklist(){
		return subTagBlacklist;
	}
	
	/**
	 * @return The String representing the opening tag for this {@link HTMLTag}
	 */
	public String toOpeningTag(){
		// Build opening tag
		StringBuilder tag = new StringBuilder("<");
		tag.append(tagName);
		
		// Add attributes if we have them
		if(MapUtil.isNotBlank(attributes)){
			for(String name: attributes.keySet().stream().sorted().toList()){
				String value = attributes.get(name);
				tag.append(' ').append(name);
				if(value != null){
					tag.append("=\"").append(value).append('"');
				}
			}
		}
		tag.append('>');
		
		return tag.toString();
	}
	
	/**
	 * @return The String representing the closing tag for this {@link HTMLTag} (may be empty if no closing tag)
	 */
	public String toClosingTag(){
		return closingTag?"</" + tagName + ">":"";
	}
	
	/**
	 * @return The String representing the opening tag with the closing tag appended for this {@link HTMLTag}
	 */
	public String toString(){
		return toOpeningTag() + toClosingTag();
	}
}
