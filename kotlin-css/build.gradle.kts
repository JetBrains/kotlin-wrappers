apply {
    plugin("kotlin-platform-common")
}

dependencies {
    compile(kotlin("stdlib-common"))
    testCompile(kotlin("test-common"))
    testCompile(kotlin("test-annotations-common"))
}

project("kotlin-css-js") {
    apply {
        plugin("kotlin-platform-js")
    }

    dependencies {
        compile(kotlin("stdlib-js"))
        compile(project(":kotlin-extensions"))
        testCompile(kotlin("test"))
        testCompile(kotlin("test-js"))
        "expectedBy"(project(":kotlin-css"))
    }
}

project("kotlin-css-jvm") {
    apply {
        plugin("kotlin-platform-jvm")
    }

    dependencies {
        compile(kotlin("stdlib-jdk8"))
        testCompile(kotlin("test"))
        testCompile(kotlin("test-junit"))
        "expectedBy"(project(":kotlin-css"))
    }
}
