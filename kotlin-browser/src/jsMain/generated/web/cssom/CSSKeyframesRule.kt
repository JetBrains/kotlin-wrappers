// Automatically generated - do not modify!

package web.cssom

import js.core.ArrayLike
import js.iterable.JsIterable

/**
 * An object representing a complete set of keyframes for a CSS animation. It corresponds to the contains of a whole @keyframes at-rule. It implements the CSSRule interface with a type value of 7 (CSSRule.KEYFRAMES_RULE).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeyframesRule)
 */
sealed external class CSSKeyframesRule :
    CSSRule,
    ArrayLike<CSSKeyframeRule>,
    JsIterable<CSSKeyframeRule> {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeyframesRule/cssRules) */
    val cssRules: CSSRuleList

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeyframesRule/name) */
    var name: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeyframesRule/appendRule) */
    fun appendRule(rule: String)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeyframesRule/deleteRule) */
    fun deleteRule(select: String)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeyframesRule/findRule) */
    fun findRule(select: String): CSSKeyframeRule?
}
