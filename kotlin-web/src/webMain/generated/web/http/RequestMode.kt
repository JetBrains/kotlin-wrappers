// Automatically generated - do not modify!

package web.http

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/mode)
 */
@JsUnion
sealed /* union */
external interface RequestMode

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/mode#cors)
 */
inline val RequestMode.Companion.cors: RequestMode
    get() = unsafeCast("cors")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/mode#navigate)
 */
inline val RequestMode.Companion.navigate: RequestMode
    get() = unsafeCast("navigate")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/mode#no-cors)
 */
inline val RequestMode.Companion.noCors: RequestMode
    get() = unsafeCast("no-cors")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/mode#same-origin)
 */
inline val RequestMode.Companion.sameOrigin: RequestMode
    get() = unsafeCast("same-origin")
