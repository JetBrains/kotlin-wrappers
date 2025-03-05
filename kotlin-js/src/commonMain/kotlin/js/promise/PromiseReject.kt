package js.promise

import js.errors.JsError
import kotlin.js.definedExternally
import seskar.js.JsNativeInvoke

sealed external interface PromiseReject {
    @JsNativeInvoke
    operator fun invoke(
        reason: JsError = definedExternally,
    )
}
