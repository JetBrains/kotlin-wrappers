@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.objects

import js.core.JsAny
import seskar.js.JsNativeGetter
import kotlin.js.definedExternally as definedExternally_

external interface ReadonlyRecord<K : JsAny, out V : JsAny?> {
    @JsNativeGetter
    operator fun get(
        key: K,
    ): V? = definedExternally_
}
