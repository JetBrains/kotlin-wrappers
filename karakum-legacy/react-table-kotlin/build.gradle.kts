plugins {
    alias(kfc.plugins.library)
    alias(libs.plugins.seskar)
    `react-table-declarations`
}

dependencies {
    commonMainImplementation(npmv("@tanstack/react-table"))

    commonMainImplementation(kotlinWrappers.browser)
}

val syncWithWrappers by tasks.registering(SyncWrappers::class) {
    from(commonGeneratedDir) {
        include("tanstack/table/")
    }
    into(kotlinWrappersCommonDir("kotlin-tanstack-table-core"))
}
