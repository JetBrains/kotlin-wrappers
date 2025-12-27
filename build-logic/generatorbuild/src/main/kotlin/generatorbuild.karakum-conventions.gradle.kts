plugins {
    id("io.github.sgrishchenko.karakum")
}

karakum {
    output = layout.projectDirectory.dir("../src/webMain/generated")
}
