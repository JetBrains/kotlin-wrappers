// Automatically generated - do not modify!

package web.cssom

/**
 * The **`CSSScopeRule`** interface of the CSS Object Model represents a CSS @scope at-rule.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSScopeRule)
 */
open external class CSSScopeRule
private constructor() :
    CSSGroupingRule {
    /**
     * The **`end`** property of the CSSScopeRule interface returns a string containing the value of the `@scope` at-rule's scope limit.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSScopeRule/end)
     */
    val end: String?

    /**
     * The **`start`** property of the CSSScopeRule interface returns a string containing the value of the `@scope` at-rule's scope root.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSScopeRule/start)
     */
    val start: String?
}
