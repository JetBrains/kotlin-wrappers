plugins {
    id("karakum.tanstack-virtual-declarations")
}

kotlin {
    sourceSets.webMain.dependencies {
        npm(jspkg.tanstack.reactVirtual)
    }
}

tasks.register<SyncWrappers>("syncCoreWrappers") {
    from(webGeneratedDir) {
        include("tanstack/virtual/")
    }
    into(webMainDir("kotlin-tanstack-virtual-core"))
}

tasks.register<SyncWrappers>("syncReactWrappers") {
    from(webGeneratedDir) {
        include("tanstack/react/")
    }
    into(webMainDir("kotlin-tanstack-react-virtual"))
}
