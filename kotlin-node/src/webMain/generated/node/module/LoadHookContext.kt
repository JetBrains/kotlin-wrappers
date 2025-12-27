// Automatically generated - do not modify!

package node.module

sealed external interface LoadHookContext {
    /**
     * Export conditions of the relevant `package.json`
     */
    var conditions: js.array.ReadonlyArray<String>

    /**
     * The format optionally supplied by the `resolve` hook chain (can be an intermediary value).
     */
    var format: String?

    /**
     *  An object whose key-value pairs represent the assertions for the module to import
     */
    var importAttributes: ImportAttributes
}
