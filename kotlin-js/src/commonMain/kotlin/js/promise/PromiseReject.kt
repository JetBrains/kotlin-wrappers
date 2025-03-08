package js.promise

import js.errors.JsError
import js.errors.JsErrorLike
import seskar.js.JsNativeInvoke
import kotlin.js.definedExternally

sealed external interface PromiseReject {
    @JsNativeInvoke
    operator fun invoke(
        reason: JsErrorLike = definedExternally,
    )

    @JsNativeInvoke
    operator fun invoke(
        reason: JsError = definedExternally,
    )
}
