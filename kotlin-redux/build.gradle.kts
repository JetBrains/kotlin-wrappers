apply {
    plugin("kotlinx-serialization")
}

dependencies {
    compile(project(":kotlin-extensions"))
    compile(Dependencies.kotlinxSerializationRuntimeJs)
}
