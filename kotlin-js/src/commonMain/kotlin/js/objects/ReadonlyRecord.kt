@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.objects

import js.core.JsAny
import kotlin.js.definedExternally as definedExternally_
import seskar.js.JsNativeGetter

external interface ReadonlyRecord<K : JsAny, out V : JsAny?> {
    @JsNativeGetter
    operator fun get(
        key: K,
    ): V? = definedExternally_
}
