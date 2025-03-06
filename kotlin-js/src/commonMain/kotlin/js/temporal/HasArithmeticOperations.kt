// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.temporal

import js.core.JsAny
import kotlin.js.definedExternally

sealed external interface HasArithmeticOperations<T : HasArithmeticOperations<T, L, U>, in L : JsAny, U : DateTimeUnit<U>> :
    HasDurationOperations<T, ArithmeticOptions> {

    fun until(
        other: T,
        options: DifferenceOptions<U>,
    ): Duration = definedExternally

    fun until(
        other: L,
        options: DifferenceOptions<U>,
    ): Duration = definedExternally

    fun until(
        other: String,
        options: DifferenceOptions<U>,
    ): Duration = definedExternally

    fun since(
        other: T,
        options: DifferenceOptions<U>,
    ): Duration = definedExternally

    fun since(
        other: L,
        options: DifferenceOptions<U>,
    ): Duration = definedExternally

    fun since(
        other: String,
        options: DifferenceOptions<U>,
    ): Duration = definedExternally
}
