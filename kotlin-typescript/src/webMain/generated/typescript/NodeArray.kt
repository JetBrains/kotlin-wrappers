// Automatically generated - do not modify!

package typescript

@Suppress(
    "EXTERNAL_TYPE_EXTENDS_NON_EXTERNAL_TYPE",
    "INTERFACE_WITH_SUPERCLASS",
    "FINAL_SUPERTYPE",
)
external interface MutableNodeArray<T : Node> :
    js.array.JsArray<T>,
    ReadonlyTextRange {
    val hasTrailingComma: Boolean
}

typealias NodeArray<T> = MutableNodeArray<out T>
