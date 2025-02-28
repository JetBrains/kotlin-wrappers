@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.objects

import seskar.js.JsNativeGetter

external interface ReadonlyRecord<K : Any, out V> {
    @JsNativeGetter
    operator fun get(
        key: K,
    ): V? = definedExternally
}
