package electron.core


external interface BeforeSendResponse {
    var cancel: Boolean?

    /**
     * When provided, request will be made with these headers.
     */
    var requestHeaders: js.core.ReadonlyRecord<String, Any /* (string) | (string[]) */>?
}
