// Automatically generated - do not modify!

package node.url

import node.querystring.ParsedUrlQuery

sealed external interface UrlWithParsedQuery : Url {
    @JsName("query")
    var parsedQuery: ParsedUrlQuery
}
