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
    jsMainImplementation(kotlinWrappers.emotion)
    jsMainImplementation(kotlinWrappers.js)
    jsMainImplementation(kotlinWrappers.react)
    jsMainImplementation(kotlinWrappers.reactUse)
    jsMainImplementation(kotlinWrappers.reactDom)
    jsMainImplementation(kotlinWrappers.reactRouterDom)
}
