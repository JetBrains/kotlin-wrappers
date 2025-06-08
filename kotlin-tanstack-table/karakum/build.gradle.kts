plugins {
    id("karakum.tanstack-table-declarations")
}

dependencies {
    commonMainImplementation(npm(jspkg.tanstack.reactTable))
}

val syncTableCore by tasks.registering(SyncWrappers::class) {
    from(commonGeneratedDir) {
        include("tanstack/table/")
    }
    into(kotlinWrappersCommonDir("kotlin-tanstack-table-core"))
}
