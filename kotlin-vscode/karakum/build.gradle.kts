plugins {
    id("karakum.vscode-declarations")
}

dependencies {
    commonMainImplementation(npm(jspkg.types.vscode))
}

val syncVscode by tasks.registering(SyncWrappers::class) {
    from(commonGeneratedDir)
    into(kotlinWrappersCommonDir("kotlin-vscode"))
}
