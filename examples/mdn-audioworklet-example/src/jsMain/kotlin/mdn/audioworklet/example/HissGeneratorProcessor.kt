package mdn.audioworklet.example

import js.array.ReadonlyArray
import js.objects.ReadonlyRecord
import js.typedarrays.Float32Array
import web.audio.AudioParamDescriptor
import web.audio.AudioParamName
import web.audio.AudioWorkletProcessor
import web.audio.AudioWorkletProcessorReference
import kotlin.random.Random

/**
 * Adds hiss into each channel.
 *
 * @class HissGeneratorProcessor
 * @extends AudioWorkletProcessor
 **/
class HissGeneratorProcessor : AudioWorkletProcessor() {
    /**
     * Called by the browser's audio subsystem with
     * packets of audio data to be processed.
     *
     * @param inputs    Array of inputs
     * @param outputs   Array of outputs
     * @param parameters   Parameters object
     *
     * `inputList` and `outputs` are each arrays of inputs
     * or outputs, each of which is in turn an array of `Float32Array`s,
     * each of which contains the audio data for one channel (left/right/etc)
     * for the current sample packet.
     *
     * `parameters` is an object containing the `AudioParam` values
     * for the current block of audio data.
     **/

    override fun process(
        inputs: ReadonlyArray<ReadonlyArray<Float32Array<*>>>,
        outputs: ReadonlyArray<ReadonlyArray<Float32Array<*>>>,
        parameters: ReadonlyRecord<AudioParamName, Float32Array<*>>,
    ): Boolean {
        val gain = parameters[GAIN]!![0]
        val sourceLimit = minOf(inputs.size, outputs.size)

        for (inputNum in 0 until sourceLimit) {
            val input = inputs[inputNum]
            val output = outputs[inputNum]
            val channelCount = minOf(input.size, output.size)

            // The input list and output list are each arrays of
            // Float32Array objects, each of which contains the
            // samples for one channel.

            for (channel in 0 until channelCount) {
                val sampleCount = input[channel].length

                for (i in 0 until sampleCount) {
                    var sample = input[channel][i]
                    val rnd = 2 * (Random.nextDouble() - 0.5) // Range: -1 to 1

                    sample += rnd.toFloat() * gain

                    // Prevent clipping

                    if (sample > 1.0) {
                        sample = 1.0f
                    } else if (sample < -1.0) {
                        sample = -1.0f
                    }

                    output[channel][i] = sample
                }
            }
        }

        // Return; let the system know we're still active
        // and ready to process audio.

        return true
    }

    companion object : AudioWorkletProcessorReference(
        value = HissGeneratorProcessor::class.js,
        parameterDescriptors = arrayOf(
            AudioParamDescriptor(
                name = GAIN,
                defaultValue = 0.2f,
                minValue = 0f,
                maxValue = 1f,
            )
        )
    ) {
        init {
            // WA to force Kotlin/JS don't remove class members (like `process`)  
            requireNotNull(::HissGeneratorProcessor)
        }
    }
}
