plugins {
    id("karakum.vscode-declarations")
}

dependencies {
    commonMainImplementation(npm(jspkg.types.vscode))
}
