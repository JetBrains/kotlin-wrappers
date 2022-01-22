// Automatically generated - do not modify!

package typescript

external interface PrintHandlers {
    /**
     * A hook used by the Printer when generating unique names to avoid collisions with
     * globally defined names that exist outside of the current source file.
     */
    val hasGlobalName: ((name: String) -> Boolean)?

    /**
     * A hook used by the Printer to provide notifications prior to emitting a node. A
     * compatible implementation **must** invoke `emitCallback` with the provided `hint` and
     * `node` values.
     * @param hint A hint indicating the intended purpose of the node.
     * @param node The node to emit.
     * @param emitCallback A callback that, when invoked, will emit the node.
     * @example
     * ```ts
     * var printer = createPrinter(printerOptions, {
     *   onEmitNode(hint, node, emitCallback) {
     *     // set up or track state prior to emitting the node...
     *     emitCallback(hint, node);
     *     // restore state after emitting the node...
     *   }
     * });
     * ```
     */
    val onEmitNode: ((
        hint: EmitHint,
        node: Node,
        emitCallback: (
            hint: EmitHint,
            node: Node,
        ) -> Unit,
    ) -> Unit)?

    /**
     * A hook used to check if an emit notification is required for a node.
     * @param node The node to emit.
     */
    val isEmitNotificationEnabled: ((node: Node) -> Boolean)?

    /**
     * A hook used by the Printer to perform just-in-time substitution of a node. This is
     * primarily used by node transformations that need to substitute one node for another,
     * such as replacing `myExportedVar` with `exports.myExportedVar`.
     * @param hint A hint indicating the intended purpose of the node.
     * @param node The node to emit.
     * @example
     * ```ts
     * var printer = createPrinter(printerOptions, {
     *   substituteNode(hint, node) {
     *     // perform substitution if necessary...
     *     return node;
     *   }
     * });
     * ```
     */
    val substituteNode: ((
        hint: EmitHint,
        node: Node,
    ) -> Node)?
}
