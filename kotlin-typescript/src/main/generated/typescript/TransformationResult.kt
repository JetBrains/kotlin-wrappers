// Automatically generated - do not modify!

package typescript

import kotlinx.js.ReadonlyArray

sealed external interface TransformationResult<T : Node> {
    /** Gets the transformed source files. */
    var transformed: ReadonlyArray<T>

    /** Gets diagnostics for the transformation. */
    var diagnostics: ReadonlyArray<DiagnosticWithLocation>?

    /**
     * Gets a substitute for a node, if one is available; otherwise, returns the original node.
     *
     * @param hint A hint as to the intended usage of the node.
     * @param node The node to substitute.
     */
    fun substituteNode(
        hint: EmitHint,
        node: Node,
    ): Node

    /**
     * Emits a node with possible notification.
     *
     * @param hint A hint as to the intended usage of the node.
     * @param node The node to emit.
     * @param emitCallback A callback used to emit the node.
     */
    fun emitNodeWithNotification(
        hint: EmitHint,
        node: Node,
        emitCallback: (
            hint: EmitHint,
            node: Node,
        ) -> Unit,
    )

    /**
     * Indicates if a given node needs an emit notification
     *
     * @param node The node to emit.
     */
    val isEmitNotificationEnabled: ((node: Node) -> Boolean)?

    /**
     * Clean up EmitNode entries on any parse-tree nodes.
     */
    fun dispose()
}
