package js.regexp

open external class RegExp(
    pattern: String,
    /**
     * Returns a string indicating the flags of the regular expression in question. This field is read-only.
     * The characters in this string are sequenced and concatenated in the following order:
     *
     *    - "g" for global
     *    - "i" for ignoreCase
     *    - "m" for multiline
     *    - "u" for unicode
     *    - "y" for sticky
     *
     * If no flags are set, the value is the empty string.
     */
    val flags: String = definedExternally,
) {
    /**
     * Returns a Boolean value indicating the state of the dotAll flag (s) used with a regular expression.
     * Default is false. Read-only.
     */
    val dotAll: Boolean

    /** Returns a Boolean value indicating the state of the global flag (g) used with a regular expression. Default is false. Read-only. */
    val global: Boolean

    /** Returns a Boolean value indicating the state of the ignoreCase flag (i) used with a regular expression. Default is false. Read-only. */
    val ignoreCase: Boolean

    /**
     * Returns a Boolean value indicating the state of the hasIndices flag (d) used with a regular expression.
     * Default is false. Read-only.
     */
    val hasIndices: Boolean

    var lastIndex: Int

    /** Returns a Boolean value indicating the state of the multiline flag (m) used with a regular expression. Default is false. Read-only. */
    val multiline: Boolean

    /** Returns a copy of the text of the regular expression pattern. Read-only. The regExp argument is a Regular expression object. It can be a variable name or a literal. */
    val source: String

    /**
     * Returns a Boolean value indicating the state of the sticky flag (y) used with a regular
     * expression. Default is false. Read-only.
     */
    val sticky: Boolean

    /**
     * Returns a Boolean value indicating the state of the Unicode flag (u) used with a regular
     * expression. Default is false. Read-only.
     */
    val unicode: Boolean

    /**
     * Returns a Boolean value indicating the state of the unicodeSets flag (v) used with a regular expression.
     * Default is false. Read-only.
     */
    val unicodeSets: Boolean

    /**
     * Executes a search on a string using a regular expression pattern, and returns an array containing the results of that search.
     * @param string The String object or string literal on which to perform the search.
     */
    fun exec(string: String): RegExpExecArray?

    /**
     * Returns a Boolean value that indicates whether or not a pattern exists in a searched string.
     * @param string String on which to perform the search.
     */
    fun test(string: String): Boolean
}
