// Automatically generated - do not modify!

package node.test.eventData

sealed external interface TestSummaryCounts {
    /**
     * The total number of cancelled tests.
     */
    var cancelled: Double

    /**
     * The total number of passed tests.
     */
    var passed: Double

    /**
     * The total number of skipped tests.
     */
    var skipped: Double

    /**
     * The total number of suites run.
     */
    var suites: Double

    /**
     * The total number of tests run, excluding suites.
     */
    var tests: Double

    /**
     * The total number of TODO tests.
     */
    var todo: Double

    /**
     * The total number of top level tests and suites.
     */
    var topLevel: Double
}
