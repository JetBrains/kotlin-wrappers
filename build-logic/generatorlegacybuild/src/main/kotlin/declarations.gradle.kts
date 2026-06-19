plugins {
    id("npm-versions")
    id("io.github.turansky.kfc.library")
}

val generateDeclarations by tasks.register("generateDeclarations") {
    dependsOn(":kotlinNpmInstall")
}

val generate by tasks.register("generate")

tasks.withType<SyncWrappers> {
    dependsOn(generateDeclarations)

    generate.dependsOn(this)
}
