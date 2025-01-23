plugins {
    `java-base`
}

val compilerEmbeddableClasspath = configurations.detachedConfiguration(
    dependencies.create("org.jetbrains.kotlin:kotlin-compiler-embeddable:2.1.0")
)

val compilerClasspath = configurations.detachedConfiguration(
    dependencies.create("org.jetbrains.kotlin:kotlin-compiler:2.1.0"),
    dependencies.create("org.jetbrains.kotlin:kotlin-scripting-compiler:2.1.0")
)

val scriptClasspath = configurations.detachedConfiguration(
    dependencies.create("org.jetbrains.kotlin:kotlin-main-kts:2.1.0")
).apply {
    isTransitive = false
}

val preprocessWorkflows by tasks.registering {
    group = "github workflows"
}
file(".github/workflows")
    .listFiles { _, name -> name.endsWith(".main.kts") }!!
    .forEach { workflowScript ->
        val workflowName = workflowScript.name.removeSuffix(".main.kts")
        val pascalCasedWorkflowName = workflowName.replace("""-\w""".toRegex()) {
            it.value.substring(1).replaceFirstChar(Char::uppercaseChar)
        }.replaceFirstChar(Char::uppercaseChar)
        val determineImportedFiles =
            tasks.register<DetermineImportedFiles>("determineImportedFilesFor${pascalCasedWorkflowName}Workflow") {
                mainKtsFile = workflowScript
                importedFiles = layout.buildDirectory.file("importedFilesFor${pascalCasedWorkflowName}Workflow.txt")
                kotlinCompilerEmbeddableClasspath.from(compilerEmbeddableClasspath)
            }
        val preprocessWorkflow =
            tasks.register<PreprocessGithubWorkflow>("preprocess${pascalCasedWorkflowName}Workflow") {
                this.workflowScript = workflowScript
                importedFiles.from(determineImportedFiles.flatMap { it.importedFiles }.map { it.asFile.readLines() })
                kotlinCompilerClasspath.from(compilerClasspath)
                mainKtsClasspath.from(scriptClasspath)
                javaLauncher = javaToolchains.launcherFor {
                    languageVersion.set(JavaLanguageVersion.of(17))
                }
            }
        preprocessWorkflows {
            dependsOn(preprocessWorkflow)
        }
    }
