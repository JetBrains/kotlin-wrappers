// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript.ast.factory

import typescript.ast.ScriptKind
import typescript.ast.ScriptTarget
import typescript.ast.SourceFile
import typescript.sync.CreateSourceFileOptions

external fun createSourceFile(
    fileName: String,
    sourceText: String,
    languageVersionOrOptions: ScriptTarget,
    setParentNodes: Boolean = definedExternally,
    scriptKind: ScriptKind = definedExternally,
): SourceFile

external fun createSourceFile(
    fileName: String,
    sourceText: String,
    languageVersionOrOptions: CreateSourceFileOptions,
    setParentNodes: Boolean = definedExternally,
    scriptKind: ScriptKind = definedExternally,
): SourceFile
