@file:JsModule("react")

package react

import js.promise.Promise
import seskar.js.JsAsync

@JsAsync
external suspend fun <T> act(
    block: () -> T,
): T

@JsName("act")
external fun <T> actAsync(
    block: () -> T, /* | Promise<T> */
): Promise<T>
