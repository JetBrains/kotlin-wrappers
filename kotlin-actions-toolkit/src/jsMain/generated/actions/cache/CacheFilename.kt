// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package actions.cache

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface CacheFilename {
    companion object {
        @JsValue("cache.tgz")
        val Gzip: CacheFilename

        @JsValue("cache.tzst")
        val Zstd: CacheFilename
    }
}
