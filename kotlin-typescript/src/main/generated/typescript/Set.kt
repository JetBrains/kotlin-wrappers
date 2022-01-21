// Automatically generated - do not modify!

@file:Suppress(
    "PARAMETER_NAME_CHANGED_ON_OVERRIDE",
    "DIFFERENT_NAMES_FOR_THE_SAME_PARAMETER_IN_SUPERTYPES",
)

package typescript

/** ES6 Set interface. */
external interface Set<T> : ReadonlySet<T>, Collection<T> {
    fun add(value: T): Set<T>
    override fun delete(value: T): Boolean
}
