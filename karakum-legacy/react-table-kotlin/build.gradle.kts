plugins {
    alias(kfc.plugins.library)
    alias(libs.plugins.seskar)
    `react-table-declarations`
}

dependencies {
    commonMainImplementation(npmv("@tanstack/react-table"))

    commonMainImplementation(kotlinWrappers.browser)
}

val syncTableCore by tasks.registering(SyncWrappers::class) {
    from(commonGeneratedDir) {
        include("tanstack/table/")
    }
    into(kotlinWrappersCommonDir("kotlin-tanstack-table-core"))
}

val generate by tasks.registering {
    dependsOn(syncTableCore)
}
