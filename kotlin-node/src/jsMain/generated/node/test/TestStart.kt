// Generated by Karakum - do not modify it manually!


package node.test


sealed external interface TestStart : TestLocationInfo {
    /**
     * The test name.
     */
    var name: String

    /**
     * The nesting level of the test.
     */
    var nesting: Double
}