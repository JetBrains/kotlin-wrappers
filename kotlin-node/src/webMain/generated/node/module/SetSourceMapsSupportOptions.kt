// Automatically generated - do not modify!

package node.module

sealed external interface SetSourceMapsSupportOptions {
    /**
     * If enabling the support for files in `node_modules`.
     * @default false
     */
    var nodeModules: Boolean?

    /**
     * If enabling the support for generated code from `eval` or `new Function`.
     * @default false
     */
    var generatedCode: Boolean?
}
