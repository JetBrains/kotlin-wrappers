package react.dom.client

external interface HydrationOptions {
    /**
     * Prefix for `useId`.
     */
    var identifierPrefix: String?
    var onRecoverableError: ((error: Any) -> Unit)?
}
