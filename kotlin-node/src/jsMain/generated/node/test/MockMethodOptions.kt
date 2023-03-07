// Automatically generated - do not modify!

package node.test

sealed external interface MockMethodOptions : MockFunctionOptions {
    /**
     * If `true`, `object[methodName]` is treated as a getter.
     * This option cannot be used with the `setter` option.
     */
    var getter: Boolean?

    /**
     * If `true`, `object[methodName]` is treated as a setter.
     * This option cannot be used with the `getter` option.
     */
    var setter: Boolean?
}
