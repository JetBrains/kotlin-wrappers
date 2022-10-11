package web.url

import web.buffer.Blob
import org.w3c.dom.mediasource.MediaSource

external class URL : org.w3c.dom.url.URL {
    constructor(url: String, base: String = definedExternally)
    constructor(url: URL, base: URL = definedExternally)

    companion object {
        fun createObjectURL(obj: Blob): String
        fun createObjectURL(obj: MediaSource): String
        fun revokeObjectURL(url: String)
    }
}
