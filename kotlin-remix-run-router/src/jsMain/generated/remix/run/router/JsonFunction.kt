@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router

import web.http.Response

typealias JsonFunction<Data> = (data: Data, init: Any /* number | ResponseInit */) -> Response
