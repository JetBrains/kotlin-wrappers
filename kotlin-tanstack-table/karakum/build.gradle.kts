plugins {
    id("karakum.tanstack-table-declarations")
}

dependencies {
    webMainImplementation(npm(jspkg.tanstack.reactTable))
}

tasks.register<SyncWrappers>("syncTableCore") {
    from(webGeneratedDir) {
        include("tanstack/table/")
    }
    into(webMainDir("kotlin-tanstack-table-core"))
}
