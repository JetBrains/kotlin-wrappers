@file:JsModule("@testing-library/react")

package testing.library.react

import js.promise.Promise
import js.promise.PromiseResult

@JsName("act")
external fun <T> actAsync(
    block: () -> PromiseResult<T>,
): Promise<T>
