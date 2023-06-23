// Automatically generated - do not modify!

package web.audio

import web.events.EventTarget

/**
 * A generic interface for representing an audio processing module. Examples include:
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode)
 */
sealed external class AudioNode :
    EventTarget {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/channelCount) */
    var channelCount: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/channelCountMode) */
    var channelCountMode: ChannelCountMode

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/channelInterpretation) */
    var channelInterpretation: ChannelInterpretation

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/context) */
    val context: BaseAudioContext

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/numberOfInputs) */
    val numberOfInputs: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/numberOfOutputs) */
    val numberOfOutputs: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/connect) */
    fun connect(
        destinationNode: AudioNode,
        output: Number = definedExternally,
        input: Number = definedExternally,
    ): AudioNode

    fun connect(
        destinationParam: AudioParam,
        output: Number = definedExternally,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/disconnect) */
    fun disconnect()
    fun disconnect(output: Number)
    fun disconnect(destinationNode: AudioNode)
    fun disconnect(
        destinationNode: AudioNode,
        output: Number,
    )

    fun disconnect(
        destinationNode: AudioNode,
        output: Number,
        input: Number,
    )

    fun disconnect(destinationParam: AudioParam)
    fun disconnect(
        destinationParam: AudioParam,
        output: Number,
    )
}
