// Automatically generated - do not modify!

package web.audio

/**
 * The **`AudioDestinationNode`** interface represents the end destination of an audio graph in a given context — usually the speakers of your device. It can also be the node that will "record" the audio data when used with an OfflineAudioContext.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDestinationNode)
 */
open external class AudioDestinationNode
private constructor() :
    AudioNode {
    /**
     * The **`maxChannelCount`** property of the AudioDestinationNode interface is an unsigned long defining the maximum amount of channels that the physical device can handle.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDestinationNode/maxChannelCount)
     */
    val maxChannelCount: Int
}
