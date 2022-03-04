package react.dom.client

external interface RootOptions {
    /**
     * Prefix for `useId`.
     */
    var identifierPrefix: String?
    var onRecoverableError: ((error: Any) -> Unit)?
}
