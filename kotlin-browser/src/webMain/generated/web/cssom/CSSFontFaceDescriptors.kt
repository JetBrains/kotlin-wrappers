// Automatically generated - do not modify!

package web.cssom

/**
 * The **`CSSFontFaceDescriptors`** interface represents a CSS declaration block for an @font-face at-rule.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSFontFaceDescriptors)
 */
open external class CSSFontFaceDescriptors
private constructor() :
    CSSStyleDeclarationBase {
    open var `font-display`: String
    open var `font-family`: String
    open var `font-feature-settings`: String
    open var `font-stretch`: String
    open var `font-style`: String
    open var `font-weight`: String
    open var `font-width`: String
    open var fontDisplay: String
    open var fontFamily: String
    open var fontFeatureSettings: String
    open var fontStretch: String
    open var fontStyle: String
    open var fontWeight: String
    open var fontWidth: String
    open var `size-adjust`: String
    open var sizeAdjust: String
    open var src: String
    open var `unicode-range`: String
    open var unicodeRange: String

    /* `CSSStyleDeclarationBase` overrides */

    override var cssText: String
    override val length: Int
    override val parentRule: CSSRule?
    override fun getPropertyPriority(property: String): String
    override fun getPropertyValue(property: String): String
    override fun item(index: Int): String
    override fun removeProperty(property: String): String
    override fun setProperty(
        property: String,
        value: String?,
        priority: String,
    )
}
