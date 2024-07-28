plugins {
    `kotlin-legacy-library-conventions`
    kotlin("plugin.serialization")
}

dependencies {
    jsMainApi(projects.kotlinExtensions)
    jsMainApi(projects.kotlinJs)
    jsMainApi(kotlinx.serialization.json)

    jsMainApi(npmv("redux"))
}
