// Automatically generated - do not modify!

package web.cssom

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSMathValue/operator)
 */
@JsUnion
sealed /* union */
external interface CSSMathOperator

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSMathValue/operator#clamp)
 */
inline val CSSMathOperator.Companion.clamp: CSSMathOperator
    get() = unsafeCast("clamp")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSMathValue/operator#invert)
 */
inline val CSSMathOperator.Companion.invert: CSSMathOperator
    get() = unsafeCast("invert")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSMathValue/operator#max)
 */
inline val CSSMathOperator.Companion.max: CSSMathOperator
    get() = unsafeCast("max")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSMathValue/operator#min)
 */
inline val CSSMathOperator.Companion.min: CSSMathOperator
    get() = unsafeCast("min")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSMathValue/operator#negate)
 */
inline val CSSMathOperator.Companion.negate: CSSMathOperator
    get() = unsafeCast("negate")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSMathValue/operator#product)
 */
inline val CSSMathOperator.Companion.product: CSSMathOperator
    get() = unsafeCast("product")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSMathValue/operator#sum)
 */
inline val CSSMathOperator.Companion.sum: CSSMathOperator
    get() = unsafeCast("sum")
