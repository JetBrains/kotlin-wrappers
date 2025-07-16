@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.objects

import js.core.JsAny
import kotlin.js.definedExternally

external interface ReadonlyRecord<K : JsAny, out V : JsAny?> {
    operator fun get(
        key: K,
    ): V? = definedExternally
}
