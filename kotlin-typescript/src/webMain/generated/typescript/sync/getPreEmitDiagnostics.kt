// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript.sync

import typescript.ast.SourceFile

external fun getPreEmitDiagnostics(
    program: Program,
    sourceFile: SourceFile = definedExternally,
    cancellationToken: CancellationToken = definedExternally,
): js.array.ReadonlyArray<Diagnostic>
