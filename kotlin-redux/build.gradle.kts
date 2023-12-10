plugins {
    `kotlin-legacy-library-conventions`
    kotlin("plugin.serialization")
}

dependencies {
    jsMainApi(projects.kotlinExtensions)
    jsMainApi(projects.kotlinJs)
    jsMainApi(kotlinxSerialization("json"))

    jsMainApi(npmv("redux"))
}
