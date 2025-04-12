plugins {
    alias(kfc.plugins.library)
    `react-query-declarations`
}

dependencies {
    commonMainImplementation(npmv("@tanstack/react-query"))
}

val syncCoreWrappers by tasks.registering(SyncWrappers::class) {
    from(jsGeneratedDir) {
        include("tanstack/query/")
    }
    into(kotlinWrappersDir("kotlin-tanstack-query-core"))
}

val syncReactWrappers by tasks.registering(SyncWrappers::class) {
    from(jsGeneratedDir) {
        include("tanstack/react/")
    }
    into(kotlinWrappersDir("kotlin-tanstack-react-query"))
}

val generate by tasks.registering {
    dependsOn(syncCoreWrappers)
    dependsOn(syncReactWrappers)
}
