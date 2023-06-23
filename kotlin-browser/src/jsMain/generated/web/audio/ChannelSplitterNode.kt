// Automatically generated - do not modify!

package web.audio

/**
 * The ChannelSplitterNode interface, often used in conjunction with its opposite, ChannelMergerNode, separates the different channels of an audio source into a set of mono outputs. This is useful for accessing each channel separately, e.g. for performing channel mixing where gain must be separately controlled on each channel.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ChannelSplitterNode)
 */
external class ChannelSplitterNode(
    context: BaseAudioContext,
    options: ChannelSplitterOptions = definedExternally,
) : AudioNode
