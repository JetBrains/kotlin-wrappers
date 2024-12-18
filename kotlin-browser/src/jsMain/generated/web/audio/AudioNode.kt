// Automatically generated - do not modify!

package web.audio

import web.events.EventTarget

/**
 * A generic interface for representing an audio processing module. Examples include:
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode)
 */
open external class AudioNode
private constructor() :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/channelCount)
     */
    var channelCount: UInt

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/channelCountMode)
     */
    var channelCountMode: ChannelCountMode

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/channelInterpretation)
     */
    var channelInterpretation: ChannelInterpretation

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/context)
     */
    val context: BaseAudioContext

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/numberOfInputs)
     */
    val numberOfInputs: UInt

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/numberOfOutputs)
     */
    val numberOfOutputs: UInt

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/connect)
     */
    fun connect(
        destinationNode: AudioNode,
        output: UInt = definedExternally,
        input: UInt = definedExternally,
    ): AudioNode

    fun connect(
        destinationParam: AudioParam,
        output: UInt = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/disconnect)
     */
    fun disconnect()
    fun disconnect(output: UInt)
    fun disconnect(destinationNode: AudioNode)
    fun disconnect(
        destinationNode: AudioNode,
        output: UInt,
    )

    fun disconnect(
        destinationNode: AudioNode,
        output: UInt,
        input: UInt,
    )

    fun disconnect(destinationParam: AudioParam)
    fun disconnect(
        destinationParam: AudioParam,
        output: UInt,
    )
}
