// Automatically generated - do not modify!

package typescript

sealed external interface DiagnosticRelatedInformation {
    var category: DiagnosticCategory
    var code: Double
    var file: SourceFile?
    var start: Double?
    var length: Double?
    var messageText: Any /* string | DiagnosticMessageChain */
}
