@file:JsModule("@prantlf/jsonlint")

package prantlf.jsonlint

import js.json.Reviver
import js.objects.ReadonlyRecord

/**
 * Parses a string formatted as JSON to a JSON output (primitive type, object
 * or array). It is compatible with the native `JSON.parse` method.
 *
 * @example
 * ```ts
 * import { parse } from '@prantlf/jsonlint'
 * const parsed = parse('string with JSON data')
 * ```
 *
 * @param input - a string input to parse
 * @param reviverOrOptions - either a value reviver or an object
 *                           with multiple options
 * @returns the parsed result - a primitive value, array or object
 */
external fun parse(input: String): ReadonlyRecord<String, Any?>

/**
 * Parses a string formatted as JSON to a JSON output (primitive type, object
 * or array). It is compatible with the native `JSON.parse` method.
 *
 * @example
 * ```ts
 * import { parse } from '@prantlf/jsonlint'
 * const parsed = parse('string with JSON data')
 * ```
 *
 * @param input - a string input to parse
 * @param reviverOrOptions - either a value reviver or an object
 *                           with multiple options
 * @returns the parsed result - a primitive value, array or object
 */
external fun parse(
    input: String,
    reviver: Reviver = definedExternally,
): ReadonlyRecord<String, Any?>

/**
 * Parses a string formatted as JSON to a JSON output (primitive type, object
 * or array). It is compatible with the native `JSON.parse` method.
 *
 * @example
 * ```ts
 * import { parse } from '@prantlf/jsonlint'
 * const parsed = parse('string with JSON data')
 * ```
 *
 * @param input - a string input to parse
 * @param reviverOrOptions - either a value reviver or an object
 *                           with multiple options
 * @returns the parsed result - a primitive value, array or object
 */
external fun parse(
    input: String,
    options: ParseOptions = definedExternally,
): ReadonlyRecord<String, Any?>
