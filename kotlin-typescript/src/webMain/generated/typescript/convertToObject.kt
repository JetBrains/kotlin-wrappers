// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

import typescript.ast.JsonSourceFile
import typescript.sync.Diagnostic

/**
 * Convert the json syntax tree into the json value
 */
external fun convertToObject(
    sourceFile: JsonSourceFile,
    errors: js.array.ReadonlyArray<Diagnostic>,
): Any?
