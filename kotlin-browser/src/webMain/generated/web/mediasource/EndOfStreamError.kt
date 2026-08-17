// Automatically generated - do not modify!

package web.mediasource

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface EndOfStreamError

inline val EndOfStreamError.Companion.decode: EndOfStreamError
    get() = unsafeCast("decode")

inline val EndOfStreamError.Companion.network: EndOfStreamError
    get() = unsafeCast("network")
