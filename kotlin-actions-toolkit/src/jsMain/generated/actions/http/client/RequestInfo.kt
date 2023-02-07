// Automatically generated - do not modify!

package actions.http.client

import web.url.URL

sealed external interface RequestInfo {
    var options: node.http.RequestOptions
    var parsedUrl: URL
    var httpModule: Any /* typeof http | typeof https */
}
