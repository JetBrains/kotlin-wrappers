// Automatically generated - do not modify!

package actions.http.client

import js.promise.Promise

external interface RequestHandler {
    fun prepareRequest(options: node.http.RequestOptions)
    fun canHandleAuthentication(response: HttpClientResponse): Boolean
    fun handleAuthentication(
        httpClient: HttpClient,
        requestInfo: RequestInfo,
        data: Any /* string | node.ReadableStream */?,
    ): Promise<HttpClientResponse>
}
