plugins {
    kotlin("js")
    kotlin("plugin.serialization")
    `npm-publishing-conventions`
}

dependencies {
    compile(project(":kotlin-extensions"))
    compile(kotlinxSerialization("runtime-js"))
}
