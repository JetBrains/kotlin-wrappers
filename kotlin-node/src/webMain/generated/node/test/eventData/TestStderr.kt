// Automatically generated - do not modify!

package node.test.eventData

sealed external interface TestStderr {
    /**
     * The path of the test file.
     */
    var file: String

    /**
     * The message written to `stderr`.
     */
    var message: String
}
