plugins {
    id("generatorbuild.karakum-conventions")
}

dependencies {
    jsMainImplementation(npm(jspkg.types.node))
}
