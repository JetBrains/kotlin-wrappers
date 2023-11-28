plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(projects.kotlinExtensions)
    jsMainApi(projects.kotlinJs)
    jsMainApi(kotlinxSerialization("json"))

    jsMainApi(npmv("redux"))
}
