// Automatically generated - do not modify!

package actions.http.client

import js.promise.Promise

sealed external interface RequestHandler {
    fun prepareRequest(options: node.http.RequestOptions)
    fun canHandleAuthentication(response: HttpClientResponse): Boolean
    fun handleAuthentication(
        httpClient: HttpClient,
        requestInfo: RequestInfo,
        data: String?,
    ): Promise<HttpClientResponse>

    fun handleAuthentication(
        httpClient: HttpClient,
        requestInfo: RequestInfo,
        data: node.ReadableStream?,
    ): Promise<HttpClientResponse>
}
