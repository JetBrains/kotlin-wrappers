package jszip

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface Platform

inline val Platform.Companion.DOS: Platform
    get() = unsafeCast("DOS")

inline val Platform.Companion.UNIX: Platform
    get() = unsafeCast("UNIX")

