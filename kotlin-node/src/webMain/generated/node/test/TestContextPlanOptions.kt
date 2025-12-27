// Automatically generated - do not modify!

package node.test

sealed external interface TestContextPlanOptions {
    /**
     * The wait time for the plan:
     * * If `true`, the plan waits indefinitely for all assertions and subtests to run.
     * * If `false`, the plan performs an immediate check after the test function completes,
     * without waiting for any pending assertions or subtests.
     * Any assertions or subtests that complete after this check will not be counted towards the plan.
     * * If a number, it specifies the maximum wait time in milliseconds
     * before timing out while waiting for expected assertions and subtests to be matched.
     * If the timeout is reached, the test will fail.
     * @default false
     */
    var wait: Any? // boolean | number | undefined
}
