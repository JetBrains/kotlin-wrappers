plugins {
    id("generatorbuild.karakum-conventions")
}

dependencies {
    // TODO: temporal solution, bump Arrow version after stable release
    jsMainImplementation("io.arrow-kt:arrow-core:2.2.0-beta.3")
    jsMainImplementation(npm(jspkg.electron))
}
