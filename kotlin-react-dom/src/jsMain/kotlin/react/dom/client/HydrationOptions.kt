package react.dom.client

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface HydrationOptions {
    val formState: ReactFormState?

    /**
     * Prefix for `useId`.
     */
    val identifierPrefix: String?
    val onUncaughtError: ErrorHandler<UncaughtErrorInfo>?
    val onRecoverableError: ErrorHandler<RecoverableErrorInfo>?
    val onCaughtError: ErrorHandler<CaughtErrorInfo>?
}
