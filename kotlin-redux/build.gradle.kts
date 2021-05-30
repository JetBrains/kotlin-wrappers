plugins {
    kotlin("js")
    kotlin("plugin.serialization")
    `publish-conventions`
}

dependencies {
    api(project(":kotlin-extensions"))
    api(kotlinxSerialization("json"))

    api(npmv("redux"))
}
