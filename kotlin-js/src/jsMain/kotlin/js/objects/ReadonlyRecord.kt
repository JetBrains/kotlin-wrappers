@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.objects

import seskar.js.JsNative

external interface ReadonlyRecord<K : Any, out V> {
    @JsNative
    operator fun get(
        key: K,
    ): V? = definedExternally
}
