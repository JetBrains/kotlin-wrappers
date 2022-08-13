plugins {
    kotlin("js")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    implementation(kotlinxCoroutines("core"))

    testImplementation(kotlin("test-js"))
}
