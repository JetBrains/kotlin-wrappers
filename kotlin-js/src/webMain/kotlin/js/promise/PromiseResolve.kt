package js.promise

import kotlin.js.JsAny

sealed /* final */
external interface PromiseResolve<T : JsAny?> {
    operator fun invoke(
        value: T,
    )

    operator fun invoke(
        value: PromiseResult<T>,
    )
}
