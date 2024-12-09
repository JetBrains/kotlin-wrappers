package react.dom.client

import js.objects.JsPlainObject

@JsPlainObject
external interface HydrationOptions {
    /**
     * Prefix for `useId`.
     */
    val identifierPrefix: String?
    val onRecoverableError: ErrorHandler<RecoverableErrorInfo>?
}
