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
     * The read-only **`style`** property of the CSSPageRule interface contains a CSSPageDescriptors object representing the descriptors available in the @page rule's body.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPageRule/style)
     */
    val style: CSSPageDescriptors
}
