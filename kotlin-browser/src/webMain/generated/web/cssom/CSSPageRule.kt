// Automatically generated - do not modify!

package web.cssom

/**
 * **`CSSPageRule`** represents a single CSS @page rule.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPageRule)
 */
open external class CSSPageRule
private constructor() :
    CSSGroupingRule {
    /**
     * The **`selectorText`** property of the CSSPageRule interface gets and sets the selectors associated with the CSSPageRule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPageRule/selectorText)
     */
    var selectorText: String

    /**
     * The **`style`** read-only property of the CSSPageRule interface returns a CSSPageDescriptors object. This represents a CSS declaration block for a CSS @page at-rule, and exposes style information and various style-related methods and properties for the page.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPageRule/style)
     */
    val style: CSSPageDescriptors
}
