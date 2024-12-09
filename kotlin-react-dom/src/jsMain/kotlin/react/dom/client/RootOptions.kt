package react.dom.client

import js.objects.JsPlainObject

@JsPlainObject
external interface RootOptions {
    /**
     * Prefix for `useId`.
     */
    var identifierPrefix: String?
    var onRecoverableError: ((error: Any) -> Unit)?
}
