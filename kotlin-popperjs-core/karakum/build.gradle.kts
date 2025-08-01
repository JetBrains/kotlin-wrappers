plugins {
    id("karakum.popper-declarations")
}

dependencies {
    commonMainImplementation(npm(jspkg.popperjs.core))
}

val syncPopperjsCore by tasks.registering(SyncWrappers::class) {
    from(webGeneratedDir)
    into(webMainDir("kotlin-popperjs-core"))
}
