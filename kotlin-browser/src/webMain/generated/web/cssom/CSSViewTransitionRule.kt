// Automatically generated - do not modify!

package web.cssom

import js.array.ReadonlyArray
import kotlin.js.JsString

/**
 * The **`CSSViewTransitionRule`** interface represents a CSS @view-transition at-rule.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSViewTransitionRule)
 */
open external class CSSViewTransitionRule
private constructor() :
    CSSRule {
    /**
     * The **`navigation`** read-only property of the CSSViewTransitionRule interface returns the associated @view-transition at-rule's navigation descriptor value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSViewTransitionRule/navigation)
     */
    val navigation: String

    /**
     * The **`types`** read-only property of the CSSViewTransitionRule interface returns an array containing the associated @view-transition at-rule's types descriptor values.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSViewTransitionRule/types)
     */
    val types: ReadonlyArray<JsString>
}
