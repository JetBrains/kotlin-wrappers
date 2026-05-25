plugins {
    id("karakum.csstype-declarations")
}

dependencies {
    webMainImplementation(npm(jspkg.csstype))
}

val syncCssomCore by tasks.registering(SyncWrappers::class) {
    from(webGeneratedDir) {
        include("web/cssom/**")
    }

    into(webMainDir("kotlin-cssom-core"))
}
