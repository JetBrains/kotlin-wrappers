plugins {
    id("karakum.popper-declarations")
}

kotlin {
    sourceSets.webMain.dependencies {
        implementation(npm(jspkg.popperjs.core))
    }
}

tasks.register<SyncWrappers>("syncPopperjsCore") {
    from(webGeneratedDir)
    into(webMainDir("kotlin-popperjs-core"))
}
