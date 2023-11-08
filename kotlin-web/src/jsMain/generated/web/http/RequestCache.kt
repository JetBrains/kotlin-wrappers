// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.http

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface RequestCache {
    companion object {
        @JsValue("default")
        val default: RequestCache

        @JsValue("force-cache")
        val forceCache: RequestCache

        @JsValue("no-cache")
        val noCache: RequestCache

        @JsValue("no-store")
        val noStore: RequestCache

        @JsValue("only-if-cached")
        val onlyIfCached: RequestCache

        @JsValue("reload")
        val reload: RequestCache
    }
}
