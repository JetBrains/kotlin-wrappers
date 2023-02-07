// Automatically generated - do not modify!

package node.test

sealed external interface TestPass {
    /**
     * The test duration.
     */
    var duration: Number

    /**
     * The test name.
     */
    var name: String

    /**
     * The ordinal number of the test.
     */
    var testNumber: Number

    /**
     * Present if `context.todo` is called.
     */
    var todo: String?

    /**
     * Present if `context.skip` is called.
     */
    var skip: String?
}
