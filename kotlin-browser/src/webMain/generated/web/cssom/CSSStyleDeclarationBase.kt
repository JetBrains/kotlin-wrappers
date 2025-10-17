// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.cssom

import js.array.ArrayLike
import kotlin.js.JsString
import kotlin.js.definedExternally

/**
 * The **`CSSStyleDeclaration`** interface is the base class for objects that represent CSS declaration blocks with different supported sets of CSS style information:
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleDeclaration)
 */
/* mixin */
sealed
external interface CSSStyleDeclarationBase :
    ArrayLike<JsString> {
    /**
     * The **`cssText`** property of the CSSStyleDeclaration interface returns or sets the text of the element's **inline** style declaration only.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleDeclaration/cssText)
     */
    var cssText: String
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The read-only property returns an integer that represents the number of style declarations in this CSS declaration block.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleDeclaration/length)
     */
    override val length: Int
        get() = definedExternally

    /**
     * The **CSSStyleDeclaration.parentRule** read-only property returns a CSSRule that is the parent of this style block, e.g., a CSSStyleRule representing the style for a CSS selector.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleDeclaration/parentRule)
     */
    val parentRule: CSSRule?
        get() = definedExternally

    /**
     * The **CSSStyleDeclaration.getPropertyPriority()** method interface returns a string that provides all explicitly set priorities on the CSS property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleDeclaration/getPropertyPriority)
     */
    fun getPropertyPriority(property: String): String = definedExternally

    /**
     * The **CSSStyleDeclaration.getPropertyValue()** method interface returns a string containing the value of a specified CSS property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleDeclaration/getPropertyValue)
     */
    fun getPropertyValue(property: String): String = definedExternally

    /**
     * The `CSSStyleDeclaration.item()` method interface returns a CSS property name from a CSSStyleDeclaration by index.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleDeclaration/item)
     */
    fun item(index: Int): String = definedExternally

    /**
     * The **`CSSStyleDeclaration.removeProperty()`** method interface removes a property from a CSS style declaration object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleDeclaration/removeProperty)
     */
    fun removeProperty(property: String): String = definedExternally

    /**
     * The **`CSSStyleDeclaration.setProperty()`** method interface sets a new value for a property on a CSS style declaration object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleDeclaration/setProperty)
     */
    fun setProperty(
        property: String,
        value: String?,
        priority: String = definedExternally,
    ): Unit = definedExternally
}
