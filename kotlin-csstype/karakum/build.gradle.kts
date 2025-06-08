plugins {
    id("karakum.csstype-declarations")
}

dependencies {
    commonMainImplementation(npm(jspkg.csstype))
}

val syncCssomCore by tasks.registering(SyncWrappers::class) {
    from(commonGeneratedDir) {
        include("web/cssom/**")
    }

    into(kotlinWrappersCommonDir("kotlin-cssom-core"))
}
