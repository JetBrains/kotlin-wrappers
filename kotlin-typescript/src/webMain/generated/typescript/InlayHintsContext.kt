// Automatically generated - do not modify!

package typescript

import typescript.ast.SourceFile
import typescript.ast.TextSpan
import typescript.sync.CancellationToken
import typescript.sync.Program
import typescript.sync.UserPreferences

@kotlinx.js.JsPlainObject
external interface InlayHintsContext {
    var file: SourceFile
    var program: Program
    var cancellationToken: CancellationToken
    var host: LanguageServiceHost
    var span: TextSpan
    var preferences: UserPreferences
}
