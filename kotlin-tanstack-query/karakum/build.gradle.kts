plugins {
    id("karakum.tanstack-query-declarations")
}

dependencies {
    webMainImplementation(npm(jspkg.tanstack.reactQuery))
}

tasks.register<SyncWrappers>("syncCoreWrappers") {
    from(jsGeneratedDir) {
        include("tanstack/query/")
    }
    into(jsMainDir("kotlin-tanstack-query-core"))
}

tasks.register<SyncWrappers>("syncReactWrappers") {
    from(jsGeneratedDir) {
        include("tanstack/react/")
    }
    into(jsMainDir("kotlin-tanstack-react-query"))
}
