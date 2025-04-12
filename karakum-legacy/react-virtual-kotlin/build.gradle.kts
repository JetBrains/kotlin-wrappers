plugins {
    alias(kfc.plugins.library)
    alias(libs.plugins.seskar)
    `react-virtual-declarations`
}

dependencies {
    commonMainImplementation(npmv("@tanstack/react-virtual"))

    commonMainImplementation(kotlinWrappers.browser)
    jsMainImplementation(kotlinWrappers.reactCore)
}

val syncCoreWrappers by tasks.registering(SyncWrappers::class) {
    from(jsGeneratedDir) {
        include("tanstack/virtual/")
    }
    into(kotlinWrappersDir("kotlin-tanstack-virtual-core"))
}

val syncReactWrappers by tasks.registering(SyncWrappers::class) {
    from(jsGeneratedDir) {
        include("tanstack/react/")
    }
    into(kotlinWrappersDir("kotlin-tanstack-react-virtual"))
}

val syncWithWrappers by tasks.registering {
    dependsOn(syncCoreWrappers)
    dependsOn(syncReactWrappers)
}
