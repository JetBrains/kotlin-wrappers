// Automatically generated - do not modify!

package web.audio

/**
 * The ChannelMergerNode interface, often used in conjunction with its opposite, ChannelSplitterNode, reunites different mono inputs into a single output. Each input is used to fill a channel of the output. This is useful for accessing each channels separately, e.g. for performing channel mixing where gain must be separately controlled on each channel.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ChannelMergerNode)
 */
external class ChannelMergerNode(
    context: BaseAudioContext,
    options: ChannelMergerOptions = definedExternally,
) : AudioNode
