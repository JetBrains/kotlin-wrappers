// Automatically generated - do not modify!

package web.http

import seskar.js.JsValue

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
