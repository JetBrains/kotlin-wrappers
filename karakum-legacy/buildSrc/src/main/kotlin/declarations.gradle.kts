tasks.named<Delete>("clean") {
    delete("src")
}

val generateDeclarations by tasks.registering {
    dependsOn(":kotlinNpmInstall")
}

val generate by tasks.registering {}

tasks.withType<SyncWrappers>().configureEach {
    dependsOn(generateDeclarations)

    generate.get().dependsOn(this)
}
