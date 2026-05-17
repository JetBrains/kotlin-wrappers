package js.generator

import js.errors.JsError
import js.iterable.AsyncIterator
import js.iterable.IteratorResult
import js.promise.Promise
import js.promise.PromiseLike

private const val ASYNC_GENERATOR: String = "(async function* () {}.constructor.prototype.prototype)"

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/AsyncGenerator)
 */
@JsName(ASYNC_GENERATOR)
open external class AsyncGenerator<out T : JsAny?, TReturn : JsAny?, in TNext : JsAny?>
private constructor() :
    AsyncIterator<T> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/AsyncGenerator/next)
     */
    override fun next(): Promise<IteratorResult<T, TReturn>>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/AsyncGenerator/next)
     */
    fun next(value: TNext = definedExternally): Promise<IteratorResult<T, TReturn>>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/AsyncGenerator/return)
     */
    fun `return`(): Promise<IteratorResult<T, TReturn?>>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/AsyncGenerator/return)
     */
    fun `return`(value: TReturn): Promise<IteratorResult<T, TReturn>>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/AsyncGenerator/return)
     */
    fun `return`(value: PromiseLike<TReturn>): Promise<IteratorResult<T, TReturn>>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/AsyncGenerator/throw)
     */
    fun `throw`(error: JsError): Promise<IteratorResult<T, TReturn>>
}
