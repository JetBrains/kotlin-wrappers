plugins {
    id("karakum.tanstack-table-declarations")
}

kotlin {
    sourceSets.webMain.dependencies {
        npm(jspkg.tanstack.reactTable)
    }
}

tasks.register<SyncWrappers>("syncTableCore") {
    from(webGeneratedDir) {
        include("tanstack/table/")
    }
    into(webMainDir("kotlin-tanstack-table-core"))
}
