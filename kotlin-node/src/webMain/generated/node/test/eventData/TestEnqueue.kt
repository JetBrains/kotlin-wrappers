// Automatically generated - do not modify!

package node.test.eventData

sealed external interface TestEnqueue : LocationInfo {
    /**
     * The test name.
     */
    var name: String

    /**
     * The nesting level of the test.
     */
    var nesting: Double

    /**
     * The test type. Either `'suite'` or `'test'`.
     * @since v22.15.0
     */
    var type: TestEnqueueType
}
