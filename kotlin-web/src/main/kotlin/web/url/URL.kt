package web.url

import org.w3c.dom.mediasource.MediaSource
import web.buffer.Blob

external class URL : org.w3c.dom.url.URL {
    constructor(
        url: String,
        base: String = definedExternally,
    )

    constructor(
        url: URL,
        base: URL = definedExternally,
    )

    companion object {
        fun createObjectURL(obj: Blob): String
        fun createObjectURL(obj: MediaSource): String
        fun revokeObjectURL(url: String)
    }
}
