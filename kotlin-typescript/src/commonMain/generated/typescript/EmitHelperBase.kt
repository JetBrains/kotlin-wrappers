// Automatically generated - do not modify!

package typescript

sealed external interface EmitHelperBase {
    val name: String
    val scoped: Boolean
    val text: Any /* string | ((node: EmitHelperUniqueNameCallback) => string) */
    val priority: Double?
    val dependencies: js.array.ReadonlyArray<EmitHelper>?
}
