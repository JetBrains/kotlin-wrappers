plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization")
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinExtensions)
    jsMainApi(projects.kotlinJs)
    jsMainApi(kotlinxSerialization("json"))

    jsMainApi(npmv("redux"))
}
