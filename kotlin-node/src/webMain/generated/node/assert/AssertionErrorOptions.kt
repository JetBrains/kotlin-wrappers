// Automatically generated - do not modify!

package node.assert

sealed external interface AssertionErrorOptions {
    /**
     * If provided, the error message is set to this value.
     */
    var message: String?

    /**
     * The `actual` property on the error instance.
     */
    var actual: Any?

    /**
     * The `expected` property on the error instance.
     */
    var expected: Any?

    /**
     * The `operator` property on the error instance.
     */
    var operator: String?

    /**
     * If provided, the generated stack trace omits frames before this function.
     */
    var stackStartFn: Function<*>?

    /**
     * If set to `'full'`, shows the full diff in assertion errors.
     * @default 'simple'
     */
    var diff: AssertionErrorOptionsDiff?
}
