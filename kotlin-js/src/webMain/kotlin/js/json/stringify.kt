package js.json

import js.array.ReadonlyArray
import kotlin.js.JsAny
import kotlin.js.JsQualifier
import kotlin.js.definedExternally

/**
 * Converts a JavaScript value to a JavaScript Object Notation (JSON) string.
 * @param value A JavaScript value, usually an object or array, to be converted.
 */
@JsQualifier("JSON")
external fun stringify(
    value: JsAny?,
): String

/**
 * Converts a JavaScript value to a JavaScript Object Notation (JSON) string.
 * @param value A JavaScript value, usually an object or array, to be converted.
 * @param replacer A function that transforms the results.
 * @param space Adds indentation, white space, and line break characters to the return-value JSON text to make it easier to read.
 */
@JsQualifier("JSON")
external fun stringify(
    value: JsAny?,
    replacer: Replacer?,
    space: String? = definedExternally,
): String

@JsQualifier("JSON")
external fun stringify(
    value: JsAny?,
    replacer: Replacer?,
    space: Int?,
): String

/**
 * Converts a JavaScript value to a JavaScript Object Notation (JSON) string.
 * @param value A JavaScript value, usually an object or array, to be converted.
 * @param properties An array of strings and numbers that acts as an approved list for selecting the object properties that will be stringified.
 * @param space Adds indentation, white space, and line break characters to the return-value JSON text to make it easier to read.
 */
@JsQualifier("JSON")
external fun stringify(
    value: JsAny?,
    properties: ReadonlyArray<JsAny /* number | string */>?,
    space: String? = definedExternally,
): String

@JsQualifier("JSON")
external fun stringify(
    value: JsAny?,
    properties: ReadonlyArray<JsAny /* number | string */>,
    space: Int?,
): String
