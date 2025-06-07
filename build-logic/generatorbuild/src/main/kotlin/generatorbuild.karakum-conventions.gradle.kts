plugins {
    id("io.github.sgrishchenko.karakum")
}

karakum {
    output = layout.projectDirectory.dir("../src/commonMain/generated")
}

extensions.create<NpmStrictDependencyExtension>("npmStrict")
