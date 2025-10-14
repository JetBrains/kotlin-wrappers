@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.objects

import kotlin.js.JsAny
import kotlin.js.definedExternally

external interface ObjectLike :
    Record<PropertyKey, JsAny?> {

    operator fun get(
        key: String,
    ): JsAny? = definedExternally

    operator fun set(
        key: String,
        value: JsAny?,
    ): Unit = definedExternally
}
