@file:JsModule("yaml")

package yaml

import js.json.Reviver
import kotlin.js.JsAny
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * Parse an input string into JavaScript.
 *
 * Only supports input consisting of a single YAML document; for multi-document
 * support you should use `YAML.parseAllDocuments`. May throw on error, and may
 * log warnings using `console.warn`.
 *
 * @param str - A string with YAML formatting.
 * @param reviver - A reviver function, as in `JSON.parse()`
 * @returns The value will match the type of the root value of the parsed YAML
 *   document, so Maps become objects, Sequences arrays, and scalars result in
 *   nulls, booleans, numbers and strings.
 */
external fun <T : JsAny?> parse(
    str: String,
    reviver: Reviver = definedExternally,
): T
