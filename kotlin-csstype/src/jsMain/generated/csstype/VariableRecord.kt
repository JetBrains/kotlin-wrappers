// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package csstype

sealed external interface VariableRecord

inline fun <T : Any> VariableRecord.get(
    name: Variable<T>,
): T? =
    asDynamic()[name]

inline fun <T : Any> VariableRecord.set(
    name: Variable<T>,
    value: T?,
) {
    asDynamic()[name] = value
}
