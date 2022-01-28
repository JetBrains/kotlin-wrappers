// Automatically generated - do not modify!

package typescript

sealed external interface DiagnosticRelatedInformation {
    var category: DiagnosticCategory
    var code: Int
    var file: SourceFile?
    var start: Int?
    var length: Int?
    var messageText: dynamic /* string | DiagnosticMessageChain */
}
