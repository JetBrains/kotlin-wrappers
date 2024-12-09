package react.dom.client

import js.objects.JsPlainObject

@JsPlainObject
external interface RootOptions {
    /**
     * Prefix for `useId`.
     */
    val identifierPrefix: String?
    val onRecoverableError: ErrorHandler<RecoverableErrorInfo>?
}
