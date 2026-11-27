plugins {
    id("karakum.csstype-declarations")
}

kotlin {
    sourceSets.webMain.dependencies {
        npm(jspkg.csstype)
    }
}

tasks.register<SyncWrappers>("syncCssomCore") {
    from(webGeneratedDir) {
        include("web/cssom/**")
    }

    into(webMainDir("kotlin-cssom-core"))
}

tasks.register<SyncWrappers>("syncCssType") {
    from(webGeneratedDir) {
        include("csstype/**")
    }

    into(webMainDir("kotlin-csstype"))
}
