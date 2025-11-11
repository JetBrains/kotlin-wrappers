package mdn.audioworklet.example

import web.audio.AudioWorkletModule
import web.audio.registerProcessor

val HissGeneratorWorkletModule = AudioWorkletModule { self ->
    self.registerProcessor(HISS_GENERATOR, HissGeneratorProcessor)
}
