package kotlinx.js

import kotlin.js.Promise

sealed external interface AsyncIterator<out T> {
    val next: (/* ...args: [] | [TNext] */) -> Promise<JsIterator.Result<T, Void>>
    val `return`: ((value: PromiseResult<Void>?) -> Promise<JsIterator.Result<T, Void>>)?
    val `throw`: ((e: Throwable?) -> Promise<JsIterator.Result<T, Void>>)?
}
