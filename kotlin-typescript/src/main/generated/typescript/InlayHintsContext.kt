// Automatically generated - do not modify!

package typescript

sealed external interface InlayHintsContext {
    var file: SourceFile
    var program: Program
    var cancellationToken: CancellationToken
    var host: LanguageServiceHost
    var span: TextSpan
    var preferences: InlayHintsOptions
}
