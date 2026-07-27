package js.string

import js.iterable.JsIterable
import js.regexp.RegExpExecArray

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/matchAll)
 */
external interface StringMatcherAll {

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/matchAll)
     */
    @JsSymbol("matchAll")
    fun `[@@matchAll]`(
        string: String,
    ): JsIterable<RegExpExecArray>
}
