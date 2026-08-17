// Automatically generated - do not modify!

package web.http

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface CrossOrigin

inline val CrossOrigin.Companion.anonymous: CrossOrigin
    get() = unsafeCast("anonymous")

inline val CrossOrigin.Companion.useCredentials: CrossOrigin
    get() = unsafeCast("use-credentials")

inline val CrossOrigin.Companion.none: CrossOrigin
    get() = unsafeCast("")
