package js.promise

import js.errors.JsError
import seskar.js.JsNativeInvoke
import kotlin.js.definedExternally as definedExternally_

sealed external interface PromiseReject {
    @JsNativeInvoke
    operator fun invoke(
        reason: JsError = definedExternally_,
    )
}
