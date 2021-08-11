plugins {
    kotlin("js")
    kotlin("plugin.serialization")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    api(project(":kotlin-extensions"))
    api(kotlinxSerialization("json"))

    api(npmv("redux"))
}
