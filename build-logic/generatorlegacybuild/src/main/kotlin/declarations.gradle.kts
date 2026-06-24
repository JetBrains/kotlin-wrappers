// WA for Kotlin 2.4.20
pluginManager.apply("io.github.turansky.kfc.library")

val generateDeclarations = tasks.register("generateDeclarations") {
    dependsOn(":kotlinNpmInstall")
}

val generate = tasks.register("generate")

tasks.withType<SyncWrappers> {
    dependsOn(generateDeclarations)

    generate.get().dependsOn(this)
}
