// Automatically generated - do not modify!

package web.audio

import web.events.EventTarget
import kotlin.js.definedExternally

/**
 * The **`AudioNode`** interface is a generic interface for representing an audio processing module.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode)
 */
open external class AudioNode
private constructor() :
    EventTarget {
    /**
     * The **`channelCount`** property of the AudioNode interface represents an integer used to determine how many channels are used when up-mixing and down-mixing connections to any inputs to the node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/channelCount)
     */
    var channelCount: Int

    /**
     * The **`channelCountMode`** property of the AudioNode interface represents an enumerated value describing the way channels must be matched between the node's inputs and outputs.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/channelCountMode)
     */
    var channelCountMode: ChannelCountMode

    /**
     * The **`channelInterpretation`** property of the AudioNode interface represents an enumerated value describing how input channels are mapped to output channels when the number of inputs/outputs is different. For example, this setting defines how a mono input will be up-mixed to a stereo or 5.1 channel output, or how a quad channel input will be down-mixed to a stereo or mono output.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/channelInterpretation)
     */
    var channelInterpretation: ChannelInterpretation

    /**
     * The read-only **`context`** property of the AudioNode interface returns the associated BaseAudioContext, that is the object representing the processing graph the node is participating in.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/context)
     */
    val context: BaseAudioContext

    /**
     * The **`numberOfInputs`** property of the AudioNode interface returns the number of inputs feeding the node. Source nodes are defined as nodes having a numberOfInputs property with a value of 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/numberOfInputs)
     */
    val numberOfInputs: Int

    /**
     * The **`numberOfOutputs`** property of the AudioNode interface returns the number of outputs coming out of the node. Destination nodes — like AudioDestinationNode — have a value of 0 for this attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/numberOfOutputs)
     */
    val numberOfOutputs: Int

    /**
     * The **`connect()`** method of the AudioNode interface lets you connect one of the node's outputs to a target, which may be either another AudioNode (thereby directing the sound data to the specified node) or an AudioParam, so that the node's output data is automatically used to change the value of that parameter over time.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/connect)
     */
    fun connect(
        destinationNode: AudioNode,
        output: Int = definedExternally,
        input: Int = definedExternally,
    ): AudioNode

    fun connect(
        destinationParam: AudioParam,
        output: Int = definedExternally,
    )

    /**
     * The **`disconnect()`** method of the AudioNode interface lets you disconnect one or more nodes from the node on which the method is called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/disconnect)
     */
    fun disconnect()
    fun disconnect(output: Int)
    fun disconnect(destinationNode: AudioNode)
    fun disconnect(
        destinationNode: AudioNode,
        output: Int,
    )

    fun disconnect(
        destinationNode: AudioNode,
        output: Int,
        input: Int,
    )

    fun disconnect(destinationParam: AudioParam)
    fun disconnect(
        destinationParam: AudioParam,
        output: Int,
    )
}
