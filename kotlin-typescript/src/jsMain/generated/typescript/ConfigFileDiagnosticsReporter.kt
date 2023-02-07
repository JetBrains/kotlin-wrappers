// Automatically generated - do not modify!

package typescript

/**
 * Reports config file diagnostics
 */
sealed external interface ConfigFileDiagnosticsReporter {
    /**
     * Reports unrecoverable error when parsing config file
     */
    var onUnRecoverableConfigFileDiagnostic: DiagnosticReporter
}
