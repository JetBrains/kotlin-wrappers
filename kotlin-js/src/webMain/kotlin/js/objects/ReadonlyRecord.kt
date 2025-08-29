@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.objects

import js.core.JsAny
import js.core.JsPrimitives.toJsString
import js.core.JsString
import kotlin.js.definedExternally

external interface ReadonlyRecord<K : JsAny, out V : JsAny?> {
    operator fun get(
        key: K,
    ): V? = definedExternally
}

inline operator fun <V : JsAny?> ReadonlyRecord<JsAny, V>.get(key: String): V? =
    get(key.toJsString())

inline operator fun <V : JsAny?> ReadonlyRecord<JsString, V>.get(key: String): V? =
    get(key.toJsString())
