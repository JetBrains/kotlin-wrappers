// Automatically generated - do not modify!

package web.cssom

import js.array.ArrayLike
import js.core.JsString
import js.iterable.JsIterable
import kotlin.js.definedExternally

/**
 * The **`CSSStyleDeclaration`** interface represents an object that is a CSS declaration block, and exposes style information and various style-related methods and properties.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleDeclaration)
 */
open external class CSSStyleDeclaration
private constructor() :
    ArrayLike<JsString>,
    JsIterable<JsString> {
    /**
     * The **`cssText`** property of the CSSStyleDeclaration interface returns or sets the text of the element's **inline** style declaration only.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleDeclaration/cssText)
     */
    var cssText: String

    /**
     * The read-only property returns an integer that represents the number of style declarations in this CSS declaration block.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleDeclaration/length)
     */
    override val length: Int

    /**
     * The **CSSStyleDeclaration.parentRule** read-only property returns a CSSRule that is the parent of this style block, e.g., a CSSStyleRule representing the style for a CSS selector.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleDeclaration/parentRule)
     */
    val parentRule: CSSRule?

    /**
     * The **CSSStyleDeclaration.getPropertyPriority()** method interface returns a string that provides all explicitly set priorities on the CSS property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleDeclaration/getPropertyPriority)
     */
    fun getPropertyPriority(property: String): String

    /**
     * The **CSSStyleDeclaration.getPropertyValue()** method interface returns a string containing the value of a specified CSS property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleDeclaration/getPropertyValue)
     */
    fun getPropertyValue(property: String): String

    /**
     * The `CSSStyleDeclaration.item()` method interface returns a CSS property name from a CSSStyleDeclaration by index.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleDeclaration/item)
     */
    fun item(index: Int): String

    /**
     * The **`CSSStyleDeclaration.removeProperty()`** method interface removes a property from a CSS style declaration object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleDeclaration/removeProperty)
     */
    fun removeProperty(property: String): String

    /**
     * The **`CSSStyleDeclaration.setProperty()`** method interface sets a new value for a property on a CSS style declaration object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleDeclaration/setProperty)
     */
    fun setProperty(
        property: String,
        value: String?,
        priority: String = definedExternally,
    )
}
