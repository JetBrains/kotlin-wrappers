// Automatically generated - do not modify!

package typescript

import js.array.ReadonlyArray

sealed external interface EmitHelperBase {
    val name: String
    val scoped: Boolean
    val text: Any /* string | ((node: EmitHelperUniqueNameCallback) => string) */
    val priority: Int?
    val dependencies: ReadonlyArray<EmitHelper>?
}
