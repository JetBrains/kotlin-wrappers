@file:Suppress(
    "EXPECTED_EXTERNAL_DECLARATION",
)

package js.array

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array)
 */
expect external class JsArray<T : JsAny?> :
    JsAny {

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/length)
     */
    val size: Int

    operator fun get(index: Int): T
    operator fun set(index: Int, value: T)
}
