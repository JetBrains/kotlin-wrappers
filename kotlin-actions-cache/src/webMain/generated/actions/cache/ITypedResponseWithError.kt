// Automatically generated - do not modify!

package actions.cache

import actions.http.client.HttpClientError
import actions.http.client.TypedResponse
import js.objects.JsPlainObject

@JsPlainObject
external interface ITypedResponseWithError<T> :
    TypedResponse<T> {
    val error: HttpClientError?
}
