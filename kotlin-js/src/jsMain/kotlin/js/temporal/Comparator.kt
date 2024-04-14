// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.temporal

sealed external interface Comparator<in T : Any, in L : Any> {
    fun compare(a: T, b: T): ComparisonResult = definedExternally
    fun compare(a: T, b: L): ComparisonResult = definedExternally
    fun compare(a: T, b: String): ComparisonResult = definedExternally
    fun compare(a: L, b: L): ComparisonResult = definedExternally
    fun compare(a: L, b: String): ComparisonResult = definedExternally
    fun compare(a: String, b: String): ComparisonResult = definedExternally
}
