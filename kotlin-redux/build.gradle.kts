plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(project(":kotlin-extensions"))
    jsMainApi(project(":kotlin-js"))
    jsMainApi(kotlinxSerialization("json"))

    jsMainApi(npmv("redux"))
}
