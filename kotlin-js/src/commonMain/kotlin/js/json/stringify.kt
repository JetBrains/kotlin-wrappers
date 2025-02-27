@file:JsQualifier("JSON")

@file:Suppress(
    "WRONG_JS_INTEROP_TYPE",
)

package js.json

import js.import.JsQualifier
import js.array.ReadonlyArray
import kotlin.js.definedExternally

/**
 * Converts a JavaScript value to a JavaScript Object Notation (JSON) string.
 * @param value A JavaScript value, usually an object or array, to be converted.
 * @param replacer A function that transforms the results.
 * @param space Adds indentation, white space, and line break characters to the return-value JSON text to make it easier to read.
 */
external fun stringify(
    value: Any?,
    replacer: Replacer = definedExternally,
    space: String = definedExternally,
): String

external fun stringify(
    value: Any?,
    replacer: Replacer = definedExternally,
    space: Int = definedExternally,
): String

/**
 * Converts a JavaScript value to a JavaScript Object Notation (JSON) string.
 * @param value A JavaScript value, usually an object or array, to be converted.
 * @param replacer An array of strings and numbers that acts as an approved list for selecting the object properties that will be stringified.
 * @param space Adds indentation, white space, and line break characters to the return-value JSON text to make it easier to read.
 */
external fun stringify(
    value: Any?,
    replacer: ReadonlyArray<* /* number | string */> = definedExternally,
    space: String = definedExternally,
): String

external fun stringify(
    value: Any?,
    replacer: ReadonlyArray<* /* number | string */> = definedExternally,
    space: Int = definedExternally,
): String
