plugins {
    id("karakum.vscode-declarations")
}

dependencies {
    webMainImplementation(npm(jspkg.types.vscode))
}

tasks.register<SyncWrappers>("syncVscode") {
    from(webGeneratedDir)
    into(webMainDir("kotlin-vscode"))
}
