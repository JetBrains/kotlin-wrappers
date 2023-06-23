// Automatically generated - do not modify!

package web.cssom

/**
 * An object representing a set of style for a given keyframe. It corresponds to the contains of a single keyframe of a @keyframes at-rule. It implements the CSSRule interface with a type value of 8 (CSSRule.KEYFRAME_RULE).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeyframeRule)
 */
sealed external class CSSKeyframeRule :
    CSSRule {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeyframeRule/keyText) */
    var keyText: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeyframeRule/style) */
    val style: CSSStyleDeclaration
}
