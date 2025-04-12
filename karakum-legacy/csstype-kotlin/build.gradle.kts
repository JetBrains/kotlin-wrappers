plugins {
    alias(kfc.plugins.library)
    alias(libs.plugins.seskar)
    `csstype-declarations`
}

dependencies {
    commonMainImplementation(npmv("csstype"))

    commonMainImplementation(kotlinWrappers.js)
}

val syncCssomCore by tasks.registering(SyncWrappers::class) {
    from(commonGeneratedDir) {
        include("web/cssom/**")
    }

    into(kotlinWrappersCommonDir("kotlin-cssom-core"))
}

val generate by tasks.registering {
    dependsOn(syncCssomCore)
}
