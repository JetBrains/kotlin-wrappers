plugins {
    alias(kfc.plugins.library)
    alias(libs.plugins.seskar)
    `react-declarations`
}

dependencies {
    commonMainImplementation(npmv("@types/react"))

    commonMainImplementation(kotlinWrappers.browser)
    jsMainImplementation(kotlinWrappers.reactCore)
}

val syncWithWrappers by tasks.registering(SyncWrappers::class) {
    from(jsGeneratedDir)
    into(kotlinWrappersDir("kotlin-react-dom"))
}
