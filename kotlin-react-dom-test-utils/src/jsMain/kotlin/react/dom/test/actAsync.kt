@file:JsModule("react-dom/test-utils")

package react.dom.test

import js.promise.Promise
import seskar.js.JsAsync

@JsAsync
external suspend fun <T> act(
    block: () -> T,
): T

@JsName("act")
external fun <T> actAsync(
    callback: () -> T, /* | Promise<T> */
): Promise<T>
