plugins {
    kotlin("js")
    kotlin("plugin.serialization")
    `publishing-conventions`
}

dependencies {
    api(project(":kotlin-extensions"))
    api(kotlinxSerialization("runtime-js"))

    api(npm("redux", npmVersion("redux")))
}
