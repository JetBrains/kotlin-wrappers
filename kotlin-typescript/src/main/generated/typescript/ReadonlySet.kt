// Automatically generated - do not modify!

@file:Suppress(
    "PARAMETER_NAME_CHANGED_ON_OVERRIDE",
    "DIFFERENT_NAMES_FOR_THE_SAME_PARAMETER_IN_SUPERTYPES",
)

package typescript

/** ES6 Set interface, only read methods included. */
external interface ReadonlySet<T> : ReadonlyCollection<T> {
    override fun has(value: T): Boolean
    fun values(): Iterator<T>
    fun entries(): Iterator<dynamic /* [T, T] */>
    fun forEach(action: (value: T, key: T) -> Unit)
}
