plugins {
    id("karakum.popper-declarations")
}

dependencies {
    webMainImplementation(npm(jspkg.popperjs.core))
}

tasks.register<SyncWrappers>("syncPopperjsCore") {
    from(webGeneratedDir)
    into(webMainDir("kotlin-popperjs-core"))
}
