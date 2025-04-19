plugins {
    id("npm-versions")
    id("io.github.turansky.kfc.library")
}

tasks.named<Delete>("clean") {
    delete("src")
}

val generateDeclarations by tasks.registering {
    dependsOn(":kotlinNpmInstall")
}

val generate by tasks.registering {}

tasks.withType<SyncWrappers> {
    dependsOn(generateDeclarations)

    generate.get().dependsOn(this)
}
