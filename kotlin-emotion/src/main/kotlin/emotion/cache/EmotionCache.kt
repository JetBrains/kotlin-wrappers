package emotion.cache

import emotion.sheet.StyleSheet
import kotlinext.js.Record

typealias RegisteredCache = Record<String, String>

external interface EmotionCache {
    val inserted: Record<String, Any /* string | true */>
    val registered: RegisteredCache
    val sheet: StyleSheet
    val key: String
    val compat: Boolean?
    val nonce: String?
    fun insert(
        selector: String,
        serialized: SerializedStyles,
        sheet: StyleSheet,
        shouldCache: Boolean
    ): String?
}
