// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

import typescript.ast.visitor.SourceMapSource

/**
 * Create an external source map source file reference
 */
external fun createSourceMapSource(
    fileName: String,
    text: String,
    skipTrivia: (pos: Int) -> Int = definedExternally,
): SourceMapSource
