// Automatically generated - do not modify!

package typescript

sealed external interface BuildOptions {
    var dry: Boolean?
    var force: Boolean?
    var verbose: Boolean?
    var incremental: Boolean?
    var assumeChangesOnlyAffectDirectDependencies: Boolean?
    var declaration: Boolean?
    var declarationMap: Boolean?
    var emitDeclarationOnly: Boolean?
    var sourceMap: Boolean?
    var inlineSourceMap: Boolean?
    var traceResolution: Boolean?

    @seskar.js.JsNative
    operator fun get(key: String): CompilerOptionsValue

    @seskar.js.JsNative
    operator fun set(key: String, value: CompilerOptionsValue)
}
