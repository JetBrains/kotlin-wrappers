// Automatically generated - do not modify!

package web.media.session

import seskar.js.JsValue

sealed external interface MediaSessionAction {
    companion object {
        @JsValue("nexttrack")
        val nexttrack: MediaSessionAction

        @JsValue("pause")
        val pause: MediaSessionAction

        @JsValue("play")
        val play: MediaSessionAction

        @JsValue("previoustrack")
        val previoustrack: MediaSessionAction

        @JsValue("seekbackward")
        val seekbackward: MediaSessionAction

        @JsValue("seekforward")
        val seekforward: MediaSessionAction

        @JsValue("seekto")
        val seekto: MediaSessionAction

        @JsValue("skipad")
        val skipad: MediaSessionAction

        @JsValue("stop")
        val stop: MediaSessionAction
    }
}
