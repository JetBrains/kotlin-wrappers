// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

import typescript.ast.ScriptKind
import typescript.ast.ScriptTarget
import typescript.ast.SourceFile
import typescript.sync.CreateSourceFileOptions

external fun createLanguageServiceSourceFile(
    fileName: String,
    scriptSnapshot: IScriptSnapshot,
    scriptTargetOrOptions: ScriptTarget,
    version: String,
    setNodeParents: Boolean,
    scriptKind: ScriptKind = definedExternally,
): SourceFile

external fun createLanguageServiceSourceFile(
    fileName: String,
    scriptSnapshot: IScriptSnapshot,
    scriptTargetOrOptions: CreateSourceFileOptions,
    version: String,
    setNodeParents: Boolean,
    scriptKind: ScriptKind = definedExternally,
): SourceFile
