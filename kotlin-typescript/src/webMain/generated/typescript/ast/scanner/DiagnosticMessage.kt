// Automatically generated - do not modify!

package typescript.ast.scanner

import typescript.sync.DiagnosticCategory

@kotlinx.js.JsPlainObject
external interface DiagnosticMessage {
    var key: String
    var category: DiagnosticCategory
    var code: Int
    var message: String
    var reportsUnnecessary: (Any)?
    var reportsDeprecated: (Any)?
}
