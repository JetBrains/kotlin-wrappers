package web.url

import web.buffer.Blob

external class URL {
    constructor(
        url: String,
        base: String = definedExternally,
    )

    constructor(
        url: URL,
        base: URL = definedExternally,
    )

    var hash: String
    var host: String
    var hostname: String
    var href: String
    val origin: String
    var password: String
    var pathname: String
    var port: String
    var protocol: String
    var search: String
    val searchParams: URLSearchParams
    var username: String
    fun toJSON(): String

    companion object {
        fun createObjectURL(obj: Blob): String
        fun revokeObjectURL(url: String)
    }
}
