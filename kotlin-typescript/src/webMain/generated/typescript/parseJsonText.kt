// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

import typescript.ast.JsonSourceFile

/**
 * Parse json text into SyntaxTree and return node and parse errors if any
 * @param fileName
 * @param sourceText
 */
external fun parseJsonText(
    fileName: String,
    sourceText: String,
): JsonSourceFile
