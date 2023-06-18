// Automatically generated - do not modify!

package web.url

import web.buffer.Blob

external class URL(
    url: String,
    base: String = definedExternally,
) {
    constructor(
        url: URL,
        base: String = definedExternally,
    )

    constructor(
        url: String,
        base: URL,
    )

    constructor(
        url: URL,
        base: URL,
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
        fun createObjectURL(obj: Blob /* | MediaSource */): String
        fun revokeObjectURL(url: String)
    }
}
