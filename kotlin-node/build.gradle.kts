plugins {
    kotlin("js")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    api(project(":kotlin-js"))
    api(project(":kotlin-web"))
    implementation(kotlinxCoroutines("core"))

    api(devNpmv("@types/node"))
}
