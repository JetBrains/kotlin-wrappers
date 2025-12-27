// Automatically generated - do not modify!

package node.test.eventData

sealed external interface TestPlan : LocationInfo {
    /**
     * The nesting level of the test.
     */
    var nesting: Double

    /**
     * The number of subtests that have ran.
     */
    var count: Double
}
