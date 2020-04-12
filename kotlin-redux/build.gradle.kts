plugins {
    kotlin("js")
    kotlin("plugin.serialization")
    `npm-publishing-conventions`
}

dependencies {
    implementation(project(":kotlin-extensions"))
    implementation(kotlinxSerialization("runtime-js"))
}
