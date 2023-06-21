// Automatically generated - do not modify!

package web.cssom

import js.core.ArrayLike
import js.core.JsIterable

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
