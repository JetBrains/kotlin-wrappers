package emotion.utils

import js.core.JsString
import js.objects.Record
import kotlin.js.JsAny

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
