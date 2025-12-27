// Automatically generated - do not modify!

package node.test.eventData

sealed external interface TestFail : LocationInfo {
    /**
     * Additional execution metadata.
     */
    var details: TestFailDetails

    /**
     * The test name.
     */
    var name: String

    /**
     * The nesting level of the test.
     */
    var nesting: Double

    /**
     * The ordinal number of the test.
     */
    var testNumber: Double

    /**
     * Present if `context.todo` is called.
     */
    var todo: (Any /* string | boolean */)?

    /**
     * Present if `context.skip` is called.
     */
    var skip: (Any /* string | boolean */)?
}
