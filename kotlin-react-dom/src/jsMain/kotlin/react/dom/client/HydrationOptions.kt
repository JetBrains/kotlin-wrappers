package react.dom.client

import js.objects.JsPlainObject

@JsPlainObject
external interface HydrationOptions {
    /**
     * Prefix for `useId`.
     */
    var identifierPrefix: String?
    var onRecoverableError: ErrorHandler<RecoverableErrorInfo>?
}
