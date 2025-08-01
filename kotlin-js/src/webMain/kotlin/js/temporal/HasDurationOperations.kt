// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.temporal

import js.core.JsAny
import kotlin.js.definedExternally

sealed external interface HasDurationOperations<T : HasDurationOperations<T, O>, in O : JsAny> {
    fun add(
        duration: Duration,
        options: O = definedExternally,
    ): T = definedExternally

    fun add(
        duration: DurationLike,
        options: O = definedExternally,
    ): T = definedExternally

    fun add(
        duration: String,
        options: O = definedExternally,
    ): T = definedExternally

    fun subtract(
        duration: Duration,
        options: O = definedExternally,
    ): T = definedExternally

    fun subtract(
        duration: DurationLike,
        options: O = definedExternally,
    ): T = definedExternally

    fun subtract(
        duration: String,
        options: O = definedExternally,
    ): T = definedExternally
}
