// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.http

import js.reflect.unsafeCast

sealed external interface RequestCache {
    companion object
}

inline val RequestCache.Companion.default: RequestCache
    get() = unsafeCast("default")

inline val RequestCache.Companion.forceCache: RequestCache
    get() = unsafeCast("force-cache")

inline val RequestCache.Companion.noCache: RequestCache
    get() = unsafeCast("no-cache")

inline val RequestCache.Companion.noStore: RequestCache
    get() = unsafeCast("no-store")

inline val RequestCache.Companion.onlyIfCached: RequestCache
    get() = unsafeCast("only-if-cached")

inline val RequestCache.Companion.reload: RequestCache
    get() = unsafeCast("reload")
