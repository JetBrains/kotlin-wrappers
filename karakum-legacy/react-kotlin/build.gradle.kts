plugins {
    alias(kfc.plugins.library)
    `react-declarations`
}

dependencies {
    commonMainImplementation(npmv("@types/react"))
}

val syncReactDom by tasks.registering(SyncWrappers::class) {
    from(jsGeneratedDir)
    into(kotlinWrappersDir("kotlin-react-dom"))
}

val generate by tasks.registering {
    dependsOn(syncReactDom)
}
