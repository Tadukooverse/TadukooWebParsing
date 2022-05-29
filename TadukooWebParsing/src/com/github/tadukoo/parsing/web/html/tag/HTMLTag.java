package com.github.tadukoo.parsing.web.html.tag;

import com.github.tadukoo.util.StringUtil;
import com.github.tadukoo.util.map.MapUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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
	 * A base class to be used for building {@link HTMLTag HTMLTags}. It contains methods for specifying
	 * attributes, including methods for the global attributes in HTML.
	 *
	 * It provides methods for the following global attributes, along with a few methods for custom attributes.
	 * Note that there are no default or required attributes
	 * <table>
	 *     <caption>HTML Attribute Options</caption>
	 *     <tr>
	 *         <th>Attribute Name</th>
	 *         <th>Description</th>
	 *     </tr>
	 *     <tr>
	 *         <td>{@link #ACCESS_KEY_ATTRIBUTE_NAME accesskey}</td>
	 *         <td>Specifies a shortcut key to activate/focus an element</td>
	 *     </tr>
	 *     <tr>
	 *         <td>{@link #CLASS_ATTRIBUTE_NAME class}</td>
	 *         <td>Specifies one or more classnames for an element (refers to a class in a style sheet)</td>
	 *     </tr>
	 *     <tr>
	 *         <td>{@link #CONTENT_EDITABLE_ATTRIBUTE_NAME contenteditable}</td>
	 *         <td>Specifies whether the content of an element is editable or not</td>
	 *     </tr>
	 *     <tr>
	 *         <td>{@link #DATA_ATTRIBUTE_NAME_PREFIX data}</td>
	 *         <td>Used to store custom data private to the page or application</td>
	 *     </tr>
	 *     <tr>
	 *         <td>{@link #DIR_ATTRIBUTE_NAME dir}</td>
	 *         <td>Specifies the text direction for the content in an element</td>
	 *     </tr>
	 *     <tr>
	 *         <td>{@link #DRAGGABLE_ATTRIBUTE_NAME draggable}</td>
	 *         <td>Specifies whether an element is draggable or not</td>
	 *     </tr>
	 *     <tr>
	 *         <td>{@link #HIDDEN_ATTRIBUTE_NAME hidden}</td>
	 *         <td>Specifies that an element is not yet, or is no longer, relevant</td>
	 *     </tr>
	 *     <tr>
	 *         <td>{@link #ID_ATTRIBUTE_NAME id}</td>
	 *         <td>Specifies a unique id for an element</td>
	 *     </tr>
	 *     <tr>
	 *         <td>{@link #LANG_ATTRIBUTE_NAME lang}</td>
	 *         <td>Specifies the language of the element's content</td>
	 *     </tr>
	 *     <tr>
	 *         <td>{@link #SPELLCHECK_ATTRIBUTE_NAME spellcheck}</td>
	 *         <td>Specifies whether the element is to have its spelling and grammar checked or not</td>
	 *     </tr>
	 *     <tr>
	 *         <td>{@link #STYLE_ATTRIBUTE_NAME style}</td>
	 *         <td>Specifies an inline CSS style for an element</td>
	 *     </tr>
	 *     <tr>
	 *         <td>{@link #TAB_INDEX_ATTRIBUTE_NAME tabindex}</td>
	 *         <td>Specifies the tabbing order of an element</td>
	 *     </tr>
	 *     <tr>
	 *         <td>{@link #TITLE_ATTRIBUTE_NAME title}</td>
	 *         <td>Specifies extra information about an element</td>
	 *     </tr>
	 *     <tr>
	 *         <td>{@link #TRANSLATE_ATTRIBUTE_NAME translate}</td>
	 *         <td>Specifies whether the content of an element should be translated or not</td>
	 *     </tr>
	 * </table>
	 *
	 * @author Logan Ferree (Tadukoo)
	 * @version Alpha v.0.1
	 */
	protected static abstract class BaseHTMLTagBuilder{
		/** The List of attributes in the {@link HTMLTag} */
		protected Map<String, String> attributes = new HashMap<>();
		/** The Set of valid attributes in the {@link HTMLTag} */
		protected Set<String> attributeWhitelist = new HashSet<>();
		/** The Set of valid tags under the {@link HTMLTag} */
		protected Set<String> subTagWhitelist = new HashSet<>();
		/** The Set of invalid tags under the {@link HTMLTag} */
		protected Set<String> subTagBlacklist = new HashSet<>();
		
		/** Not allowed to instantiate outside here and extensions */
		protected BaseHTMLTagBuilder(){
			attributeWhitelist.addAll(GLOBAL_ATTRIBUTE_WHITELIST);
		}
		
		/*
		 * Global Attributes
		 */
		
		/**
		 * Specifies the value for the {@link #ACCESS_KEY_ATTRIBUTE_NAME accesskey attribute},
		 * which specifies a shortcut key to activate/focus an element
		 *
		 * @param value The value for the {@code accesskey} attribute for the {@link HTMLTag}
		 * @return this, to continue building
		 */
		public BaseHTMLTagBuilder accesskey(String value){
			attributes.put(ACCESS_KEY_ATTRIBUTE_NAME, value);
			return this;
		}
		
		/**
		 * Specifies the value for the {@link #CLASS_ATTRIBUTE_NAME class attribute},
		 * which specifies one or more classnames for an element (refers to a class in a style sheet)
		 *
		 * @param value The value for the {@code class} attribute for the {@link HTMLTag}
		 * @return this, to continue building
		 */
		public BaseHTMLTagBuilder classAttribute(String value){
			attributes.put(CLASS_ATTRIBUTE_NAME, value);
			return this;
		}
		
		/**
		 * Specifies the value for the {@link #CONTENT_EDITABLE_ATTRIBUTE_NAME contenteditable attribute},
		 * which specifies whether the content of an element is editable or not
		 *
		 * @param value The value for the {@code contenteditable} attribute for the {@link HTMLTag}
		 * @return this, to continue building
		 */
		public BaseHTMLTagBuilder contenteditable(String value){
			attributes.put(CONTENT_EDITABLE_ATTRIBUTE_NAME, value);
			return this;
		}
		
		/**
		 * Specifies a {@link #DATA_ATTRIBUTE_NAME_PREFIX data attribute},
		 * which is used to store custom data private to the page or application
		 *
		 * @param dataTagName The rest of the tag name (to add to {@code data-} to form the full attribute name)
		 * @param value The value for the {@code data} attribute for the {@link HTMLTag}
		 * @return this, to continue building
		 */
		public BaseHTMLTagBuilder data(String dataTagName, String value){
			attributes.put(DATA_ATTRIBUTE_NAME_PREFIX + dataTagName, value);
			return this;
		}
		
		/**
		 * Specifies a {@link #DIR_ATTRIBUTE_NAME dir attribute},
		 * which specifies the text direction for the content in an element
		 *
		 * @param value The value for the {@code dir} attribute for the {@link HTMLTag}
		 * @return this, to continue building
		 */
		public BaseHTMLTagBuilder dir(String value){
			attributes.put(DIR_ATTRIBUTE_NAME, value);
			return this;
		}
		
		/**
		 * Specifies a {@link #DRAGGABLE_ATTRIBUTE_NAME draggable attribute},
		 * which specifies whether an element is draggable or not
		 *
		 * @param value The value for the {@code draggable} attribute for the {@link HTMLTag}
		 * @return this, to continue building
		 */
		public BaseHTMLTagBuilder draggable(String value){
			attributes.put(DRAGGABLE_ATTRIBUTE_NAME, value);
			return this;
		}
		
		/**
		 * Specifies a {@link #HIDDEN_ATTRIBUTE_NAME hidden attribute},
		 * which specifies that an element is not yet, or is no longer, relevant
		 *
		 * @return this, to continue building
		 */
		public BaseHTMLTagBuilder hidden(){
			attributes.put(HIDDEN_ATTRIBUTE_NAME, null);
			return this;
		}
		
		/**
		 * Specifies a {@link #ID_ATTRIBUTE_NAME id attribute},
		 * which specifies a unique id for an element
		 *
		 * @param value The value for the {@code id} attribute for the {@link HTMLTag}
		 * @return this, to continue building
		 */
		public BaseHTMLTagBuilder id(String value){
			attributes.put(ID_ATTRIBUTE_NAME, value);
			return this;
		}
		
		/**
		 * Specifies a {@link #LANG_ATTRIBUTE_NAME lang attribute},
		 * which specifies the language of the element's content
		 *
		 * @param value The value of the {@code lang} attribute for the {@link HTMLTag}
		 * @return this, to continue building
		 */
		public BaseHTMLTagBuilder lang(String value){
			attributes.put(LANG_ATTRIBUTE_NAME, value);
			return this;
		}
		
		/**
		 * Specifies a {@link #SPELLCHECK_ATTRIBUTE_NAME spellcheck attribute},
		 * which specifies whether the element is to have its spelling and grammar checked or not
		 *
		 * @param value The value of the {@code spellcheck} attribute for the {@link HTMLTag}
		 * @return this, to continue building
		 */
		public BaseHTMLTagBuilder spellcheck(String value){
			attributes.put(SPELLCHECK_ATTRIBUTE_NAME, value);
			return this;
		}
		
		/**
		 * Specifies a {@link #STYLE_ATTRIBUTE_NAME style attribute},
		 * which specifies an inline CSS style for an element
		 *
		 * @param value The value of the {@code style} attribute for the {@link HTMLTag}
		 * @return this, to continue building
		 */
		public BaseHTMLTagBuilder style(String value){
			attributes.put(STYLE_ATTRIBUTE_NAME, value);
			return this;
		}
		
		/**
		 * Specifies a {@link #TAB_INDEX_ATTRIBUTE_NAME tabindex attribute},
		 * which specifies the tabbing order of an element
		 *
		 * @param value The value of the {@code tabindex} attribute for the {@link HTMLTag}
		 * @return this, to continue building
		 */
		public BaseHTMLTagBuilder tabindex(String value){
			attributes.put(TAB_INDEX_ATTRIBUTE_NAME, value);
			return this;
		}
		
		/**
		 * Specifies a {@link #TITLE_ATTRIBUTE_NAME title attribute},
		 * which specifies extra information about an element
		 *
		 * @param value The value of the {@code title} attribute for the {@link HTMLTag}
		 * @return this, to continue building
		 */
		public BaseHTMLTagBuilder title(String value){
			attributes.put(TITLE_ATTRIBUTE_NAME, value);
			return this;
		}
		
		/**
		 * Specifies a {@link #TRANSLATE_ATTRIBUTE_NAME translate attribute},
		 * which specifies whether the content of an element should be translated or not
		 *
		 * @param value The value of the {@code translate} attribute for the {@link HTMLTag}
		 * @return this, to continue building
		 */
		public BaseHTMLTagBuilder translate(String value){
			attributes.put(TRANSLATE_ATTRIBUTE_NAME, value);
			return this;
		}
		
		/*
		 * Custom Attributes
		 */
		
		/**
		 * Used to add an attribute for the {@link HTMLTag}
		 *
		 * @param name The name of the attribute
		 * @param value The value for the attribute
		 * @return this, to continue building
		 */
		public BaseHTMLTagBuilder attribute(String name, String value){
			this.attributes.put(name, value);
			return this;
		}
		
		/**
		 * Used to set the attributes for the {@link HTMLTag}
		 *
		 * @param attributes The {@link Map} of attributes
		 * @return this, to continue building
		 */
		public BaseHTMLTagBuilder attributes(Map<String, String> attributes){
			this.attributes = attributes;
			return this;
		}
		
		/**
		 * Builds a new {@link HTMLTag} after checking for any errors in the set parameters
		 *
		 * @return The newly built {@link HTMLTag}
		 */
		public abstract HTMLTag build();
	}
	
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
		public HTMLTagBuilder accesskey(String value){
			return (HTMLTagBuilder) super.accesskey(value);
		}
		
		/** {@inheritDoc} */
		public HTMLTagBuilder classAttribute(String value){
			return (HTMLTagBuilder) super.classAttribute(value);
		}
		
		/** {@inheritDoc} */
		public HTMLTagBuilder contenteditable(String value){
			return (HTMLTagBuilder) super.contenteditable(value);
		}
		
		/** {@inheritDoc} */
		public HTMLTagBuilder data(String dataTagName, String value){
			return (HTMLTagBuilder) super.data(dataTagName, value);
		}
		
		/** {@inheritDoc} */
		public HTMLTagBuilder dir(String value){
			return (HTMLTagBuilder) super.dir(value);
		}
		
		/** {@inheritDoc} */
		public HTMLTagBuilder draggable(String value){
			return (HTMLTagBuilder) super.draggable(value);
		}
		
		/** {@inheritDoc} */
		public HTMLTagBuilder hidden(){
			return (HTMLTagBuilder) super.hidden();
		}
		
		/** {@inheritDoc} */
		public HTMLTagBuilder id(String value){
			return (HTMLTagBuilder) super.id(value);
		}
		
		/** {@inheritDoc} */
		public HTMLTagBuilder lang(String value){
			return (HTMLTagBuilder) super.lang(value);
		}
		
		/** {@inheritDoc} */
		public HTMLTagBuilder spellcheck(String value){
			return (HTMLTagBuilder) super.spellcheck(value);
		}
		
		/** {@inheritDoc} */
		public HTMLTagBuilder style(String value){
			return (HTMLTagBuilder) super.style(value);
		}
		
		/** {@inheritDoc} */
		public HTMLTagBuilder tabindex(String value){
			return (HTMLTagBuilder) super.tabindex(value);
		}
		
		/** {@inheritDoc} */
		public HTMLTagBuilder title(String value){
			return (HTMLTagBuilder) super.title(value);
		}
		
		/** {@inheritDoc} */
		public HTMLTagBuilder translate(String value){
			return (HTMLTagBuilder) super.translate(value);
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
