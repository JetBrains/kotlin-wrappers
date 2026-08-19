// Automatically generated - do not modify!

package web.http

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/credentials)
 */
@JsUnion
sealed /* union */
external interface RequestCredentials

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/credentials#include)
 */
inline val RequestCredentials.Companion.include: RequestCredentials
    get() = unsafeCast("include")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/credentials#omit)
 */
inline val RequestCredentials.Companion.omit: RequestCredentials
    get() = unsafeCast("omit")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/credentials#same-origin)
 */
inline val RequestCredentials.Companion.sameOrigin: RequestCredentials
    get() = unsafeCast("same-origin")
