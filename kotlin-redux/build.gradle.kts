apply {
    plugin("kotlinx-serialization")
}

dependencies {
    val kotlinxSerializationVersion = rootProject.extra.get("kotlinx_serialization_version")

    compile(project(":kotlin-extensions"))
    compile("org.jetbrains.kotlinx:kotlinx-serialization-runtime-js:$kotlinxSerializationVersion")
}
