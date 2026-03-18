package js.promise

import js.errors.JsError
import js.errors.JsErrorLike

sealed /* final */
external interface PromiseReject {
    operator fun invoke()

    operator fun invoke(
        reason: JsErrorLike?,
    )

    operator fun invoke(
        reason: JsError,
    )
}
