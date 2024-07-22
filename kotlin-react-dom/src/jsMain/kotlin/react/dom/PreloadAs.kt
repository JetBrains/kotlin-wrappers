package react.dom

import seskar.js.JsValue

sealed external interface PreloadAs {
    companion object {
        @JsValue("audio")
        val audio: PreloadAs

        @JsValue("document")
        val document: PreloadAs

        @JsValue("embed")
        val embed: PreloadAs

        @JsValue("fetch")
        val fetch: PreloadAs

        @JsValue("font")
        val font: PreloadAs

        @JsValue("image")
        val image: PreloadAs

        @JsValue("object")
        val `object`: PreloadAs

        @JsValue("track")
        val track: PreloadAs

        @JsValue("script")
        val script: PreloadAs

        @JsValue("style")
        val style: PreloadAs

        @JsValue("video")
        val video: PreloadAs

        @JsValue("worker")
        val worker: PreloadAs
    }
}
