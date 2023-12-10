plugins {
    id("kotlin-conventions")
    id("publish-conventions")
}

// TODO: move in `plugins` section
apply(plugin = "io.github.turansky.seskar")

dependencies {
    "jsMainImplementation"("io.github.turansky.seskar:seskar-core:${version("seskar")}")
}
