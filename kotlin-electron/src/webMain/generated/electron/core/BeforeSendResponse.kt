// Automatically generated - do not modify!

package electron.core

external interface BeforeSendResponse {
    var cancel: Boolean?

    /**
     * When provided, request will be made with these headers.
     */
    var requestHeaders: js.objects.ReadonlyRecord<String, Any /* (string) | (string[]) */>?
}
