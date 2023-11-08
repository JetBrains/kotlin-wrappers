// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.http

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface RequestDestination {
    companion object {
        @JsValue("")
        val none: RequestDestination

        @JsValue("audio")
        val audio: RequestDestination

        @JsValue("audioworklet")
        val audioworklet: RequestDestination

        @JsValue("document")
        val document: RequestDestination

        @JsValue("embed")
        val embed: RequestDestination

        @JsValue("font")
        val font: RequestDestination

        @JsValue("frame")
        val frame: RequestDestination

        @JsValue("iframe")
        val iframe: RequestDestination

        @JsValue("image")
        val image: RequestDestination

        @JsValue("manifest")
        val manifest: RequestDestination

        @JsValue("object")
        val `object`: RequestDestination

        @JsValue("paintworklet")
        val paintworklet: RequestDestination

        @JsValue("report")
        val report: RequestDestination

        @JsValue("script")
        val script: RequestDestination

        @JsValue("sharedworker")
        val sharedworker: RequestDestination

        @JsValue("style")
        val style: RequestDestination

        @JsValue("track")
        val track: RequestDestination

        @JsValue("video")
        val video: RequestDestination

        @JsValue("worker")
        val worker: RequestDestination

        @JsValue("xslt")
        val xslt: RequestDestination
    }
}
