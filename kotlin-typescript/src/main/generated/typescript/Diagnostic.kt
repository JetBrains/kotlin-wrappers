// Automatically generated - do not modify!

package typescript

sealed external interface Diagnostic : DiagnosticRelatedInformation {
    /** May store more in future. For now, this will simply be `true` to indicate when a diagnostic is an unused-identifier diagnostic. */
    var reportsUnnecessary: Any?
    var reportsDeprecated: Any?
    var source: String?
    var relatedInformation: ReadonlyArray<DiagnosticRelatedInformation>?
}
