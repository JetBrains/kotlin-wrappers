// Automatically generated - do not modify!

package web.codecs

import seskar.js.JsValue

sealed external interface AudioSampleFormat {
    companion object {
        @JsValue("f32")
        val f32: AudioSampleFormat

        @JsValue("f32-planar")
        val f32Planar: AudioSampleFormat

        @JsValue("s16")
        val s16: AudioSampleFormat

        @JsValue("s16-planar")
        val s16Planar: AudioSampleFormat

        @JsValue("s32")
        val s32: AudioSampleFormat

        @JsValue("s32-planar")
        val s32Planar: AudioSampleFormat

        @JsValue("u8")
        val u8: AudioSampleFormat

        @JsValue("u8-planar")
        val u8Planar: AudioSampleFormat
    }
}
