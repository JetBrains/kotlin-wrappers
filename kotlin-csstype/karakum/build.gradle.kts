plugins {
    id("karakum.csstype-declarations")
}

dependencies {
    webMainImplementation(npm(jspkg.csstype))
}

tasks.register<SyncWrappers>("syncCssomCore") {
    from(webGeneratedDir) {
        include("web/cssom/**")
    }

    into(webMainDir("kotlin-cssom-core"))
}
