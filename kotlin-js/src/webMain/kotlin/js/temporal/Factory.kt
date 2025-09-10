// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.temporal

import kotlin.js.JsAny
import kotlin.js.definedExternally

sealed external interface Factory<T : JsAny, in L : JsAny, in O : JsAny> {
    fun from(value: T, options: O = definedExternally): T = definedExternally
    fun from(value: L, options: O = definedExternally): T = definedExternally
    fun from(value: String, options: O = definedExternally): T = definedExternally
}
