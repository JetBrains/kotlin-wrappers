// Automatically generated - do not modify!

package web.codecs

import js.buffer.AllowSharedBufferSource
import js.core.JsLong
import js.transferable.Transferable

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData)
 */
external class AudioData(
    init: AudioDataInit,
) : Transferable {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/duration)
     */
    val duration: JsLong

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/format)
     */
    val format: AudioSampleFormat?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/numberOfChannels)
     */
    val numberOfChannels: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/numberOfFrames)
     */
    val numberOfFrames: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/sampleRate)
     */
    val sampleRate: Float

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/timestamp)
     */
    val timestamp: JsLong

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/allocationSize)
     */
    fun allocationSize(options: AudioDataCopyToOptions): Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/clone)
     */
    fun clone(): AudioData

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/close)
     */
    fun close()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/copyTo)
     */
    fun copyTo(
        destination: AllowSharedBufferSource,
        options: AudioDataCopyToOptions,
    )
}
