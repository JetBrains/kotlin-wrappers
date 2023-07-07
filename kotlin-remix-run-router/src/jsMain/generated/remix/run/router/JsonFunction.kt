package remix.run.router

import web.http.Response

typealias JsonFunction<Data> = (data: Data, init: (Any /* number | ResponseInit */)? /* use undefined for default */) -> Response
