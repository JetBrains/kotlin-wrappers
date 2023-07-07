package remix.run.router

import web.http.Response

typealias RedirectFunction = (url: String, init: (Any /* number | ResponseInit */)? /* use undefined for default */) -> Response
