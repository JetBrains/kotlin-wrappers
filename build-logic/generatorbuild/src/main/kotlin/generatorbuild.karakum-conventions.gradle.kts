plugins {
    id("generatorbuild.kotlin-config-conventions")
    id("io.github.sgrishchenko.karakum")
}

karakum {
    output = layout.projectDirectory.dir("../src/webMain/generated")
}
