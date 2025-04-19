plugins {
    id("karakum.react-dom-declarations")
}

dependencies {
    commonMainImplementation(npmv("@types/react"))
}

val syncReactDom by tasks.registering(SyncWrappers::class) {
    from(jsGeneratedDir)
    into(kotlinWrappersDir("kotlin-react-dom"))
}
