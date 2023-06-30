package electron.core


external interface HeadersReceivedResponse {
    var cancel: Boolean?

    /**
     * When provided, the server is assumed to have responded with these headers.
     */
    var responseHeaders: js.core.ReadonlyRecord<String, Any /* (string) | (string[]) */>?

    /**
     * Should be provided when overriding `responseHeaders` to change header status
     * otherwise original response header's status will be used.
     */
    var statusLine: String?
}
