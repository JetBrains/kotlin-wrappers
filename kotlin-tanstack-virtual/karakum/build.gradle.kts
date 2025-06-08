plugins {
    id("karakum.tanstack-virtual-declarations")
}

dependencies {
    commonMainImplementation(npm(jspkg.tanstack.reactVirtual))
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
