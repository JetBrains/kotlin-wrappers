// Automatically generated - do not modify!

package web.cssom

/**
 * The **`CSSStyleRule`** interface represents a single CSS style rule.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleRule)
 */
open external class CSSStyleRule
private constructor() :
    CSSGroupingRule {
    /**
     * The **`selectorText`** property of the CSSStyleRule interface gets and sets the selectors associated with the `CSSStyleRule`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleRule/selectorText)
     */
    var selectorText: String

    /**
     * The read-only **`style`** property is a CSSStyleProperties object that represents the inline styles of a style rule (CSSStyleRule).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleRule/style)
     */
    val style: CSSStyleDeclaration

    /**
     * The **`styleMap`** read-only property of the CSSStyleRule interface returns a StylePropertyMap object which provides access to the rule's property-value pairs.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleRule/styleMap)
     */
    val styleMap: StylePropertyMap
}
