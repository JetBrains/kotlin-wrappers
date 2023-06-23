// Automatically generated - do not modify!

package web.audio

/**
 * AudioDestinationNode has no output (as it is the output, no more AudioNode can be linked after it in the audio graph) and one input. The number of channels in the input must be between 0 and the maxChannelCount value or an exception is raised.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDestinationNode)
 */
sealed external class AudioDestinationNode :
    AudioNode {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDestinationNode/maxChannelCount) */
    val maxChannelCount: Int
}
