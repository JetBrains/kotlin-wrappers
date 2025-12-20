package js.json

import kotlin.js.JsAny
import kotlin.js.JsQualifier
import kotlin.js.definedExternally

/**
 * Converts a JavaScript Object Notation (JSON) string into an object.
 * @param text A valid JSON string.
 * @param reviver A function that transforms the results. This function is called for each member of the object.
 * If a member contains nested objects, the nested objects are transformed before the parent object is.
 */
@JsQualifier("JSON")
external fun <T : JsAny?> parse(
    text: String,
    reviver: Reviver = definedExternally,
): T
