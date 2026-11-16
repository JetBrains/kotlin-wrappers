// Automatically generated - do not modify!

package typescript.sync

import typescript.ast.SourceFile

@kotlinx.js.JsPlainObject
external interface DiagnosticRelatedInformation {
    var category: DiagnosticCategory
    var code: Int
    var file: SourceFile?
    var start: Int?
    var length: Int?
    var messageText: Any /* string | DiagnosticMessageChain */
}
