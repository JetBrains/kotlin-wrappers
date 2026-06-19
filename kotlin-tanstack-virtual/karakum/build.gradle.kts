plugins {
    id("karakum.tanstack-virtual-declarations")
}

dependencies {
    webMainImplementation(npm(jspkg.tanstack.reactVirtual))
}

tasks.register<SyncWrappers>("syncCoreWrappers") {
    from(jsGeneratedDir) {
        include("tanstack/virtual/")
    }
    into(jsMainDir("kotlin-tanstack-virtual-core"))
}

tasks.register<SyncWrappers>("syncReactWrappers") {
    from(jsGeneratedDir) {
        include("tanstack/react/")
    }
    into(jsMainDir("kotlin-tanstack-react-virtual"))
}
