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
    val href: String

    /**
     * The read-only **`layerName`** property of the CSSImportRule interface returns the name of the cascade layer created by the @import at-rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSImportRule/layerName)
     */
    val layerName: String?

    /**
     * The read-only **`media`** property of the CSSImportRule interface returns a MediaList object, containing the value of the `media` attribute of the associated stylesheet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSImportRule/media)
     */
    val media: MediaList

    /**
     * The read-only **`styleSheet`** property of the CSSImportRule interface returns the CSS Stylesheet specified by the @import at-rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSImportRule/styleSheet)
     */
    val styleSheet: CSSStyleSheet?

    /**
     * The read-only **`supportsText`** property of the CSSImportRule interface returns the supports condition specified by the @import at-rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSImportRule/supportsText)
     */
    val supportsText: String?
}
