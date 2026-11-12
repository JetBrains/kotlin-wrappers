// Automatically generated - do not modify!

package web.cssom

/**
 * The **`CSSImportRule`** interface represents an @import at-rule.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSImportRule)
 */
open external class CSSImportRule
private constructor() :
    CSSRule {
    /**
     * The read-only **`href`** property of the CSSImportRule interface returns the URL specified by the @import at-rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSImportRule/href)
     */
    open val href: String

    /**
     * The read-only **`layerName`** property of the CSSImportRule interface returns the name of the cascade layer created by the @import at-rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSImportRule/layerName)
     */
    open val layerName: String?

    /**
     * The read-only **`media`** property of the CSSImportRule interface returns a MediaList object representing the media query list of the @import rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSImportRule/media)
     */
    open val media: MediaList

    /**
     * The read-only **`styleSheet`** property of the CSSImportRule interface returns the CSS Stylesheet specified by the @import at-rule. This will be in the form of a CSSStyleSheet object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSImportRule/styleSheet)
     */
    open val styleSheet: CSSStyleSheet?

    /**
     * The read-only **`supportsText`** property of the CSSImportRule interface returns the supports condition specified by the @import at-rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSImportRule/supportsText)
     */
    open val supportsText: String?
}
