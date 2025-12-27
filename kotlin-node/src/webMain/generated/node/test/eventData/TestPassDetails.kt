// Automatically generated - do not modify!

package node.test.eventData

sealed external interface TestPassDetails {
    /**
     * The duration of the test in milliseconds.
     */
    var duration_ms: Double

    /**
     * The type of the test, used to denote whether this is a suite.
     * @since 20.0.0, 19.9.0, 18.17.0
     */
    var type: (TestPassDetailsType)?

    /**
     * The attempt number of the test run,
     * present only when using the `--test-rerun-failures` flag.
     * @since v24.7.0
     */
    var attempt: Double?

    /**
     * The attempt number the test passed on,
     * present only when using the `--test-rerun-failures` flag.
     * @since v24.7.0
     */
    var passed_on_attempt: Double?
}
