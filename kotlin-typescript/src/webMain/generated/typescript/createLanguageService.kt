// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

import typescript.sync.LanguageService

external fun createLanguageService(
    host: LanguageServiceHost,
    documentRegistry: DocumentRegistry = definedExternally,
    syntaxOnlyOrLanguageServiceMode: Boolean = definedExternally,
): LanguageService

external fun createLanguageService(
    host: LanguageServiceHost,
    documentRegistry: DocumentRegistry = definedExternally,
    syntaxOnlyOrLanguageServiceMode: LanguageServiceMode = definedExternally,
): LanguageService
