// Automatically generated - do not modify!

package web.audio

import web.events.EventTarget

sealed external class AudioNode :
    EventTarget {
    var channelCount: Int
    var channelCountMode: ChannelCountMode
    var channelInterpretation: ChannelInterpretation
    val context: BaseAudioContext
    val numberOfInputs: Int
    val numberOfOutputs: Int
    fun connect(
        destinationNode: AudioNode,
        output: Number = definedExternally,
        input: Number = definedExternally,
    ): AudioNode

    fun connect(
        destinationParam: AudioParam,
        output: Number = definedExternally,
    )

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
