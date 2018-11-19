dependencies {
    val kotlinxCoroutinesVersion = rootProject.extra.get("kotlinx_coroutines_version")

    compile(project(":kotlin-extensions"))
    compile("org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinxCoroutinesVersion")
    compile("org.jetbrains.kotlinx:kotlinx-coroutines-core-common:$kotlinxCoroutinesVersion")
    compile("org.jetbrains.kotlinx:kotlinx-coroutines-core-js:$kotlinxCoroutinesVersion")
}
