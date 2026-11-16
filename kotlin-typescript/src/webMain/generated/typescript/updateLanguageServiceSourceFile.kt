// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

import typescript.ast.SourceFile
import typescript.ast.TextChangeRange

external fun updateLanguageServiceSourceFile(
    sourceFile: SourceFile,
    scriptSnapshot: IScriptSnapshot,
    version: String,
    textChangeRange: TextChangeRange?,
    aggressiveChecks: Boolean = definedExternally,
): SourceFile
