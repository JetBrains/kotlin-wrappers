package js.string

import js.regexp.RegExpMatchArray

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/match)
 */
external interface StringMatcher {

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/match)
     */
    @JsSymbol("match")
    fun `[@@match]`(
        input: String,
    ): RegExpMatchArray?
}
