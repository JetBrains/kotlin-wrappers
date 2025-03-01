@file:Suppress(
    "WRONG_JS_INTEROP_TYPE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.objects

import kotlin.js.definedExternally
import seskar.js.JsNativeGetter

external interface ReadonlyRecord<K : Any, out V> {
    @JsNativeGetter
    operator fun get(
        key: K,
    ): V? = definedExternally
}
