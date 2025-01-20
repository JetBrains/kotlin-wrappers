package prantlf.jsonlint

import js.json.Reviver
import js.objects.JsPlainObject

/**
 * Options to customize JSON input parsing.
 */
@JsPlainObject
external interface ParseOptions {
    /**
     * Ignore the leading BOM in the JSON input, if it is detected.
     *
     * The default is `false`, which will cause the parser to fail, when a BOM is encountered.
     */
    val ignoreBOM: Boolean?

    /**
     * Ignore comments in the JSON input (CJSON, JSON5).
     *
     * The default is `false`, which will cause the parser to fail, when a comment is encountered.
     */
    val ignoreComments: Boolean?

    /**
     * Ignore trailing commas after the last item in objects and arrays in the JSON input (JSON5).
     *
     * The default is `false`, which will cause the parser to fail, when a trailing comma is encountered.
     */
    val ignoreTrailingCommas: Boolean?

    /**
     * Allow quotes around strings to be single quotes (JSON5).
     *
     * The default is `false`, which will cause the parser to fail, when a single quote around a string is encountered.
     */
    val allowSingleQuotedStrings: Boolean?

    /**
     * Allow or disallow duplicated keys in objects.
     *
     * The default is `true`, which will allow duplicate keys to occur and return only the last occurrence in the parsed output.
     */
    val allowDuplicateObjectKeys: Boolean?

    /**
     * Set the JSON parsing mode as a shortcut for setting multiple parsing options.
     *
     * Available values: `'json' | 'cjson' | 'json5'`
     */
    val mode: ParseMode?

    /**
     * Transform the value, which was parsed for a particular object key from the JSON input.
     *
     * See https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/parse#the_reviver_parameter.
     */
    val reviver: Reviver?
}
