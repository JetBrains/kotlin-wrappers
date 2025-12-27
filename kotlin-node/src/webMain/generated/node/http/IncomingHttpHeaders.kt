// Automatically generated - do not modify!

package node.http

// incoming headers will never contain number
external interface IncomingHttpHeaders : node.Dict<Any /* string | string[] */> {
    var accept: String?

    @JsName("accept-encoding")
    var acceptEncoding: String?

    @JsName("accept-language")
    var acceptLanguage: String?

    @JsName("accept-patch")
    var acceptPatch: String?

    @JsName("accept-ranges")
    var acceptRanges: String?

    @JsName("access-control-allow-credentials")
    var accessControlAllowCredentials: String?

    @JsName("access-control-allow-headers")
    var accessControlAllowHeaders: String?

    @JsName("access-control-allow-methods")
    var accessControlAllowMethods: String?

    @JsName("access-control-allow-origin")
    var accessControlAllowOrigin: String?

    @JsName("access-control-expose-headers")
    var accessControlExposeHeaders: String?

    @JsName("access-control-max-age")
    var accessControlMaxAge: String?

    @JsName("access-control-request-headers")
    var accessControlRequestHeaders: String?

    @JsName("access-control-request-method")
    var accessControlRequestMethod: String?
    var age: String?
    var allow: String?

    @JsName("alt-svc")
    var altSvc: String?
    var authorization: String?

    @JsName("cache-control")
    var cacheControl: String?
    var connection: String?

    @JsName("content-disposition")
    var contentDisposition: String?

    @JsName("content-encoding")
    var contentEncoding: String?

    @JsName("content-language")
    var contentLanguage: String?

    @JsName("content-length")
    var contentLength: String?

    @JsName("content-location")
    var contentLocation: String?

    @JsName("content-range")
    var contentRange: String?

    @JsName("content-type")
    var contentType: String?
    var cookie: String?
    var date: String?
    var etag: String?
    var expect: String?
    var expires: String?
    var forwarded: String?
    var from: String?
    var host: String?

    @JsName("if-match")
    var ifMatch: String?

    @JsName("if-modified-since")
    var ifModifiedSince: String?

    @JsName("if-none-match")
    var ifNoneMatch: String?

    @JsName("if-unmodified-since")
    var ifUnmodifiedSince: String?

    @JsName("last-modified")
    var lastModified: String?
    var location: String?
    var origin: String?
    var pragma: String?

    @JsName("proxy-authenticate")
    var proxyAuthenticate: String?

    @JsName("proxy-authorization")
    var proxyAuthorization: String?

    @JsName("public-key-pins")
    var publicKeyPins: String?
    var range: String?
    var referer: String?

    @JsName("retry-after")
    var retryAfter: String?

    @JsName("sec-fetch-site")
    var secFetchSite: String?

    @JsName("sec-fetch-mode")
    var secFetchMode: String?

    @JsName("sec-fetch-user")
    var secFetchUser: String?

    @JsName("sec-fetch-dest")
    var secFetchDest: String?

    @JsName("sec-websocket-accept")
    var secWebsocketAccept: String?

    @JsName("sec-websocket-extensions")
    var secWebsocketExtensions: String?

    @JsName("sec-websocket-key")
    var secWebsocketKey: String?

    @JsName("sec-websocket-protocol")
    var secWebsocketProtocol: String?

    @JsName("sec-websocket-version")
    var secWebsocketVersion: String?

    @JsName("set-cookie")
    var setCookie: js.array.ReadonlyArray<String>?

    @JsName("strict-transport-security")
    var strictTransportSecurity: String?
    var tk: String?
    var trailer: String?

    @JsName("transfer-encoding")
    var transferEncoding: String?
    var upgrade: String?

    @JsName("user-agent")
    var userAgent: String?
    var vary: String?
    var via: String?
    var warning: String?

    @JsName("www-authenticate")
    var wwwAuthenticate: String?
}
