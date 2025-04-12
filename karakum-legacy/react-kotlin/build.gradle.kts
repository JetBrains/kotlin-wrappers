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

val syncReactDom by tasks.registering(SyncWrappers::class) {
    from(jsGeneratedDir)
    into(kotlinWrappersDir("kotlin-react-dom"))
}

val generate by tasks.registering {
    dependsOn(syncReactDom)
}
