// Automatically generated - do not modify!

package web.cssom

/**
 * The **`CSSPropertyRule`** interface of the CSS Properties and Values API represents a single CSS @property rule.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPropertyRule)
 */
open external class CSSPropertyRule
private constructor() :
    CSSRule {
    /**
     * The read-only **`inherits`** property of the CSSPropertyRule interface returns the inherit flag of the custom property registration represented by the @property rule, a boolean describing whether or not the property inherits by default.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPropertyRule/inherits)
     */
    val inherits: Boolean

    /**
     * The read-only **`initialValue`** nullable property of the CSSPropertyRule interface returns the initial value of the custom property registration represented by the @property rule, controlling the property's initial value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPropertyRule/initialValue)
     */
    val initialValue: String?

    /**
     * The read-only **`name`** property of the CSSPropertyRule interface represents the property name, this being the serialization of the name given to the custom property in the @property rule's prelude.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPropertyRule/name)
     */
    val name: String

    /**
     * The read-only **`syntax`** property of the CSSPropertyRule interface returns the literal syntax of the custom property registration represented by the @property rule, controlling how the property's value is parsed at computed-value time.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPropertyRule/syntax)
     */
    val syntax: String
}
