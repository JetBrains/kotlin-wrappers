package mdn.audioworklet.example

import web.audio.AudioParamName
import web.audio.AudioWorkletProcessorName

internal val HISS_GENERATOR: AudioWorkletProcessorName =
    AudioWorkletProcessorName("hiss-generator")

internal val GAIN: AudioParamName =
    AudioParamName("gain")
