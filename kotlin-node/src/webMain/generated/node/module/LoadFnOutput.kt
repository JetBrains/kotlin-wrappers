// Automatically generated - do not modify!

package node.module

@kotlinx.js.JsPlainObject
external interface LoadFnOutput {
    var format: String?

    /**
     * A signal that this hook intends to terminate the chain of `resolve` hooks.
     * @default false
     */
    var shortCircuit: Boolean?

    /**
     * The source for Node.js to evaluate
     */
    var source: ModuleSource?
}
