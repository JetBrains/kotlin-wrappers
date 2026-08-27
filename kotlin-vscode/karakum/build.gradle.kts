plugins {
    id("karakum.vscode-declarations")
}

kotlin {
    sourceSets.webMain.dependencies {
        implementation(npm(jspkg.types.vscode))
    }
}

tasks.register<SyncWrappers>("syncVscode") {
    from(webGeneratedDir)
    into(webMainDir("kotlin-vscode"))
}
