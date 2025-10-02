// Automatically generated - do not modify!

package web.cssom

/**
 * The **`CSSKeyframeRule`** interface describes an object representing a set of styles for a given keyframe.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeyframeRule)
 */
open external class CSSKeyframeRule
private constructor() :
    CSSRule {
    /**
     * The **`keyText`** property of the CSSKeyframeRule interface represents the keyframe selector as a comma-separated list of percentage values.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeyframeRule/keyText)
     */
    var keyText: String

    /**
     * The read-only **`CSSKeyframeRule.style`** property is the CSSStyleDeclaration interface for the declaration block of the CSSKeyframeRule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeyframeRule/style)
     */
    val style: CSSStyleDeclaration
}
