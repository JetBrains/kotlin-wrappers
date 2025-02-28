package js.promise

import js.errors.JsError
import seskar.js.JsNative

sealed external interface PromiseReject {
    @JsNative
    operator fun invoke(
        reason: JsError = definedExternally,
    )
}
