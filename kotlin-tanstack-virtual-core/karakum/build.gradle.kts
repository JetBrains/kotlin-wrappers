plugins {
    id("generatorbuild.karakum-conventions")
}

karakum {
    library(jspkg.tanstack.virtualCore)
    output = layout.projectDirectory.dir("../src/jsMain/generated")
}
