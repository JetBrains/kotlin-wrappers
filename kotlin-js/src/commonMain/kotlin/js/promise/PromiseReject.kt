package js.promise

import js.errors.JsError
import seskar.js.JsNativeInvoke
import kotlin.js.definedExternally

sealed external interface PromiseReject {
    @JsNativeInvoke
    operator fun invoke(
        reason: JsError = definedExternally,
    )
}
