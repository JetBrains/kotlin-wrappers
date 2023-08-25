// Automatically generated - do not modify!

package node.test

sealed external interface MockFunctionOptions {
    /**
     * The number of times that the mock will use the behavior of `implementation`.
     * Once the mock function has been called `times` times,
     * it will automatically restore the behavior of `original`.
     * This value must be an integer greater than zero.
     * @default Infinity
     */
    var times: Number?
}
