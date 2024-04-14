// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.temporal

sealed external interface Roundable<T : Roundable<T, U>, U : DateTimeUnit<U>> {
    fun round(
        roundTo: SmallestUnit<U>,
    ): T = definedExternally

    fun round(
        roundTo: RoundTo<U>,
    ): T = definedExternally
}
