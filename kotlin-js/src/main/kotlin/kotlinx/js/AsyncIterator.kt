package kotlinx.js

import kotlin.js.Promise

sealed external interface AsyncIterator<T, TReturn> {
    val next: (/* ...args: [] | [TNext] */) -> Promise<JsIterator.Result<T, TReturn>>
    val `return`: ((value: Promise<TReturn>?) -> Promise<JsIterator.Result<T, TReturn>>)?
    val `throw`: ((e: Throwable?) -> Promise<JsIterator.Result<T, TReturn>>)?
}

external interface AsyncIterable<T>

fun <T> AsyncIterable<T>.asyncIterator(): AsyncIterator<T, Void> =
    asDynamic()[Symbol.asyncIterator]()

sealed external interface AsyncIterableIterator<T> : AsyncIterator<T, Void>

fun <T> AsyncIterableIterator<T>.asyncIterator(): AsyncIterableIterator<T> =
    asDynamic()[Symbol.asyncIterator]()
