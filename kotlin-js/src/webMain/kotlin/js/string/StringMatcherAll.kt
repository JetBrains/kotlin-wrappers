package js.string

import js.array.ReadonlyArray
import js.iterable.JsIterable

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/matchAll)
 */
external interface StringMatcherAll {

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/matchAll)
     */
    @JsSymbol("matchAll")
    fun `[@@matchAll]`(
        input: String,
    ): JsIterable<ReadonlyArray<JsString>>
}
