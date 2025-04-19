plugins {
    `csstype-declarations`
}

dependencies {
    commonMainImplementation(npmv("csstype"))
}

val syncCssomCore by tasks.registering(SyncWrappers::class) {
    from(commonGeneratedDir) {
        include("web/cssom/**")
    }

    into(kotlinWrappersCommonDir("kotlin-cssom-core"))
}
