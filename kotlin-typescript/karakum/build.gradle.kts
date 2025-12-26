plugins {
    id("generatorbuild.karakum-conventions")
}

dependencies {
    jsMainImplementation(npm(jspkg.typescript))
}
