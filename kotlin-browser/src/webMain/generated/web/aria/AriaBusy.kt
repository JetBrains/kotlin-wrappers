// Automatically generated - do not modify!

package web.aria

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaBusy)
 */
@JsUnion
sealed /* union */
external interface AriaBusy

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaBusy#false)
 */
inline val AriaBusy.Companion.`false`: AriaBusy
    get() = unsafeCast("false")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaBusy#true)
 */
inline val AriaBusy.Companion.`true`: AriaBusy
    get() = unsafeCast("true")
