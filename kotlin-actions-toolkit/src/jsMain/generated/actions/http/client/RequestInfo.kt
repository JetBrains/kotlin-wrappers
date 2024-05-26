// Automatically generated - do not modify!

package actions.http.client

import js.objects.JsPlainObject
import web.url.URL

@JsPlainObject
sealed external interface RequestInfo {
    var options: node.http.RequestOptions
    var parsedUrl: URL
    var httpModule: Any /* typeof http | typeof https */
}
