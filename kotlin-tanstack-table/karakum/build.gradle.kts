plugins {
    id("karakum.tanstack-table-declarations")
}

dependencies {
    webMainImplementation(npm(jspkg.tanstack.reactTable))
}

val syncTableCore by tasks.registering(SyncWrappers::class) {
    from(webGeneratedDir) {
        include("tanstack/table/")
    }
    into(webMainDir("kotlin-tanstack-table-core"))
}
