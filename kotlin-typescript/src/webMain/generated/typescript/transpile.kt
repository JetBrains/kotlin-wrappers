// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

import typescript.sync.CompilerOptions
import typescript.sync.Diagnostic

external fun transpile(
    input: String,
    compilerOptions: CompilerOptions = definedExternally,
    fileName: String = definedExternally,
    diagnostics: js.array.ReadonlyArray<Diagnostic> = definedExternally,
    moduleName: String = definedExternally,
): String
