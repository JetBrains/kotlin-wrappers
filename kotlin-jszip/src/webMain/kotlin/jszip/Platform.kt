@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package jszip

import js.reflect.unsafeCast

sealed external interface Platform {
    companion object
}

inline val Platform.Companion.DOS: Platform
    get() = unsafeCast("DOS")

inline val Platform.Companion.UNIX: Platform
    get() = unsafeCast("UNIX")

