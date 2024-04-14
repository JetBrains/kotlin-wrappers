// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.temporal

sealed external interface HasArithmeticOperations<T : Any, in L : Any, U : DateTimeUnit<U>> {
    fun add(
        duration: Duration,
        options: ArithmeticOptions = definedExternally,
    ): T

    fun add(
        duration: DurationLike,
        options: ArithmeticOptions = definedExternally,
    ): T

    fun add(
        duration: String,
        options: ArithmeticOptions = definedExternally,
    ): T

    fun subtract(
        duration: Duration,
        options: ArithmeticOptions = definedExternally,
    ): T

    fun subtract(
        duration: DurationLike,
        options: ArithmeticOptions = definedExternally,
    ): T

    fun subtract(
        duration: String,
        options: ArithmeticOptions = definedExternally,
    ): T

    fun until(
        other: T,
        options: DifferenceOptions<U>,
    ): Duration

    fun until(
        other: L,
        options: DifferenceOptions<U>,
    ): Duration

    fun until(
        other: String,
        options: DifferenceOptions<U>,
    ): Duration

    fun since(
        other: T,
        options: DifferenceOptions<U>,
    ): Duration

    fun since(
        other: L,
        options: DifferenceOptions<U>,
    ): Duration

    fun since(
        other: String,
        options: DifferenceOptions<U>,
    ): Duration
}
