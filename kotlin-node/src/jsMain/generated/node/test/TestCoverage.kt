// Generated by Karakum - do not modify it manually!

package node.test

sealed external interface TestCoverage {
    /**
     * An object containing the coverage report.
     */
    var summary: TestCoverageSummary

    /**
     * The nesting level of the test.
     */
    var nesting: Double
}
