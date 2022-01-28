// Automatically generated - do not modify!

package typescript

sealed external interface TransformationContext : CoreTransformationContext {
    /** Records a request for a non-scoped emit helper in the current context. */
    fun requestEmitHelper(helper: EmitHelper)

    /** Gets and resets the requested non-scoped emit helpers. */
    fun readEmitHelpers(): ReadonlyArray<EmitHelper>?

    /** Enables expression substitutions in the pretty printer for the provided SyntaxKind. */
    fun enableSubstitution(kind: SyntaxKind)

    /** Determines whether expression substitutions are enabled for the provided node. */
    fun isSubstitutionEnabled(node: Node): Boolean

    /**
     * Hook used by transformers to substitute expressions just before they
     * are emitted by the pretty printer.
     *
     * NOTE: Transformation hooks should only be modified during `Transformer` initialization,
     * before returning the `NodeTransformer` callback.
     */
    var onSubstituteNode: (hint: EmitHint, node: Node) -> Node

    /**
     * Enables before/after emit notifications in the pretty printer for the provided
     * SyntaxKind.
     */
    fun enableEmitNotification(kind: SyntaxKind)

    /**
     * Determines whether before/after emit notifications should be raised in the pretty
     * printer when it emits a node.
     */
    fun isEmitNotificationEnabled(node: Node): Boolean

    /**
     * Hook used to allow transformers to capture state before or after
     * the printer emits a node.
     *
     * NOTE: Transformation hooks should only be modified during `Transformer` initialization,
     * before returning the `NodeTransformer` callback.
     */
    var onEmitNode: (hint: EmitHint, node: Node, emitCallback: (hint: EmitHint, node: Node) -> Unit) -> Unit
}
