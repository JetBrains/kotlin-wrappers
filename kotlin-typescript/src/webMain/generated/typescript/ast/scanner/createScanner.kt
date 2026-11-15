// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript.ast.scanner

import typescript.ast.LanguageVariant
import typescript.ast.ScriptTarget

external fun createScanner(
    languageVersion: ScriptTarget,
    skipTrivia: Boolean,
    languageVariant: LanguageVariant = definedExternally,
    textInitial: String = definedExternally,
    onError: ErrorCallback = definedExternally,
    start: Int = definedExternally,
    length: Int = definedExternally,
): Scanner
