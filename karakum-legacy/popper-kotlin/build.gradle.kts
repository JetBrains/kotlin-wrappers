plugins {
    alias(kfc.plugins.library)
    alias(libs.plugins.seskar)
    `popper-declarations`
}

dependencies {
    commonMainImplementation(npmv("@popperjs/core"))

    commonMainImplementation(kotlinWrappers.browser)
}

val syncPopperjsCore by tasks.registering(SyncWrappers::class) {
    from(commonGeneratedDir)
    into(kotlinWrappersCommonDir("kotlin-popperjs-core"))
}

val generate by tasks.registering {
    dependsOn(syncPopperjsCore)
}
