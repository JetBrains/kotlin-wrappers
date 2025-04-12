tasks.named<Delete>("clean") {
    delete("src")
}

val generateDeclarations by tasks.registering {
    dependsOn(":kotlinNpmInstall")
}

val compileTasks = listOfNotNull(
    tasks.getByPath("compileKotlinMetadata"),
    tasks.getByPath("compileKotlinJs"),
    tasks.findByPath("compileKotlinWasmJs"),
)

for (task in compileTasks) {
    task.dependsOn(generateDeclarations)
}
