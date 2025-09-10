@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.objects

import kotlin.js.JsAny
import kotlin.js.JsString
import kotlin.js.definedExternally
import kotlin.js.toJsString

external interface ReadonlyRecord<K : JsAny, out V : JsAny?> {
    operator fun get(
        key: K,
    ): V? = definedExternally
}

inline operator fun <V : JsAny?> ReadonlyRecord<JsAny, V>.get(key: String): V? =
    get(key.toJsString())

inline operator fun <V : JsAny?> ReadonlyRecord<JsString, V>.get(key: String): V? =
    get(key.toJsString())
