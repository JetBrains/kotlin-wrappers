plugins {
    id("karakum.react-dom-declarations")
}

dependencies {
    commonMainImplementation(npm(jspkg.types.react))
}

val syncReactDom by tasks.registering(SyncWrappers::class) {
    from(jsGeneratedDir)
    into(jsMainDir("kotlin-react-dom"))
}
