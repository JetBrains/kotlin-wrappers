plugins {
    id("karakum.tanstack-query-declarations")
}

dependencies {
    commonMainImplementation(npm(jspkg.tanstack.reactQuery))
}

val syncCoreWrappers by tasks.registering(SyncWrappers::class) {
    from(jsGeneratedDir) {
        include("tanstack/query/")
    }
    into(jsMainDir("kotlin-tanstack-query-core"))
}

val syncReactWrappers by tasks.registering(SyncWrappers::class) {
    from(jsGeneratedDir) {
        include("tanstack/react/")
    }
    into(jsMainDir("kotlin-tanstack-react-query"))
}
