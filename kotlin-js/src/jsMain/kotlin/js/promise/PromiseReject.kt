package js.promise

import js.core.JsNativeInvoke
import js.errors.JsError

sealed external interface PromiseReject {
    @JsNativeInvoke
    operator fun invoke(
        reason: JsError = definedExternally,
    )
}
