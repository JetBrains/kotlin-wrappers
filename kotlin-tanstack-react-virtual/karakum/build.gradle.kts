plugins {
    id("generatorbuild.karakum-conventions")
}

karakum {
    library(jspkg.tanstack.reactVirtual)
    output = layout.projectDirectory.dir("../src/jsMain/generated")
}
