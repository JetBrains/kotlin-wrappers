package web.url

import js.objects.JsPlainObject

@JsPlainObject
external interface URLPatternInit {
    val protocol: String?
    val username: String?
    val password: String?
    val hostname: String?
    val port: String?
    val pathname: String?
    val search: String?
    val hash: String?
    val baseURL: String?
}
