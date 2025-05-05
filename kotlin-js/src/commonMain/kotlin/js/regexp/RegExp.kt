package js.regexp

import js.serializable.Serializable
import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp)
 */
open external class RegExp(
    pattern: String,
    /**
     * Returns a string indicating the flags of the regular expression in question. This field is read-only.
     * The characters in this string are sequenced and concatenated in the following order:
     *
     *  - "d" for [hasIndices]
     *  - "g" for [global]
     *  - "i" for [ignoreCase]
     *  - "m" for [multiline]
     *  - "s" for [dotAll]
     *  - "u" for [unicode]
     *  - "v" for [unicodeSets]
     *  - "y" for [sticky]
     *
     * If no flags are set, the value is the empty string.
     *
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/flags)
     */
    val flags: String = definedExternally,
) : Serializable {
    constructor(pattern: RegExp)

    /**
     * Returns a Boolean value indicating the state of the dotAll flag (s) used with a regular expression.
     * Default is false. Read-only.
     *
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/dotAll)
     */
    val dotAll: Boolean

    /**
     * Returns a Boolean value indicating the state of the global flag (g) used with a regular expression. Default is false. Read-only.
     *
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/global)
     */
    val global: Boolean

    /**
     * Returns a Boolean value indicating the state of the ignoreCase flag (i) used with a regular expression. Default is false. Read-only.
     *
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/ignoreCase)
     */
    val ignoreCase: Boolean

    /**
     * Returns a Boolean value indicating the state of the hasIndices flag (d) used with a regular expression.
     * Default is false. Read-only.
     *
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/hasIndices)
     */
    val hasIndices: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/lastIndex)
     */
    var lastIndex: Int

    /**
     * Returns a Boolean value indicating the state of the multiline flag (m) used with a regular expression. Default is false. Read-only.
     *
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/multiline)
     */
    val multiline: Boolean

    /**
     * Returns a copy of the text of the regular expression pattern. Read-only. The regExp argument is a Regular expression object. It can be a variable name or a literal.
     *
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/source)
     */
    val source: String

    /**
     * Returns a Boolean value indicating the state of the sticky flag (y) used with a regular
     * expression. Default is false. Read-only.
     *
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/sticky)
     */
    val sticky: Boolean

    /**
     * Returns a Boolean value indicating the state of the Unicode flag (u) used with a regular
     * expression. Default is false. Read-only.
     *
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/unicode)
     */
    val unicode: Boolean

    /**
     * Returns a Boolean value indicating the state of the unicodeSets flag (v) used with a regular expression.
     * Default is false. Read-only.
     *
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/unicodeSets)
     */
    val unicodeSets: Boolean

    /**
     * Executes a search on a string using a regular expression pattern, and returns an array containing the results of that search.
     * @param string The String object or string literal on which to perform the search.
     *
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/exec)
     */
    fun exec(string: String): RegExpExecArray?

    /**
     * Returns a Boolean value that indicates whether or not a pattern exists in a searched string.
     * @param string String on which to perform the search.
     *
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/test)
     */
    fun test(string: String): Boolean
}
