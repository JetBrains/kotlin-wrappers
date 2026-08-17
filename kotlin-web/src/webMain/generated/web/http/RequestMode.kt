// Automatically generated - do not modify!

package web.http

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface RequestMode

inline val RequestMode.Companion.cors: RequestMode
    get() = unsafeCast("cors")

inline val RequestMode.Companion.navigate: RequestMode
    get() = unsafeCast("navigate")

inline val RequestMode.Companion.noCors: RequestMode
    get() = unsafeCast("no-cors")

inline val RequestMode.Companion.sameOrigin: RequestMode
    get() = unsafeCast("same-origin")
