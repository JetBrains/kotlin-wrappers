plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinJs)

    jsMainImplementation(kotlinxCoroutines("core"))
}
