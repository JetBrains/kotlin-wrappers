// Automatically generated - do not modify!

package web.cssom

import kotlin.js.definedExternally

/**
 * The **`CSSVariableReferenceValue`** interface of the CSS Typed Object Model API allows you to create a custom name for a built-in CSS value. This object functionality is sometimes called a "CSS variable" and serves the same purpose as the var() function. The custom name must begin with two dashes.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSVariableReferenceValue)
 */
open external class CSSVariableReferenceValue(
    /**
     * The **`variable`** property of the CSSVariableReferenceValue interface returns the custom property name of the CSSVariableReferenceValue.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSVariableReferenceValue/variable)
     */
    var variable: String,
    /**
     * The **`fallback`** read-only property of the CSSVariableReferenceValue interface returns the custom property fallback value of the CSSVariableReferenceValue.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSVariableReferenceValue/fallback)
     */
    val fallback: CSSUnparsedValue? = definedExternally,
)
