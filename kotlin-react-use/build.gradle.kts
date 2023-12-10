plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinReact)

    jsMainImplementation(kotlinxCoroutines("core"))
}
