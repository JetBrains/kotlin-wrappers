package emotion.utils

import js.objects.Record
import kotlin.js.JsAny
import kotlin.js.JsString

external interface EmotionCache {
    val inserted: Record<JsString, JsAny /* string | true */>
    val registered: RegisteredCache
    val sheet: StyleSheet
    val key: String
    val compat: Boolean?
    val nonce: String?
    fun insert(
        selector: String,
        serialized: SerializedStyles,
        sheet: StyleSheet,
        shouldCache: Boolean,
    ): String?
}
