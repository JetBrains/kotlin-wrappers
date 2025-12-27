// Automatically generated - do not modify!

package node.test.eventData

sealed external interface TestDiagnostic : LocationInfo {
    /**
     * The diagnostic message.
     */
    var message: String

    /**
     * The nesting level of the test.
     */
    var nesting: Double

    /**
     * The severity level of the diagnostic message.
     * Possible values are:
     * * `'info'`: Informational messages.
     * * `'warn'`: Warnings.
     * * `'error'`: Errors.
     */
    var level: TestDiagnosticLevel
}
