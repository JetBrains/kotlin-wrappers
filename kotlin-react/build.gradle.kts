plugins {
    kotlin("js")
    `npm-publishing-conventions`
}

dependencies {
    compile(project(":kotlin-extensions"))

    compile(kotlinxCoroutines("core"))
    compile(kotlinxCoroutines("core-common"))
    compile(kotlinxCoroutines("core-js"))
}
