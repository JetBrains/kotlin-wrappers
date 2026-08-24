// Automatically generated - do not modify!

package web.codecs

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.BufferSource
import js.numbers.Int53
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/AudioData#init)
 */
@JsPlainObject
external interface AudioDataInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/AudioData#data)
     */
    var data: BufferSource

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/AudioData#format)
     */
    var format: AudioSampleFormat

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/AudioData#numberofchannels)
     */
    var numberOfChannels: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/AudioData#numberofframes)
     */
    var numberOfFrames: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/AudioData#samplerate)
     */
    var sampleRate: Float

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/AudioData#timestamp)
     */
    var timestamp: Int53

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/AudioData#transfer)
     */
    var transfer: ReadonlyArray<ArrayBuffer>?
}
