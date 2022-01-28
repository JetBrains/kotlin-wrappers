// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_TYPE_EXTENDS_NON_EXTERNAL_TYPE",
    "INTERFACE_WITH_SUPERCLASS",
    "FINAL_SUPERTYPE",
)

package typescript

sealed external interface NodeArray<out T : Node> : ReadonlyArray<T>, ReadonlyTextRange {
    val hasTrailingComma: Boolean
}
