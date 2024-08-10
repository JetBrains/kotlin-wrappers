// Automatically generated - do not modify!

package actions.cache

import seskar.js.JsValue

sealed external interface CacheFilename {
    companion object {
        @JsValue("cache.tgz")
        val Gzip: CacheFilename

        @JsValue("cache.tzst")
        val Zstd: CacheFilename
    }
}
