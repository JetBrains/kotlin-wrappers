// Automatically generated - do not modify!

package node.test.eventData

sealed external interface TestStart : LocationInfo {
    /**
     * The test name.
     */
    var name: String

    /**
     * The nesting level of the test.
     */
    var nesting: Double
}
