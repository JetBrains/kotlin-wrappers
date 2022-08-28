package kotlinx.js

import kotlin.js.Promise

sealed external interface AsyncIterator<out T, TReturn> {
    val next: (/* ...args: [] | [TNext] */) -> Promise<JsIterator.Result<T, TReturn>>
    val `return`: ((value: Promise<TReturn>?) -> Promise<JsIterator.Result<T, TReturn>>)?
    val `throw`: ((e: Throwable?) -> Promise<JsIterator.Result<T, TReturn>>)?
}
