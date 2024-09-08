plugins {
    `kotlin-conventions`
}

// WA for reexport in app
tasks.jsProductionExecutableCompileSync {
    doLast {
        val entryFile = destinationDirectory.get()
            .resolve("react-lazy-modules-webpack.mjs")

        val newContent = entryFile.readText()
            .replace("\nexport * from './", "\n// export * from './")
        entryFile.writeText(newContent)
    }
}

dependencies {
    jsMainImplementation(libs.wrappers.emotion)
    jsMainImplementation(libs.wrappers.js)
    jsMainImplementation(libs.wrappers.react)
    jsMainImplementation(libs.wrappers.reactUse)
    jsMainImplementation(libs.wrappers.reactDom)
    jsMainImplementation(libs.wrappers.reactRouterDom)
}
