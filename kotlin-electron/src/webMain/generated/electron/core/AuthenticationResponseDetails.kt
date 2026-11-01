// Automatically generated - do not modify!

package electron.core

@kotlinx.js.JsPlainObject
external interface AuthenticationResponseDetails {
    var url: String
    var pid: Double

    /**
     * Indicates whether the request is for a navigation.
     */
    var isRequestForNavigation: Boolean

    /**
     * Indicates whether this is the first authentication attempt.
     */
    var firstAuthAttempt: Boolean

    /**
     * The headers returned in the response.
     */
    var responseHeaders: js.objects.ReadonlyRecord<String, Any /* (string) | (string[]) */>?
}
