// Automatically generated - do not modify!

package web.cssom

/**
 * The **`CSSPositionTryRule`** interface describes an object representing a @position-try at-rule.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPositionTryRule)
 */
open external class CSSPositionTryRule
private constructor() :
    CSSRule {
    /**
     * The **`name`** read-only property of the CSSPositionTryRule interface represents the name of the position try fallback option specified by the `@position-try` at-rule's dashed-ident.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPositionTryRule/name)
     */
    val name: String

    /**
     * The **`style`** read-only property of the CSSPositionTryRule interface returns a CSSPositionTryDescriptors object representing the declarations set in the body of the `@position-try` at-rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPositionTryRule/style)
     */
    val style: CSSPositionTryDescriptors
}
