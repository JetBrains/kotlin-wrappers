plugins {
    alias(kfc.plugins.library)
    alias(libs.plugins.seskar)
    `csstype-declarations`
}

dependencies {
    commonMainImplementation(npmv("csstype"))

    commonMainImplementation(kotlinWrappers.js)
}

val syncWithWrappers by tasks.registering(SyncWrappers::class) {
    from(commonGeneratedDir) {
        include("web/cssom/**")
    }

    into(kotlinWrappersCommonDir("kotlin-cssom-core"))
}
